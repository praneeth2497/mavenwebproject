<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<sptags:form action="addProduct"  method="post">
<div class="form-group">
ProductId <sptags:input path="id" class="form-control" placeholder="Enterid" />
</div>
<div class="form-group">
ProductName  <sptags:input path="name" class="form-control" placeholder="Entername"/>
</div>
<div class="form-group">
ProductPrice  <sptags:input path="price" class="form-control" placeholder="Enterprice"/>
</div>
<input  type="submit"  value="saveProduct" />
</sptags:form>
</div>
</body>
</html>