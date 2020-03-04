<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/assignsuperhero">
     <div class="form-group "> 
       <label for="universe" class="control-label " >universe:</label>
       <select name="universeName">
       
		 <c:forEach var="u" items="${universe}">
		 
		 <option value="${u.universeName}"> ${u.universeName}</option>
		 </c:forEach>
		</select>
		
		<h1 align="center" SuperHero></h1>
			<table>
				<tr>
					<td style="text-color:white">SuperHero Name</td>
					<td><input type="text" id="superHeroName" name="superHeroName"></td>
					
					<td>SuperHero Power</td>
					<td><input type="text" id="superHeroPower"
						name="superHeroPower"></td>
				</tr>
				
				<td><input type="submit" value="Submit"></td>
			</table>
			
			
				
			
			</div>
		</form>
	

</body>
</html>