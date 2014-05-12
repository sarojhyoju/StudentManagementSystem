<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="com.vastika.student.model.*,com.vastika.student.services.*,com.vastika.student.dao.*,java.util.*"%>
<jsp:useBean id="student" class="com.vastika.student.model.StudentModel" scope="session">
</jsp:useBean>
<jsp:setProperty property="*" name="student" />

<jsp:useBean id="studentService"
	class="com.vastika.student.services.StudentServiceImpl" scope="request"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Here is added Student</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
	
		
		
		student.setName(name);
		student.setAge(age);
		student.setAddress(address);
		student.setEmail(email);
		studentService.addStudentService(student);
	%>

</body>
</html>