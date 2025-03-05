CREATE DATABASE K22CNT2_NguyenVanDuoc_2210900016_Projcet3;
USE K22CNT2_NguyenVanDuoc_2210900016_Projcet3;
CREATE TABLE Nvd_QuanTri (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NvdTaiKhoan NVARCHAR(50),
    NvdMatKhau NVARCHAR(50),
    NvdTrangThai BIT
);

CREATE TABLE Nvd_SanPham (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NvdTenSP NVARCHAR(50),
    NvdSoLuong INT,
	NvdHinhAnh VARCHAR(255),
    NvdNgayNhap NVARCHAR(50),
    NvdDVT NVARCHAR(20),
    NvdDonGia FLOAT
);

CREATE TABLE Nvd_KhachHang (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NvdHoTen NVARCHAR(100),
    NvdEmail VARCHAR(100),
    NvdSoDienThoai VARCHAR(15),
    NvdDiaChi TEXT,
    NvdTrangThai BIT
);

CREATE TABLE Nvd_NhanVien (
    id INT AUTO_INCREMENT PRIMARY KEY,
    NvdTenNV NVARCHAR(100),
    NvdChucVu VARCHAR(50),
    NvdLuong DECIMAL(10,2)
);

CREATE TABLE Nvd_GioHang (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Nvd_idsanpham INT,
    Nvd_SoLuong INTEGER NOT NULL,
    FOREIGN KEY (Nvd_idsanpham) REFERENCES Nvd_SanPham (id)
);

drop table Nvd_QuanTri;
drop table Nvd_SanPham;
drop table Nvd_KhachHang;
drop table Nvd_NhanVien;
drop table Nvd_GioHang;
select * from Nvd_SanPham;
