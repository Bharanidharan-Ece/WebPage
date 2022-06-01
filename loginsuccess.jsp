<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User_Profile</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1,h2,h3,h4,h5,h6 {font-family: "Montserrat", sans-serif}
.w3-row-padding img {margin-bottom: 12px}
/* Set the width of the sidebar to 120px */
.w3-sidebar {width: 120px;background: #222;}
/* Add a left margin to the "page content" that matches the width of the sidebar (120px) */
#main {margin-left: 120px}
/* Remove margins from "page content" on small screens */
@media only screen and (max-width: 600px) {#main {margin-left: 0}}
</style>
</head>
<body class="w3-black">
<%
	if(session.getAttribute("currentSessionUser")==null)
	{
		response.sendRedirect("home.jsp");
	} else{
		
	}
%>

<nav class="w3-sidebar w3-bar-block w3-small w3-hide-small w3-center">
  <!-- Avatar image in top left corner
  <img src="/w3images/avatar_smoke.jpg" style="width:100%"> -->
  
  <a href="home.jsp" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
    <i class="fa fa-home w3-xxlarge"></i>
    <p>Sign out</p>
  </a>
 <a href="Pwd_Cng.jsp" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
    <i class="fa fa-eye w3-xxlarge"></i>
    <p>Change Password</p>
  </a>
  </nav>

<!-- Navbar on small screens (Hidden on medium and large screens) -->
<div class="w3-top w3-hide-large w3-hide-medium" id="myNavbar">
  <div class="w3-bar w3-black w3-opacity w3-hover-opacity-off w3-center w3-small">
    <a href="home.jsp" class="w3-bar-item w3-button" style="width:25% !important">Sign out</a>
    <a href="Pwd_Cng.jsp" class="w3-bar-item w3-button" style="width:25% !important">Change Password</a>
  </div>
</div>

<!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
    <h2 class="w3-jumbo"><span class="w3-hide-small">Welcome!!!</span></h2>
    
    <!--  <img src="/w3images/man_smoke.jpg" alt="boy" class="w3-image" width="992" height="1108">-->
  </header>
  <form action="servlet">
<div align = "center">
<h3>Click here to show profile</h3>
<br>
<i class="fa fa-user w3-xxlarge"></i>
    <input type="submit" name = "profile" value= ${currentSessionUser} class="w3-button w3-light-grey w3-padding-large w3-section">
     
    </div>
    </form>
</body>

</html>