<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
        }
        label {
            display: block;
            text-align: left;
            font-weight: bold;
            margin-top: 10px;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 15px;
        }
        button:hover {
            background-color: #218838;
        }
        .back-link {
            display: block;
            margin-top: 15px;
        }
        a {
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Thêm Admin</h2>

        <form action="add" method="post">
            <label for="nvdTaiKhoan">Tài khoản:</label>
            <input type="text" id="nvdTaiKhoan" name="nvdTaiKhoan" required>

            <label for="nvdMatKhau">Mật khẩu:</label>
            <input type="password" id="nvdMatKhau" name="nvdMatKhau" required>

            <label for="nvdTrangThai">Trạng thái:</label>
            <select id="nvdTrangThai" name="nvdTrangThai">
                <option value="true">Hoạt động</option>
                <option value="false">Khóa</option>
            </select>

            <button type="submit">Thêm</button>
        </form>

        <p class="back-link"><a href="list">Quay lại danh sách</a></p>
    </div>
</body>
</html>
