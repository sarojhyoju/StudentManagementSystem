<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %> --%>

<html>
<head>
<title>Student Records</title>
</head>
<body>
<h1>Student Management System</h1>
	<form action="students/addstud" method="post">


		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Records"/></td>
			</tr>
		</table>
	</form>


</body>
</html>
