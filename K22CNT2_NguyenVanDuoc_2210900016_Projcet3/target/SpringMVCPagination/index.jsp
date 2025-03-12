<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang quản lý vật tư y tế</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: #f4f4f4;
            text-align: center;
        }
        .header {
            background: #3498db;
            color: white;
            padding: 20px;
            font-size: 24px;
        }
        .content {
            padding: 20px;
            background: white;
            margin: 20px auto;
            width: 80%;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        .footer {
            background: #333;
            color: white;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            color: white;
            background: #2ecc71;
            text-decoration: none;
            border-radius: 5px;
            transition: 0.3s;
        }
        .button:hover {
            background: #27ae60;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Chào mừng đến với quản lý vật tư y tế</h1>
    </div>
    
    <div class="content">
        <% String message = "Quản lý sản phẩm"; %>
        <p><%= message %></p>
        
        <a href="saveform" class="button">Them san pham</a>
        <a href="viewform" class="button">Xem them</a>
         <a href="nhanvien/view" class="button">Thong tin nhan vien</a>
        <a href="<%= request.getContextPath() %>/admin/login" class="button">Dang nhap</a>
    </div>
    
    <div class="footer">
        <p>&copy; 2024 Trang Web của bạn</p>
    </div>
</body>
</html>
