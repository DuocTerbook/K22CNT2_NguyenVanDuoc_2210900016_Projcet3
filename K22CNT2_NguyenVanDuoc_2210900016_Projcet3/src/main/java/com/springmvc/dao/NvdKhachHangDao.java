package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.beans.Nvd_KhachHang;

public class NvdKhachHangDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Nvd_KhachHang kh) {
        String sql = "INSERT INTO Nvd_KhachHang (NvdHoTen, NvdEmail, NvdSoDienThoai, NvdDiaChi, NvdTrangThai) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, kh.getNvdHoTen(), kh.getNvdEmail(), kh.getNvdSoDienThoai(), kh.getNvdDiaChi(), kh.isNvdTrangThai());
    }

    public int update(Nvd_KhachHang kh) {
        String sql = "UPDATE Nvd_KhachHang SET NvdHoTen = ?, NvdEmail = ?, NvdSoDienThoai = ?, NvdDiaChi = ?, NvdTrangThai = ? WHERE id = ?";
        return template.update(sql, kh.getNvdHoTen(), kh.getNvdEmail(), kh.getNvdSoDienThoai(), kh.getNvdDiaChi(), kh.isNvdTrangThai(), kh.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM Nvd_KhachHang WHERE id = ?";
        return template.update(sql, id);
    }

    public Nvd_KhachHang getKhachHangById(int id) {
        String sql = "SELECT * FROM Nvd_KhachHang WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Nvd_KhachHang.class));
    }

    public List<Nvd_KhachHang> getAllKhachHang() {
        String sql = "SELECT * FROM Nvd_KhachHang";
        return template.query(sql, new RowMapper<Nvd_KhachHang>() {
            public Nvd_KhachHang mapRow(ResultSet rs, int row) throws SQLException {
                Nvd_KhachHang kh = new Nvd_KhachHang();
                kh.setId(rs.getInt("id"));
                kh.setNvdHoTen(rs.getString("NvdHoTen"));
                kh.setNvdEmail(rs.getString("NvdEmail"));
                kh.setNvdSoDienThoai(rs.getString("NvdSoDienThoai"));
                kh.setNvdDiaChi(rs.getString("NvdDiaChi"));
                kh.setNvdTrangThai(rs.getBoolean("NvdTrangThai"));
                return kh;
            }
        });
    }
}
