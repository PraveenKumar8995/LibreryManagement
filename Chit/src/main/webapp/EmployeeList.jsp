<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List </title>

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
<script type="text/javascript">

function deleteemp(id)
{
	alert("Deleting :"+id);
	const xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if (this.readystate == 4 && this.status == 200){
			alert(this.responseText);
			location.reload();
		}
	};
	xhttp.open("DELETE","./EmpServlet?id="+id);
	xhttp.send();
	
	}
</script>

</head>
<body>

<%-- request.getSession().getAttribute("EmployeeList") --%>


<h2>Employee List</h2>
<table>
<tr>
<th>Employee Id</th>
<th> Name</th>
<th>Salary</th>
<th>Action</th>

</tr>
<c:forEach items="${EmployeeList}" var="Emps" >

<tr>
<td>${EmpServlet.empid}</td>
<td>${EmpServlet.Name}</td>
<td>${EmpServlet.salary}</td>
<td>
<input onclick="javascript:deleteemp(${Emps.id })" type="button" value="Delete">

</tr>

</c:forEach>

</table>

</body>
</html>