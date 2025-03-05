
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Sua san pham</h1>
<form:form method="POST" action="/SpringMVCPagination/luu">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Ten SP :</td>
			<td><form:input path="NvdTenSP" /></td>
		</tr>
		<tr>
			<td>So Luong :</td>
			<td><form:input path="NvdSoLuong" /></td>
		</tr>
		<tr>
			<td>Anh :</td>
			<td><form:input path="NvdHinhAnh" /></td>
		</tr>
		<tr>
			<td>Ngay Nhap :</td>
			<td><form:input path="NvdNgayNhap" /></td>
		</tr>
		<tr>
			<td>DVT :</td>
			<td><form:input path="NvdDVT" /></td>
		</tr>
		<tr>
			<td>Gia :</td>
			<td><form:input path="NvdDonGia" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="luu" /></td>
		</tr>
	</table>
</form:form>
