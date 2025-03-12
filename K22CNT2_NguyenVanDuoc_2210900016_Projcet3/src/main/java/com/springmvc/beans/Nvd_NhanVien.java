package com.springmvc.beans;

public class Nvd_NhanVien {
    private int id;
    private String NvdTenNV;
    private String NvdChucVu;
    private Double NvdLuong;

    /**
     * Constructor mặc định
     */
    public Nvd_NhanVien() {
        super();
    }

    /**
     * Constructor với tham số
     * @param nvdTenNV
     * @param nvdChucVu
     * @param nvdLuong
     */
    public Nvd_NhanVien(String nvdTenNV, String nvdChucVu, Double nvdLuong) {
        super();
        this.NvdTenNV = nvdTenNV;
        this.NvdChucVu = nvdChucVu;
        this.NvdLuong = nvdLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNvdTenNV() {
        return NvdTenNV;
    }

    public void setNvdTenNV(String nvdTenNV) {
        this.NvdTenNV = nvdTenNV;
    }

    public String getNvdChucVu() {
        return NvdChucVu;
    }

    public void setNvdChucVu(String nvdChucVu) {
        this.NvdChucVu = nvdChucVu;
    }

    public Double getNvdLuong() {
        return NvdLuong;
    }

    public void setNvdLuong(Double nvdLuong) {
        this.NvdLuong = nvdLuong;
    }
}
