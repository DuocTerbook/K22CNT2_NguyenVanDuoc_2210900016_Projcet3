<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Danh Sach Nhan Vien</h1>
<table border="2" width="70%" cellpadding="2">
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
			<td><a href="editnhanvien/${nv.id}">Chinh Sua</a></td>
			<td><a href="deletenhanvien/${nv.id}">Xoa</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="nhanvien/save">Them Nhan Vien Moi</a>
