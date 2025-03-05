package com.springmvc.beans;

public class Nvd_KhachHang {
	private int id;
    private String nvdHoTen;
    private String nvdEmail;
    private String nvdSoDienThoai;
    private String nvdDiaChi;
    private boolean nvdTrangThai;
    
    
	/**
	 * @param nvdHoTen
	 * @param nvdEmail
	 * @param nvdSoDienThoai
	 * @param nvdDiaChi
	 * @param nvdTrangThai
	 */
	public Nvd_KhachHang(String nvdHoTen, String nvdEmail, String nvdSoDienThoai, String nvdDiaChi,
			boolean nvdTrangThai) {
		super();
		this.nvdHoTen = nvdHoTen;
		this.nvdEmail = nvdEmail;
		this.nvdSoDienThoai = nvdSoDienThoai;
		this.nvdDiaChi = nvdDiaChi;
		this.nvdTrangThai = nvdTrangThai;
	}
	
	
	/**
	 * 
	 */
	public Nvd_KhachHang() {
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
	 * @return the nvdHoTen
	 */
	public String getNvdHoTen() {
		return nvdHoTen;
	}
	/**
	 * @param nvdHoTen the nvdHoTen to set
	 */
	public void setNvdHoTen(String nvdHoTen) {
		this.nvdHoTen = nvdHoTen;
	}
	/**
	 * @return the nvdEmail
	 */
	public String getNvdEmail() {
		return nvdEmail;
	}
	/**
	 * @param nvdEmail the nvdEmail to set
	 */
	public void setNvdEmail(String nvdEmail) {
		this.nvdEmail = nvdEmail;
	}
	/**
	 * @return the nvdSoDienThoai
	 */
	public String getNvdSoDienThoai() {
		return nvdSoDienThoai;
	}
	/**
	 * @param nvdSoDienThoai the nvdSoDienThoai to set
	 */
	public void setNvdSoDienThoai(String nvdSoDienThoai) {
		this.nvdSoDienThoai = nvdSoDienThoai;
	}
	/**
	 * @return the nvdDiaChi
	 */
	public String getNvdDiaChi() {
		return nvdDiaChi;
	}
	/**
	 * @param nvdDiaChi the nvdDiaChi to set
	 */
	public void setNvdDiaChi(String nvdDiaChi) {
		this.nvdDiaChi = nvdDiaChi;
	}
	/**
	 * @return the nvdTrangThai
	 */
	public boolean isNvdTrangThai() {
		return nvdTrangThai;
	}
	/**
	 * @param nvdTrangThai the nvdTrangThai to set
	 */
	public void setNvdTrangThai(boolean nvdTrangThai) {
		this.nvdTrangThai = nvdTrangThai;
	}
}
