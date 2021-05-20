<%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sách</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/save" modelAttribute="book" method="POST">
                    <!-- need to associate this data with customer id -->
                <form:hidden path="id" />
                <table>  
                <tbody>
                        <tr>
                                <td><label>Tên xe :</label></td>
                                <td><form:input path="carname" /></td>
                        </tr>
                        <tr>
                                <td><label>Giá:</label></td>
                                <td><form:input path="price" /></td>
                        </tr>
                        <tr>
                                <td><label>Mẫu năm:</label></td>
                                <td><form:input path="modelyear" /></td>
                        </tr>
                        <tr>
                                <td><label>Mô tả:</label></td>
                                <td><form:input path="cardescription" /></td>
                        </tr>
                        
                        <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Save" class="save" /></td>
                        </tr>
                        </tbody>   
                        </table>
            </form:form>
</body>
</html>