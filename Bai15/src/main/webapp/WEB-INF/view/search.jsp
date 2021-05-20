<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm sách</title>
</head>
<body>

<h2>Kết quả tìm kiếm</h2>
 <table border="2px">
                        <tr>
                        <th>Mã xe</th>
                                <th>Tên xe</th>
                                <th>Giá</th>
                                <th>Mẫu năm</th>
                                <th>Mô tả</th>
                               
                        </tr>
                        
                        <c:forEach var="tempbooks" items="${searchbooks}">
                                <!-- construct an "update" link with customer id -->				
                                <tr>
                                         <td> ${tempbooks.id} </td>
                                        <td> ${tempbooks.carname} </td>
                                        <td> ${tempbooks.price} </td>
                                        <td> ${tempbooks.modelyear} </td>
                                        <td> ${tempbooks.cardescription} </td>
                                                
                  
                                 </tr> 
                                  
                        </c:forEach>
                        
                        </table>
                        
                        <a href="${pageContext.request.contextPath}">Trang chủ</a>

</body>
</html>