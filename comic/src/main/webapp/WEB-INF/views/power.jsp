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
<form action="/assignpower">
     <div class="form-group "> 
       <label for="superHero" class="control-label " >SuperHero:</label>
       <select name="superHeroName">
       
		 <c:forEach var="s" items="${superheros}">
		 
		 <option value="${s.superHeroName}"> ${s.superHeroName}</option>
		 </c:forEach>
		</select>
		<h1 align="center" POWER></h1>
			<table>
				<tr>
					<td style="text-color:white">Power Name</td>
					<td><input type="text" id="powerName" name="powerName"></td>
					
					<td>Power Strength</td>
					<td><input type="number" id="powerStrength"
						name="powerStrength"></td>
				</tr>
				
				<td><input type="submit" value="Submit"></td>
			</table>
			</div>
			</form>

</body>
</html>