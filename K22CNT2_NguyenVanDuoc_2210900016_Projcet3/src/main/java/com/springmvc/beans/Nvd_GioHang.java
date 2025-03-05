package com.springmvc.beans;

public class Nvd_GioHang {
	private int id;
    private String NvdName;
    private String NvdHinhAnh;
    private String NvdNgayNhap;
    private String NvdDVT;
    private Float NvdGia;
    private int NvdSoLuong;
    
    
	/**
	 * @param nvdName
	 * @param nvdHinhAnh
	 * @param nvdNgayNhap
	 * @param nvdDVT
	 * @param nvdGia
	 * @param nvdSoLuong
	 */
	public Nvd_GioHang(String nvdName, String nvdHinhAnh, String nvdNgayNhap, String nvdDVT, Float nvdGia,
			int nvdSoLuong) {
		super();
		NvdName = nvdName;
		NvdHinhAnh = nvdHinhAnh;
		NvdNgayNhap = nvdNgayNhap;
		NvdDVT = nvdDVT;
		NvdGia = nvdGia;
		NvdSoLuong = nvdSoLuong;
	}
	
	
	/**
	 * 
	 */
	public Nvd_GioHang() {
		super();
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nvdName
	 */
	public String getNvdName() {
		return NvdName;
	}
	/**
	 * @param nvdName the nvdName to set
	 */
	public void setNvdName(String nvdName) {
		NvdName = nvdName;
	}
	/**
	 * @return the nvdHinhAnh
	 */
	public String getNvdHinhAnh() {
		return NvdHinhAnh;
	}
	/**
	 * @param nvdHinhAnh the nvdHinhAnh to set
	 */
	public void setNvdHinhAnh(String nvdHinhAnh) {
		NvdHinhAnh = nvdHinhAnh;
	}
	/**
	 * @return the nvdNgayNhap
	 */
	public String getNvdNgayNhap() {
		return NvdNgayNhap;
	}
	/**
	 * @param nvdNgayNhap the nvdNgayNhap to set
	 */
	public void setNvdNgayNhap(String nvdNgayNhap) {
		NvdNgayNhap = nvdNgayNhap;
	}
	/**
	 * @return the nvdDVT
	 */
	public String getNvdDVT() {
		return NvdDVT;
	}
	/**
	 * @param nvdDVT the nvdDVT to set
	 */
	public void setNvdDVT(String nvdDVT) {
		NvdDVT = nvdDVT;
	}
	/**
	 * @return the nvdGia
	 */
	public Float getNvdGia() {
		return NvdGia;
	}
	/**
	 * @param nvdGia the nvdGia to set
	 */
	public void setNvdGia(Float nvdGia) {
		NvdGia = nvdGia;
	}
	/**
	 * @return the nvdSoLuong
	 */
	public int getNvdSoLuong() {
		return NvdSoLuong;
	}
	/**
	 * @param nvdSoLuong the nvdSoLuong to set
	 */
	public void setNvdSoLuong(int nvdSoLuong) {
		NvdSoLuong = nvdSoLuong;
	}


	
}
