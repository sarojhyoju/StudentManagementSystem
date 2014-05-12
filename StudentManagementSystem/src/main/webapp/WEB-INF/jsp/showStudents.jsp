<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h1>Student Lists</h1>
<c:forEach items="${students}" var="student">
Student Id: ${student.studentId}<br/>
Student Name: ${student.name}<br/>
Student's Age: ${student.age}<br/>
Student's Address: ${student.address}<br/>
Student's Email: ${student.email}<br/>
<br/>
<br/>
<br/>
<br/>

</c:forEach>
</body>
</html>