<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>Login In</title>
	<!-- Meta-Tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<meta name="keywords" content="Particles Login Form Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //Meta-Tags -->
	<!-- Stylesheets -->
	<link href="css/style.css" rel='stylesheet' type='text/css' />
	<!-- online fonts-->
	<link href="https://fonts.googleapis.com/css?family=Amiri:400,400i,700,700i" rel="stylesheet">
</head>

<body>
	<!--  particles  -->
	<div id="particles-js"></div>
	<!-- //particles -->
	<div class="w3ls-pos">
		<h1>Zoho Login Form</h1>
		<div class="w3ls-login box">
			<!-- form starts here -->
			<form action="<%=request.getContextPath()%>/home" method="post">
				<div class="agile-field-txt">
					<input type="email" name="uname" placeholder="Email" required="" />
				</div>
				<div class="agile-field-txt">
					<input type="password" name="upwd" placeholder="Password" required="" id="myInput" />
				</div>
				<div class="agile_label">
						<input id="check3" name="check3" type="checkbox">
						<label class="check" for="check3">Remember me</label>
					</div>
				<div class="w3ls-bot">
					<input name ="login" type="submit" value="LOGIN">
				</div>
			</form>
		</div>
		<!-- //form ends here -->
		<!--copyright-->
		<div class="copy-wthree">
			<p>
				<a href="sign_IN.jsp" target="_blank">Click Here to Sign_Up</a>
			</p>
		</div>
		<!--//copyright-->
	</div>
	<!-- scripts required  for particle effect -->
	<script src='js/particles.min.js'></script>
	<script src="js/index.js"></script>
	<!-- //scripts required for particle effect -->

 
</body>
</html>