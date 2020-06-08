<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
	ID: <input type="text" name="aid"><br>
	Name: <input type="text" name="anme"><br>
	Tech: <input type="text" name="tech"><br>
	<input type="submit" value="Save">
	</form>
	<form action="fetchAllData">
		<input type="submit" value="Show All Aliens">
	</form>
	<br>
	
	<form action="searchById">
	<h3>Search Alien</h3>
	Enter ID: <input type="text" name="aid"><br>
	<input type="submit" value="Search By ID">
	</form>
	<form action="searchByTech">
	<h3>Search Alien By Tech</h3>
	Enter Tech: <input type="text" name="tech"><br>
	<input type="submit" value="Search By Tech">
	</form>
	<form action="searchByTechSortByName">
	<h3>Search Alien By Tech Sort By Name</h3>
	Enter Tech: <input type="text" name="tech"><br>
	<input type="submit" value="Search ByTechSortByName">
	</form>
	
	<form action="searchByIDGreaterThan">
	<h3>Search Alien By ID Greater Than</h3>
	Enter ID: <input type="text" name="aid"><br>
	<input type="submit" value="Search ByIdGreaterThan">
	</form>
		<form action="searchByIdLessThan">
	<h3>Search Alien By ID Less Than</h3>
	Enter ID: <input type="text" name="aid"><br>
	<input type="submit" value="Search ByIdLessThan">
	</form>
	
</body>
</html>