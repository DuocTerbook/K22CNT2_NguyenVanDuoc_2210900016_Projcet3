<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Đăng ký Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
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
        .form-group {
            margin-bottom: 15px;
            text-align: left;
        }
        label {
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 10px;
            border: none;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
        .error {
            color: red;
            margin-bottom: 10px;
        }
        .login-link {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Đăng ký Admin</h2>
        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>
        <form action="register" method="post">
            <div class="form-group">
                <label for="nvdTaiKhoan">Tài khoản:</label>
                <input type="text" id="nvdTaiKhoan" name="nvdTaiKhoan" required>
            </div>
            <div class="form-group">
                <label for="nvdMatKhau">Mật khẩu:</label>
                <input type="password" id="nvdMatKhau" name="nvdMatKhau" required>
            </div>
            <button type="submit">Đăng ký</button>
        </form>
        <p class="login-link">Đã có tài khoản? <a href="login">Đăng nhập</a></p>
    </div>
</body>
</html>
