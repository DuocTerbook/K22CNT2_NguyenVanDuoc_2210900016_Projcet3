package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.springmvc.beans.Nvd_SanPham;

public class NvdSanPhamDao {
JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Nvd_SanPham p) {	    
	    String sql="INSERT INTO Nvd_SanPham (NvdTenSP, NvdSoLuong,NvdHinhAnh, NvdNgayNhap, NvdDVT, NvdDonGia ) VALUES"
	    		+ "('"+p.getNvdTenSP()+"',"+p.getNvdSoLuong()+",'"+ p.getNvdHinhAnh()+"','"+p.getNvdNgayNhap()+"','"+ p.getNvdDVT()+"','"+p.getNvdDonGia()+"' )";  
	    return template.update(sql);  
	}

	public int update(Nvd_SanPham p) {
	    String sql = "UPDATE Nvd_SanPham SET nvdTenSP = ?, nvdSoLuong = ?, nvdHinhAnh = ?, nvdNgayNhap = ?, nvdDVT = ?, nvdDonGia = ? WHERE id = ?";
	    return template.update(sql, p.getNvdTenSP(), p.getNvdSoLuong(), p.getNvdHinhAnh(), p.getNvdNgayNhap(),
	            p.getNvdDVT(), p.getNvdDonGia(), p.getId());
	}

	public int delete(int id) {
		String sql = "delete from Nvd_SanPham where id = ?";
		return template.update(sql, id);
	}

	public int deletegiohang(int id) {
		String sql = "delete from Nvd_SanPham where id = ?";
		return template.update(sql, id);
	}

	public Nvd_SanPham getEmpById(int id) {
		String sql = "select * from Nvd_SanPham where id = ?";
		return template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<>(Nvd_SanPham.class));
	}

	public List<Nvd_SanPham> getEmployees() {
	    String sql = "SELECT * FROM Nvd_SanPham";
	    return template.query(sql, new RowMapper<Nvd_SanPham>() {	        
			public Nvd_SanPham mapRow(ResultSet rs, int row) throws SQLException {
	            Nvd_SanPham e = new Nvd_SanPham();
	            e.setId(rs.getInt("id"));
	            e.setNvdTenSP(rs.getString("nvdTenSP"));
	            e.setNvdSoLuong(rs.getInt("nvdSoLuong"));
	            e.setNvdHinhAnh(rs.getString("nvdHinhAnh"));
	            e.setNvdNgayNhap(rs.getString("nvdNgayNhap"));
	            e.setNvdDVT(rs.getString("nvdDVT"));
	            e.setNvdDonGia(rs.getDouble("nvdDonGia"));
	            return e;
	        }
	    });
	}
}
