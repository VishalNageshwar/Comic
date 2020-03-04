<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
background-image: url(/resources/Gif/universe.gif); /*You will specify your image path here.*/

-moz-background-size: cover;
-webkit-background-size: cover;
background-size: cover;
background-position: top center !important;
background-repeat: no-repeat !important;
background-attachment: fixed;
}
</style>
<body>
	<div class="form" align="center">
		<form action="/insertuniverse" method="post" name=form>
			<h1 align="center" UNIVERSE></h1>
			<table>
				<tr>
					<td style="text-color:white">Universe Name</td>
					<td><input type="text" id="universeName" name="universeName"></td>
					<br>
					<td>SuperHero Capacity</td>
					<td><input type="number" id="superHeroCapacity"
						name="superHeroCapacity"></td>
				</tr>
			</table>
			<tr>
				
				<td><input type="submit" value="Submit"></td>
			</tr>
		</form>
	</div>

</body>
</html>