<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books List </title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>

<%-- request.getSession().getAttribute("bookList") --%>

<h2>Books List</h2>
<table>
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Book Price</th>
</tr>
<c:forEach items="${bookList}" var="books" >

<tr>
<td>${books.id}</td>
<td>${books.bookName}</td>
<td>${books.author}</td>
<td>${books.price}</td>

</tr>

</c:forEach>

</table>

</body>
</html>