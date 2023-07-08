<%@ page language="java" contentType="text/html;charset-UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create Product</title>
</head>

<body>
  <form action="save" method="post" >
 <pre>
     <label for="productCode">Product Code:</label>
        <input type="text" id="productCode" name="productCode" required>
    Status:
            <input checked="checked" name="status" type="radio" value="No Used"/>No Used
            <input name="status" type="radio"  value="Used"/>Used
   <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required>
        
     <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>
        
         <label for="userName">User Name:</label>
        <input type="text" id="userName" name="userName" required>
        
         <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        
         <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        
         <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br>
    

        
    <input type="submit" value="Save"/>
   </pre>
  </form>
  <p style = "color:green;"/>${msg}<br>
  <a href="display">View All</a>
</body>
</html>