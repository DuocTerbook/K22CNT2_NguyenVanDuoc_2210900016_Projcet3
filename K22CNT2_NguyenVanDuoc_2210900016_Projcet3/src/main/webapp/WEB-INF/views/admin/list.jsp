<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
            border: 2px solid black;
            width: 80%;
            margin: auto;
        }

        h2 {
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        p {
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h2>Danh sách Admin</h2>

    <p><a href="add">Thêm Admin mới</a> | <a href="logout">Đăng xuất</a></p>

    <table>
        <tr>
            <th>ID</th>
            <th>Tài khoản</th>
            <th>Trạng thái</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="admin" items="${list}">
            <tr>
                <td>${admin.id}</td>
                <td>${admin.nvdTaiKhoan}</td>
                <td>${admin.nvdTrangThai ? "Hoạt động" : "Khóa"}</td>
                <td>
                    <a href="edit/${admin.id}">Sửa</a> | 
                    <a href="delete/${admin.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
