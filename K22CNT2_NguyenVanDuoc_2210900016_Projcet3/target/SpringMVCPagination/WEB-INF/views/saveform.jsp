<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
    body {
        font-family: Arial, sans-serif;
    }
    .form-container {
        width: 50%;
        margin: auto;
        padding: 20px;
        border: 2px solid black;
        border-radius: 10px;
        background-color: #f9f9f9;
        box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);
    }
    table {
        width: 100%;
    }
    td {
        padding: 10px;
    }
    input {
        width: 95%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        background-color: #28a745;
        color: white;
        border: none;
        cursor: pointer;
        padding: 10px 20px;
        font-size: 16px;
    }
    input[type="submit"]:hover {
        background-color: #218838;
    }
    h1 {
        text-align: center;
    }
</style>

<div class="form-container">
    <h1>Them san pham</h1>
    <form:form method="post" action="/SpringMVCPagination/save" >
        <table>
            <tr>
                <td><b>Ten SP :</b></td>
                <td><form:input path="NvdTenSP" /></td>
            </tr>
            <tr>
                <td><b>So Luong :</b></td>
                <td><form:input path="NvdSoLuong" /></td>
            </tr>
            <tr>
                <td><b>Anh :</b></td>
                <td><form:input path="NvdHinhAnh" /></td>
            </tr>
            <tr>
                <td><b>Ngay Nhap :</b></td>
                <td><form:input path="NvdNgayNhap" /></td>
            </tr>
            <tr>
                <td><b>DVT :</b></td>
                <td><form:input path="NvdDVT" /></td>
            </tr>
            <tr>
                <td><b>Gia :</b></td>
                <td><form:input path="NvdDonGia" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
</div>
