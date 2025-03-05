package com.springmvc.dao;

import com.springmvc.beans.Nvd_QuanTri;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class NvdQuanTriDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Phương thức thêm quản trị viên
    public int save(Nvd_QuanTri p) {
        String sql = "INSERT INTO Nvd_QuanTri (nvdTaiKhoan, nvdMatKhau, nvdTrangThai) VALUES (?, ?, ?)";
        return template.update(sql, p.getNvdTaiKhoan(), p.getNvdMatKhau(), p.isNvdTrangThai());
    }

    // Phương thức cập nhật thông tin quản trị viên
    public int update(Nvd_QuanTri p) {
        String sql = "UPDATE Nvd_QuanTri SET nvdTaiKhoan = ?, nvdMatKhau = ?, nvdTrangThai = ? WHERE id = ?";
        return template.update(sql, p.getNvdTaiKhoan(), p.getNvdMatKhau(), p.isNvdTrangThai(), p.getId());
    }

    // Phương thức xóa quản trị viên theo ID
    public int delete(int id) {
        String sql = "DELETE FROM Nvd_QuanTri WHERE id = ?";
        return template.update(sql, id);
    }

    // Lấy thông tin quản trị viên theo ID
    public Nvd_QuanTri getAdminById(int id) {
        String sql = "SELECT * FROM Nvd_QuanTri WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Nvd_QuanTri.class));
    }

    // Lấy danh sách tất cả quản trị viên
    public List<Nvd_QuanTri> getAllAdmins() {
        String sql = "SELECT * FROM Nvd_QuanTri";
        return template.query(sql, new RowMapper<Nvd_QuanTri>() {
            @Override
            public Nvd_QuanTri mapRow(ResultSet rs, int row) throws SQLException {
                Nvd_QuanTri e = new Nvd_QuanTri();
                e.setId(rs.getInt("id"));
                e.setNvdTaiKhoan(rs.getString("nvdTaiKhoan"));
                e.setNvdMatKhau(rs.getString("nvdMatKhau"));
                e.setNvdTrangThai(rs.getBoolean("nvdTrangThai"));
                return e;
            }
        });
    }

    // Lấy admin theo tài khoản và mật khẩu
    public Nvd_QuanTri getAdminByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM Nvd_QuanTri WHERE nvdTaiKhoan = ? AND nvdMatKhau = ?";
        try {
            return template.queryForObject(sql, new Object[]{username, password}, new BeanPropertyRowMapper<>(Nvd_QuanTri.class));
        } catch (Exception e) {
            return null;
        }
    }

    // Lấy admin theo tên tài khoản
    public Nvd_QuanTri getAdminByUsername(String username) {
        String sql = "SELECT * FROM Nvd_QuanTri WHERE nvdTaiKhoan = ?";
        try {
            return template.queryForObject(sql, new Object[]{username}, new BeanPropertyRowMapper<>(Nvd_QuanTri.class));
        } catch (Exception e) {
            return null;
        }
    }
}
