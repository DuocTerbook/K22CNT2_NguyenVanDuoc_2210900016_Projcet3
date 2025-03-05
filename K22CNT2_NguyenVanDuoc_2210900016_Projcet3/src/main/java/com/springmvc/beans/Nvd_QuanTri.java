package com.springmvc.beans;

public class Nvd_QuanTri {
	private int id;
	private String NvdTaiKhoan;
	private String NvdMatKhau;
	private boolean NvdTrangThai;


	/**
	 * @param nvdTaiKhoan
	 * @param nvdMatKhau
	 * @param nvdTrangThai
	 */
	public Nvd_QuanTri(String nvdTaiKhoan, String nvdMatKhau, boolean nvdTrangThai) {
		super();
		NvdTaiKhoan = nvdTaiKhoan;
		NvdMatKhau = nvdMatKhau;
		NvdTrangThai = nvdTrangThai;
	}


	/**
	 *
	 */
	public Nvd_QuanTri() {
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
	 * @return the nvdTaiKhoan
	 */
	public String getNvdTaiKhoan() {
		return NvdTaiKhoan;
	}
	/**
	 * @param nvdTaiKhoan the nvdTaiKhoan to set
	 */
	public void setNvdTaiKhoan(String nvdTaiKhoan) {
		NvdTaiKhoan = nvdTaiKhoan;
	}
	/**
	 * @return the nvdMatKhau
	 */
	public String getNvdMatKhau() {
		return NvdMatKhau;
	}
	/**
	 * @param nvdMatKhau the nvdMatKhau to set
	 */
	public void setNvdMatKhau(String nvdMatKhau) {
		NvdMatKhau = nvdMatKhau;
	}
	/**
	 * @return the nvdTrangThai
	 */
	public boolean isNvdTrangThai() {
		return NvdTrangThai;
	}
	/**
	 * @param nvdTrangThai the nvdTrangThai to set
	 */
	public void setNvdTrangThai(boolean nvdTrangThai) {
		NvdTrangThai = nvdTrangThai;
	}

}
