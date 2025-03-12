<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Them Nhan Vien Moi</h1>
<form action="${pageContext.request.contextPath}/nhanvien/save" method="post">

	<table>
		<tr>
			<td>Ten Nhan Vien :</td>
			<td><form:input path="nvdTenNV" /></td>
		</tr>
		<tr>
			<td>Chuc Vu :</td>
			<td><form:input path="nvdChucVu" /></td>
		</tr>
		<tr>
			<td>Luong :</td>
			<td><form:input path="nvdLuong" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Luu" /></td>
		</tr>
	</table>
</form>
