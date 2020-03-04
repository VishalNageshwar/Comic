<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<title>index</title>
<link rel="shortcut icon" type="image/x-icon"
	href="./assets/favicon.ico" />
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<style>



body {
background-image: url(/resources/Gif/index.gif); /*You will specify your image path here.*/

-moz-background-size: cover;
-webkit-background-size: cover;
background-size: cover;
background-position: top center !important;
background-repeat: no-repeat !important;
background-attachment: fixed;
}

.hero-text {
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: white;
}

.hero-text button {
	border: none;
	outline: 0;
	display: inline-block;
	padding: 10px 25px;
	color: black;
	background-color: #ddd;
	text-align: center;
	cursor: pointer;
}



.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
h1{
color: #fd2eb3;
}
</style>


<body>

<center>
	
		<h1 style="text-align:center" style="margin-bottom:20px">COMICS</h1>
				
				<button style="margin-bottom: 20px">
					<a class="active" href="/adduniverse">AddUniverse</a>
				</button>
				<br>
				
				<button style="margin-bottom: 20px">
					<a href="/addsuperhero">AddSuperHero</a>
				</button>
				<br>
				<button style="margin-bottom: 20px">
				<br>
					<a href="/addpower">AddPowers</a>
				</button>
				<br>
				
				
		
		</center>
</body>

</html>