<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Giỏ Hàng</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: url('https://example.com/background.jpg') no-repeat center
		center fixed;
	background-size: cover;
	text-align: center;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	margin: 50px auto;
	background: rgba(255, 224, 229, 0.9);
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

h1 {
	color: white;
	background: #ff69b4;
	padding: 20px;
	margin: 0;
	border-radius: 10px 10px 0 0;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
	background: white;
}

th, td {
	padding: 10px;
	border: 1px solid #ddd;
	text-align: center;
}

th {
	background: #ff1493;
	color: white;
}

td img {
	width: 80px;
	height: 80px;
	border-radius: 5px;
}

.action-btn {
	display: inline-block;
	padding: 8px 15px;
	color: white;
	text-decoration: none;
	border-radius: 5px;
	transition: 0.3s;
}

.delete-btn {
	background: #db7093;
}

.delete-btn:hover {
	background: #c71585;
}

.checkout-btn {
	display: block;
	margin: 20px auto;
	padding: 10px 20px;
	background: #ff1493;
	color: white;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	transition: 0.3s;
}

.checkout-btn:hover {
	background: #ff69b4;
}

.empty-message {
	font-size: 18px;
	color: #d9534f;
}

.back-btn {
	display: inline-block;
	margin-top: 20px;
	padding: 10px 20px;
	background: #ffb6c1;
	color: white;
	text-decoration: none;
	border-radius: 5px;
	transition: 0.3s;
}

.back-btn:hover {
	background: #ff69b4;
}
.customer-info {
    width: 50%;
    margin: 20px auto;
    padding: 20px;
    background: white;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    text-align: left;
}

.customer-info h2 {
    text-align: center;
    color: #ff1493;
}

.customer-info label {
    font-weight: bold;
    display: block;
    margin-top: 10px;
}

.customer-info input, 
.customer-info textarea {
    width: 100%;
    padding: 8px;
    margin-top: 5px;
    border: 1px solid #ddd;
    border-radius: 5px;
}

.customer-info .checkout-btn {
    width: 100%;
    margin-top: 15px;
}
</style>
</head>
<body>
	<h1>Giỏ Hàng</h1>

	<c:if test="${not empty cartItems}">
		<table border="1">
			<thead>
				<tr>
					<th>Tên sản phẩm</th>
					<th>Ảnh</th>
					<th>Giá</th>
					<th>Số lượng</th>
					<th>Tổng tiền</th>
					<th>Hành động</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${cartItems}">
					<tr>
						<td>${item.nvdName}</td>
						<td><img src="${item.nvdHinhAnh}" alt="Ảnh sản phẩm"
							width="100" height="100"></td>
						<td>${item.nvdGia}VND</td>
						<td>${item.nvdSoLuong}</td>
						<td>${item.nvdGia * item.nvdSoLuong}VND</td>
						<td><a href="xoagiohang/${item.id}">Xóa</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<h3>Tổng cộng: ${totalAmount} VND</h3>

		<div class="customer-info">
			<h2>Thông tin khách hàng</h2>
			<form action="thanhtoan" method="post">
				<label for="nvdHoTen">Họ và tên:</label> <input type="text"
					id="nvdHoTen" name="nvdHoTen" required><br> <label
					for="nvdEmail">Email:</label> <input type="email" id="nvdEmail"
					name="nvdEmail" required><br> <label
					for="nvdSoDienThoai">Số điện thoại:</label> <input type="text"
					id="nvdSoDienThoai" name="nvdSoDienThoai" required><br>

				<label for="nvdDiaChi">Địa chỉ:</label>
				<textarea id="nvdDiaChi" name="nvdDiaChi" required></textarea>
				<br>

				<button type="submit" class="checkout-btn">Thanh toán</button>
			</form>
		</div>
	</c:if>

	<c:if test="${empty cartItems}">
		<p>Giỏ hàng của bạn hiện tại trống.</p>
	</c:if>

	<br />
	<a href="viewform">Tiếp tục mua sắm</a>
</body>
</html>
