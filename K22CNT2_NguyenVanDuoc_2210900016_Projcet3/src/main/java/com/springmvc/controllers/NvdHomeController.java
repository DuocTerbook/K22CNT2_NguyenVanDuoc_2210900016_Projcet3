package com.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.beans.Nvd_GioHang;
import com.springmvc.beans.Nvd_KhachHang;
import com.springmvc.beans.Nvd_SanPham;
import com.springmvc.dao.NvdKhachHangDao;
import com.springmvc.dao.NvdSanPhamDao;

@Controller
public class NvdHomeController {

    @Autowired
    NvdSanPhamDao dao; // DAO xử lý sản phẩm
    @Autowired
    NvdKhachHangDao khachHangDao;
   
    // ======== 1️⃣ GIỎ HÀNG ========

    // Hiển thị giỏ hàng
    @GetMapping("/giohang")
    public String showCart(HttpSession session, Model model) {
        List<Nvd_GioHang> cartItems = (List<Nvd_GioHang>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("totalAmount", calculateTotal(cartItems));
        return "giohang";
    }

    // Thêm sản phẩm vào giỏ hàng
    @GetMapping("/add-to-cart")
    public String addToCart(@RequestParam int id,@RequestParam("tenSP") String nvdName, @RequestParam("hinhAnh")  String nvdHinhAnh,
    		@RequestParam("ngayNhap") String nvdNgayNhap,@RequestParam("dvt") String nvdDVT,@RequestParam("donGia") Float nvdGia, HttpSession session) {

        List<Nvd_GioHang> cartItems = (List<Nvd_GioHang>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }

        boolean exists = false;
        for (Nvd_GioHang item : cartItems) {
            if (item.getId() == id) {
                item.setNvdSoLuong(item.getNvdSoLuong() + 1);
                exists = true;
                break;
            }
        }

        if (!exists) {
            cartItems.add(new Nvd_GioHang(nvdName, nvdHinhAnh,nvdNgayNhap,nvdDVT, nvdGia, 1));
        }

        session.setAttribute("cartItems", cartItems);
        return "redirect:/giohang";
    }

    // Xóa sản phẩm khỏi giỏ hàng
    @GetMapping("/xoagiohang/{id}")
    public String deletegiohang(@PathVariable int id, HttpSession session) {
        List<Nvd_GioHang> cartItems = (List<Nvd_GioHang>) session.getAttribute("cartItems");
        if (cartItems != null) {
            cartItems.removeIf(item -> item.getId() == id);
            session.setAttribute("cartItems", cartItems);
        }
        return "redirect:/giohang";
    }

    // Tính tổng số tiền trong giỏ hàng
    private int calculateTotal(List<Nvd_GioHang> cartItems) {
        int total = 0;
        for (Nvd_GioHang item : cartItems) {
            total += item.getNvdGia() * item.getNvdSoLuong();
        }
        return total;
    }

    // ======== 2️⃣ QUẢN LÝ SẢN PHẨM ========

    // Hiển thị form thêm sản phẩm
    @GetMapping("/saveform")
    public String showform(Model m) {
        m.addAttribute("command", new Nvd_SanPham());
        return "saveform";
    }

    // Lưu sản phẩm mới
    @PostMapping("/save")
    public String save(@ModelAttribute("nvd_SanPham") Nvd_SanPham nvd_SanPham) {
        dao.save(nvd_SanPham);
        return "redirect:/viewform";
    }

    // Hiển thị danh sách sản phẩm
    @GetMapping("/viewform")
    public String viewProducts(Model m) {
        List<Nvd_SanPham> list = dao.getEmployees();
        m.addAttribute("list", list);
        return "viewform";
    }

    // Chỉnh sửa sản phẩm
    @GetMapping("/sua/{id}")
    public String edit(@PathVariable int id, Model m) {
        Nvd_SanPham sp = dao.getEmpById(id);
        m.addAttribute("command", sp);
        return "edit";
    }

    @PostMapping("/luu")
    public String update(@ModelAttribute("nvd_SanPham") Nvd_SanPham nvd_SanPham) {
        dao.update(nvd_SanPham);
        return "redirect:/viewform";
    }

    // Xóa sản phẩm
    @GetMapping("/xoa/{id}")
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/viewform";
    }   
    @PostMapping("/thanhtoan")
    public String thanhToan(@RequestParam String nvdHoTen, @RequestParam String nvdEmail,
                            @RequestParam String nvdSoDienThoai, @RequestParam String nvdDiaChi,
                            HttpSession session, Model model) {

        // Lấy giỏ hàng từ session
        List<Nvd_GioHang> cartItems = (List<Nvd_GioHang>) session.getAttribute("cartItems");
        
        if (cartItems == null || cartItems.isEmpty()) {
            model.addAttribute("error", "Giỏ hàng của bạn trống, không thể thanh toán.");
            return "redirect:/giohang";
        }

        // Tạo đối tượng khách hàng
        Nvd_KhachHang khachHang = new Nvd_KhachHang();
        khachHang.setNvdHoTen(nvdHoTen);
        khachHang.setNvdEmail(nvdEmail);
        khachHang.setNvdSoDienThoai(nvdSoDienThoai);
        khachHang.setNvdDiaChi(nvdDiaChi);
        khachHang.setNvdTrangThai(true); // Giả sử trạng thái mặc định là kích hoạt

        // Lưu thông tin khách hàng vào database
        khachHangDao.save(khachHang);

        // Xử lý đơn hàng (phần này bạn có thể thêm logic tạo đơn hàng nếu cần)

        // Xóa giỏ hàng sau khi thanh toán
        session.removeAttribute("cartItems");

        model.addAttribute("message", "Thanh toán thành công! Đơn hàng của bạn đang được xử lý.");
        return "thanhtoan_thanhcong"; // Điều hướng đến trang xác nhận thanh toán
    }
}
