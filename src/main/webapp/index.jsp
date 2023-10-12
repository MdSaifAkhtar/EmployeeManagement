<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management Application</h1>
	<hr>
	<h2>Enter employee details :- </h2>
	<form action="addEmp" method="post">
		<h3>
			Emp ID : <input type="number" name="eid"><br>
			Name : <input type="text" name="name"><br>
			Age : <input type="number" name="age"><br>
			Salary : <input type="number" name="salary"><br>
			Designation : <input type="text" name="desig"><br>
			<br>
			<input type="submit" value="INSERT">
			<input type="reset" value="RESET">
		</h3>
	</form>
	<hr>
	<h2>Search Employee :-</h2>
	<form action="searchEmp">
		<h3>
			Emp ID : <input type="number" name="eid"><br>
			<br>
			<input type="submit" value="SEARCH">
			<input type="reset" value="RESET">
		</h3>
	</form>
	<hr>
	
	
	<hr>
	<h2> GET ALL EMPLOYEES</h2>
	<form action="allEmp">
			<input type="submit" value="DISPLAY ALL EMPLOYEES">
	</form>
	<hr>
	<h2>Search Employee by Name :-</h2>
	<form action="searchEmpByName">
		<h3>
			Enter Name : <input type="text" name="user"><br>
			<br>
			<input type="submit" value="SEARCH">
			<input type="reset" value="RESET">
		</h3>
	</form>
	<hr>
	<h2>Search Employee by Designation :-</h2>
	<form action="searchEmpByDesig">
		<h3>
			Enter Name : <input type="text" name="d"><br>
			<br>
			<input type="submit" value="SEARCH">
			<input type="reset" value="RESET">
		</h3>
	</form>
	<hr>
	<h2>Search Employee above Age :-</h2>
	<form action="searchEmpByAge">
		<h3>
			Enter Age : <input type="number" name="age"><br>
			<br>
			<input type="submit" value="SEARCH">
			<input type="reset" value="RESET">
		</h3>
	</form>

</body>
</html>