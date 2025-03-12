package com.springmvc.controllers;

import com.springmvc.beans.Nvd_QuanTri;
import com.springmvc.dao.NvdQuanTriDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class NvdQuanTriController {

    @Autowired
    private NvdQuanTriDao quantridao;

    @GetMapping("/login")
    public String showLoginForm() {
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model) {
        Nvd_QuanTri admin = quantridao.getAdminByUsernameAndPassword(username, password);
        if (admin != null) {
            session.setAttribute("admin", admin);
            return "redirect:/admin/list";
        } else {
            model.addAttribute("error", "Sai tai khoan hoac mat khau!");
            return "admin/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/admin/login";
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "admin/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Nvd_QuanTri admin, Model model) {
        Nvd_QuanTri existingAdmin = quantridao.getAdminByUsernameAndPassword(admin.getNvdTaiKhoan(), admin.getNvdMatKhau());
        if (existingAdmin != null) {
            model.addAttribute("error", "Tai khoan da ton tai!");
            return "admin/register";
        }
        
        admin.setNvdTrangThai(true);
        quantridao.save(admin);
        return "redirect:/admin/login";
    }

    @GetMapping("/list")
    public String listAdmins(Model model, HttpSession session) {
        if (session.getAttribute("admin") == null) {
            return "redirect:/admin/login";
        }

        List<Nvd_QuanTri> list = quantridao.getAllAdmins();
        model.addAttribute("list", list);
        return "admin/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model, HttpSession session) {
        if (session.getAttribute("admin") == null) {
            return "redirect:/admin/login";
        }

        model.addAttribute("admin", new Nvd_QuanTri());
        return "admin/add";
    }

    @PostMapping("/add")
    public String addAdmin(@ModelAttribute Nvd_QuanTri admin) {
        admin.setNvdTrangThai(true);
        quantridao.save(admin);
        return "redirect:/admin/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model, HttpSession session) {
        if (session.getAttribute("admin") == null) {
            return "redirect:/admin/login";
        }

        Nvd_QuanTri admin = quantridao.getAdminById(id);
        model.addAttribute("admin", admin);
        return "admin/edit";
    }

    @PostMapping("/update")
    public String updateAdmin(@ModelAttribute Nvd_QuanTri admin) {
    	quantridao.update(admin);
        return "redirect:/admin/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable int id, HttpSession session) {
        if (session.getAttribute("admin") == null) {
            return "redirect:/admin/login";
        }

        quantridao.delete(id);
        return "redirect:/admin/list";
    }
}
