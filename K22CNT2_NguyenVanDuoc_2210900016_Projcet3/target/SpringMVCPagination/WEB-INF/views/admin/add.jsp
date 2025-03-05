<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm Admin</title>
</head>
<body>
    <h2>Thêm Admin</h2>

    <form action="add" method="post">
        <label for="nvdTaiKhoan">Tài khoản:</label>
        <input type="text" id="nvdTaiKhoan" name="nvdTaiKhoan" required>
        <br>

        <label for="nvdMatKhau">Mật khẩu:</label>
        <input type="password" id="nvdMatKhau" name="nvdMatKhau" required>
        <br>

        <label for="nvdTrangThai">Trạng thái:</label>
        <select id="nvdTrangThai" name="nvdTrangThai">
            <option value="true">Hoạt động</option>
            <option value="false">Khóa</option>
        </select>
        <br>

        <button type="submit">Thêm</button>
    </form>

    <p><a href="list">Quay lại danh sách</a></p>
</body>
</html>
