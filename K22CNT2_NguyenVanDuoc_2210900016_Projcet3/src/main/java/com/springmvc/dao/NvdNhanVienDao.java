package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.Nvd_NhanVien;

public class NvdNhanVienDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Nvd_NhanVien nv) {
        String sql = "INSERT INTO Nvd_NhanVien (NvdTenNV, NvdChucVu, NvdLuong) VALUES (?, ?, ?)";
        return template.update(sql, nv.getNvdTenNV(), nv.getNvdChucVu(), nv.getNvdLuong());
    }

    public int update(Nvd_NhanVien nv) {
        String sql = "UPDATE Nvd_NhanVien SET NvdTenNV = ?, NvdChucVu = ?, NvdLuong = ? WHERE id = ?";
        return template.update(sql, nv.getNvdTenNV(), nv.getNvdChucVu(), nv.getNvdLuong(), nv.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM Nvd_NhanVien WHERE id = ?";
        return template.update(sql, id);
    }

    public Nvd_NhanVien getNhanVienById(int id) {
        String sql = "SELECT * FROM Nvd_NhanVien WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Nvd_NhanVien.class));
    }

    public List<Nvd_NhanVien> getAllNhanVien() {
        return template.query("SELECT * FROM Nvd_NhanVien", new RowMapper<Nvd_NhanVien>() {
            public Nvd_NhanVien mapRow(ResultSet rs, int row) throws SQLException {
                Nvd_NhanVien nv = new Nvd_NhanVien();
                nv.setId(rs.getInt("id"));
                nv.setNvdTenNV(rs.getString("NvdTenNV"));
                nv.setNvdChucVu(rs.getString("NvdChucVu"));
                nv.setNvdLuong(rs.getDouble("NvdLuong"));
                return nv;
            }
        });
    }
}
