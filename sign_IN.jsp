<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ZOHO Sign Up</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Simple Login and Signup Form web template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,0); } </script>
<!-- //custom-theme -->
<link href="css1/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js1/jquery-1.9.1.min.js"></script>
<!--// js -->
<link rel="stylesheet" type="text/css" href="css/easy-responsive-tabs.css " />
 <link href="//fonts.googleapis.com/css?family=Questrial" rel="stylesheet">
</head>
<body class="bg agileinfo">
   <h1 class="agile_head text-center"> Welcome to ZOHO Registration page</h1>
   <div class="w3layouts_main wrap">
    <!--Horizontal Tab-->
        <div align = "center" id="parentHorizontalTab_agile">
       
      <!--      <ul class="resp-tabs-list hor_1">
                <font size ="5"color ="white">
               <u> <p style="text-align:center:">SignUp</p></u>
                </font>
            </ul>-->  
            
            </div>
                <div class="agile_its_registration">
                    <form action="register" method="get" class="agile_form">
					  <p>Username</p>
					  <input type="text" name="uname" required="required" />
					  <p>Email</p>
					  <input type="email" name="uemail" required="required" />
					  <p>Password</p>
					  <input type="password" name="upwd" id="password1"  required="required">
					  <p>Confirm Password</p>
					  <input type="password" name="upwd" id="password2"  required="required">
					  <p>Mobile Number</p>
					  <input type="text" name="unumber" id="unumber"  required="required">
					  <p>Date of Birth</p>
					  <input type="date" name="dob" required="required" />
				
         	  			<div class="">
							<label class=""><input id = "cb" type="checkbox" name="checkbox" required="required" >I accept the terms and conditions</label>
						</div>
					   <input type="submit" name="Signup" value="Signup"/>
					   <input type="reset" value="Reset" />
					</form> 
				</div>
            </div>
        </div>
		 <!-- //Horizontal Tab -->
    </div>
	<div class="agileits_w3layouts_copyright text-center">
			<p><a name ="home" href="home.jsp">I am Already an user</a></p>
	</div>
<!--tabs-->
<script src="js/easyResponsiveTabs.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	//Horizontal Tab
	$('#parentHorizontalTab_agile').easyResponsiveTabs({
		type: 'default', //Types: default, vertical, accordion
		width: 'auto', //auto or any width like 600px
		fit: true, // 100% fit in a container
		tabidentify: 'hor_1', // The tab groups identifier
		activate: function(event) { // Callback function if tab is switched
			var $tab = $(this);
			var $info = $('#nested-tabInfo');
			var $name = $('span', $info);
			$name.text($tab.text());
			$info.show();
		}
	});
});
</script>
<script type="text/javascript">
		window.onload = function () {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}
		function validatePassword(){
			var pass2=document.getElementById("password2").value;
			var pass1=document.getElementById("password1").value;
			if(pass1!=pass2)
				document.getElementById("password2").setCustomValidity("Passwords Don't Match");
			else
				document.getElementById("password2").setCustomValidity('');	 
				//empty string means no validation error
		}

</script>
<!--//tabs-->
</body>
</html>
