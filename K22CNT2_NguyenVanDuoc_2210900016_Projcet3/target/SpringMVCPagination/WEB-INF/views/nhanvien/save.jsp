<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
    /* Định dạng tiêu đề */
    .title {
        text-align: center;
        color: #2c3e50;
        font-size: 24px;
        margin-bottom: 20px;
    }

    /* Định dạng khung chứa form */
    .form-container {
        width: 50%;
        margin: auto;
        padding: 20px;
        border: 2px solid #34495e;
        border-radius: 10px;
        box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.1);
        background-color: #f9f9f9;
    }

    /* Định dạng bảng */
    .form-table {
        width: 100%;
    }

    .form-table td {
        padding: 10px;
    }

    /* Định dạng input */
    .form-table input {
        width: 100%;
        padding: 5px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    /* Định dạng nút submit */
    .submit-btn {
        display: block;
        width: 100%;
        padding: 10px;
        background-color: #27ae60;
        color: white;
        text-align: center;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-weight: bold;
    }

    .submit-btn:hover {
        background-color: #219150;
    }
</style>

<h1 class="title">Them Nhan Vien Moi</h1>

<div class="form-container">
   <form:form action="${pageContext.request.contextPath}/nhanvien/save" method="post" modelAttribute="command">
        <table class="form-table">
            <tr>
                <td>Ten Nhan Vien:</td>
                <td><form:input path="nvdTenNV" /></td>
            </tr>
            <tr>
                <td>Chuc Vu:</td>
                <td><form:input path="nvdChucVu" /></td>
            </tr>
            <tr>
                <td>Luong:</td>
                <td><form:input path="nvdLuong" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Luu Nhan Vien" class="submit-btn" />
                </td>
            </tr>
        </table>
    </form:form>
</div>
