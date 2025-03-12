package com.springmvc.beans;


public class Nvd_SanPham {
	private int id;
    private String NvdTenSP;
    private int NvdSoLuong;
    private String NvdHinhAnh;
    private String NvdNgayNhap;
    private String NvdDVT;
    private Double NvdDonGia;


	/**
	 * @param nvdTenSP
	 * @param nvdSoLuong
	 * @param nvdHinhAnh
	 * @param nvdNgayNhap
	 * @param nvdDVT
	 * @param nvdDonGia
	 */


	/**
	 *
	 */
	public Nvd_SanPham() {
		super();
	}
	/**
	 * @param id
	 * @param nvdTenSP
	 * @param nvdSoLuong
	 * @param nvdHinhAnh
	 * @param nvdNgayNhap
	 * @param nvdDVT
	 * @param nvdDonGia
	 */
	public Nvd_SanPham( String nvdTenSP, int nvdSoLuong, String nvdHinhAnh, String nvdNgayNhap, String nvdDVT,
			Double nvdDonGia) {
		super();
		NvdTenSP = nvdTenSP;
		NvdSoLuong = nvdSoLuong;
		NvdHinhAnh = nvdHinhAnh;
		NvdNgayNhap = nvdNgayNhap;
		NvdDVT = nvdDVT;
		NvdDonGia = nvdDonGia;
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
	 * @return the nvdTenSP
	 */
	public String getNvdTenSP() {
		return NvdTenSP;
	}
	/**
	 * @param nvdTenSP the nvdTenSP to set
	 */
	public void setNvdTenSP(String nvdTenSP) {
		NvdTenSP = nvdTenSP;
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
	 * @return the nvdDonGia
	 */
	public Double getNvdDonGia() {
		return NvdDonGia;
	}
	/**
	 * @param nvdDonGia the nvdDonGia to set
	 */
	public void setNvdDonGia(Double nvdDonGia) {
		NvdDonGia = nvdDonGia;
	}
}
