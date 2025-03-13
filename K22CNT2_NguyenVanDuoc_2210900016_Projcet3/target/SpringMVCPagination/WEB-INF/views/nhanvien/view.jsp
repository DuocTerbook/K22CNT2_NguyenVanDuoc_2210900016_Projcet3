<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
    /* Định dạng tiêu đề */
    .title {
        text-align: center;
        color: #2c3e50;
        font-size: 24px;
        margin-bottom: 20px;
    }

    /* Định dạng khung chứa bảng */
    .container {
        width: 80%;
        margin: auto;
        padding: 20px;
        border: 2px solid #34495e;
        border-radius: 10px;
        box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.1);
        background-color: #f9f9f9;
    }

    /* Định dạng bảng */
    .table {
        width: 100%;
        border-collapse: collapse;
        text-align: center;
    }

    .table th {
        background-color: #2c3e50;
        color: white;
        padding: 10px;
    }

    .table td {
        background-color: #ecf0f1;
        padding: 8px;
        border: 1px solid #ccc;
    }

    /* Định dạng link chỉnh sửa & xóa */
    .edit-link {
        color: #2980b9;
        text-decoration: none;
    }

    .delete-link {
        color: red;
        text-decoration: none;
    }

    .delete-link:hover {
        font-weight: bold;
    }

    /* Nút thêm nhân viên */
    .add-button {
        display: block;
        text-align: center;
        padding: 10px;
        background-color: #27ae60;
        color: white;
        text-decoration: none;
        width: 200px;
        margin: auto;
        border-radius: 5px;
        font-weight: bold;
    }

    .add-button:hover {
        background-color: #219150;
    }
</style>

<h1 class="title">Danh Sach Nhan Vien</h1>

<div class="container">
    <table class="table">
        <tr>
            <th>Id</th>
            <th>Ten Nhan Vien</th>
            <th>Chuc Vu</th>
            <th>Luong</th>
            <th>Chinh Sua</th>
            <th>Xoa</th>
        </tr>
        <c:forEach var="nv" items="${list}">
            <tr>
                <td>${nv.id}</td>
                <td>${nv.nvdTenNV}</td>
                <td>${nv.nvdChucVu}</td>
                <td>${nv.nvdLuong}</td>
                <td><a href="editnhanvien/${nv.id}" class="edit-link">Chinh Sua</a></td>
                <td><a href="deletenhanvien/${nv.id}" class="delete-link">Xoa</a></td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <a href="save" class="add-button">Them Nhan Vien Moi</a>
    <a href="http://localhost:8080/SpringMVCPagination/index.jsp" class="">Quay Lai Trang chu</a>
</div>
