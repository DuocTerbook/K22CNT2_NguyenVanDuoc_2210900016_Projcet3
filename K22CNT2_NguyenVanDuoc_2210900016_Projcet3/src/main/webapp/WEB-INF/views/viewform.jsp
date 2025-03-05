<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
    table {
        border-collapse: collapse;
        width: 80%;
        margin: auto;
    }
    th, td {
        border: 2px solid black;
        text-align: center;
        padding: 8px;
    }
    th {
        background-color: #f2f2f2;
    }
    img {
        display: block;
        margin: auto;
    }
    .button-container {
        text-align: center;
        margin-top: 20px;
    }
    .button-container a {
        display: inline-block;
        margin: 5px;
        padding: 10px 15px;
        text-decoration: none;
        color: white;
        background-color: #007bff;
        border-radius: 5px;
    }
</style>

<h1 style="text-align: center;">Danh sach san pham</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Ten SP</th>
        <th>So Luong</th>
        <th>Anh</th>
        <th>Ngay Nhap</th>
        <th>DVT</th>
        <th>Gia</th>
        <th>Mua</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="nvd_sanpham" items="${list}">
        <tr>
            <td>${nvd_sanpham.id}</td>
            <td>${nvd_sanpham.nvdTenSP}</td>
            <td>${nvd_sanpham.nvdSoLuong}</td>
            <td>
                <img src="${nvd_sanpham.nvdHinhAnh}" alt="Hinh anh san pham" width="100" height="100"/>
            </td>
            <td>${nvd_sanpham.nvdNgayNhap}</td>
            <td>${nvd_sanpham.nvdDVT}</td>
            <td>${nvd_sanpham.nvdDonGia}</td>
            <td>
                <a href="<c:url value='/add-to-cart'>
                    <c:param name='id' value='${nvd_sanpham.id}'/>
                    <c:param name='tenSP' value='${nvd_sanpham.nvdTenSP}'/>
                    <c:param name='soLuong' value='${nvd_sanpham.nvdSoLuong}'/>
                    <c:param name='hinhAnh' value='${nvd_sanpham.nvdHinhAnh}'/>
                    <c:param name='ngayNhap' value='${nvd_sanpham.nvdNgayNhap}'/>
                    <c:param name='dvt' value='${nvd_sanpham.nvdDVT}'/>
                    <c:param name='donGia' value='${nvd_sanpham.nvdDonGia}'/>
                </c:url>">Mua</a>
			</td>
            <td><a href="sua/${nvd_sanpham.id}">Edit</a></td>
            <td><a href="xoa/${nvd_sanpham.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

<div class="button-container">
    <a href="saveform">Them san pham</a>
    <a href="giohang">Gio hang</a>
    <a href="index.jsp">Back</a>
</div>
