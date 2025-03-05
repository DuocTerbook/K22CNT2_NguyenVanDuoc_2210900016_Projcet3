<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa Admin</title>
</head>
<body>
    <h2>Chỉnh sửa Admin</h2>

    <form action="../update" method="post">
        <input type="hidden" name="id" value="${admin.id}">

        <label for="nvd_TaiKhoan">Tài khoản:</label>
        <input type="text" id="nvd_TaiKhoan" name="nvd_TaiKhoan" value="${admin.nvd_TaiKhoan}" required>
        <br>

        <label for="nvd_MatKhau">Mật khẩu mới:</label>
        <input type="password" id="nvd_MatKhau" name="nvd_MatKhau">
        <br>

        <label for="nvd_TrangThai">Trạng thái:</label>
        <select id="nvd_TrangThai" name="nvd_TrangThai">
            <option value="true" ${admin.nvd_TrangThai ? "selected" : ""}>Hoạt động</option>
            <option value="false" ${!admin.nvd_TrangThai ? "selected" : ""}>Khóa</option>
        </select>
        <br>

        <button type="submit">Cập nhật</button>
    </form>

    <p><a href="../list">Quay lại danh sách</a></p>
</body>
</html>
