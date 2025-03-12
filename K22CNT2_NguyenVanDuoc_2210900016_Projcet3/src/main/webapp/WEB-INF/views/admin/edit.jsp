<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f4;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            margin-top: 15px;
            background-color: #28a745;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #218838;
        }
        .back-link {
            margin-top: 10px;
            display: inline-block;
            text-decoration: none;
            color: #007bff;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chỉnh sửa Admin</h2>
        <form action="../update" method="post">
            <input type="hidden" name="id" value="${admin.id}">

            <label for="nvd_TaiKhoan">Tài khoản:</label>
            <input type="text" id="nvd_TaiKhoan" name="nvd_TaiKhoan" value="${admin.nvd_TaiKhoan}" required>

            <label for="nvd_MatKhau">Mật khẩu mới:</label>
            <input type="password" id="nvd_MatKhau" name="nvd_MatKhau">

            <label for="nvd_TrangThai">Trạng thái:</label>
            <select id="nvd_TrangThai" name="nvd_TrangThai">
                <option value="true" ${admin.nvd_TrangThai ? "selected" : ""}>Hoạt động</option>
                <option value="false" ${!admin.nvd_TrangThai ? "selected" : ""}>Khóa</option>
            </select>

            <button type="submit">Cập nhật</button>
        </form>
        <a href="../list" class="back-link">Quay lại danh sách</a>
    </div>
</body>
</html>
