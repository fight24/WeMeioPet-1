<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <div class="table-title">
<h3>Customer Table</h3>
</div>
<table class="table-fill">
<thead>
<tr>
<th class="text-left">ID</th>
<th class="text-left">First Name</th>
<th class="text-left">Last Name</th>
<th class="text-left">User Name</th>
<th class="text-left">Password</th>
<th class="text-left">Phone</th>
<th class="text-left">Email</th>
</tr>
</thead>
<tbody class="table-hover">
<c:forEach var="customer" items="${customers}">
<tr>
<td class="text-left"> ${customer.getIdCustomer()}</td>
<td class="text-left">${customer.getFirstName()}</td>
<td class="text-left">${customer.getLastName()}</td>
<td class="text-left">${customer.getUserName()}</td>
<td class="text-left">${customer.getPassword()}</td>
<td class="text-left">${customer.getEmail()}</td>
<td class="text-left">${customer.getPhone()}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>