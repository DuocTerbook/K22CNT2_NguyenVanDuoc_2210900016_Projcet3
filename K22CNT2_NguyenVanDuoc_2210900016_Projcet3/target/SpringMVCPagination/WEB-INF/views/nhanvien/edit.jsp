<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Employee</h1>
<form:form method="POST" action="/SpringMVCPagination/editnhanvien">
    <table>
        <tr>
            <td></td>
            <td><form:hidden path="id" /></td>
        </tr>
        <tr>
            <td>Employee Name :</td>
            <td><form:input path="nvdTenNV" /></td>
        </tr>
        <tr>
            <td>Position :</td>
            <td><form:input path="nvdChucVu" /></td>
        </tr>
        <tr>
            <td>Salary :</td>
            <td><form:input path="nvdLuong" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Edit Save" /></td>
        </tr>
    </table>
</form:form>
