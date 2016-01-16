<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Meal Time</title>
    
    <meta name="keywords" content=" ">
	<meta name="description" content=" ">

    <!-- spring:url -->
	<spring:url value="/resources/css/bootstrap.css" var="bootstrapCSS" />
	<spring:url value="/resources/css/styles.css" var="customCSS" />
	<spring:url value="/resources/js/jquery.min.1.11.3.js" var="jqueryminJS" />
	<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapminJS" />
	<spring:url value="/resources/images" var="imageURL" />
	<link href="${bootstrapCSS}" rel="stylesheet" />
	<link href="${customCSS}" rel="stylesheet" />
	<script src="${jqueryminJS}"></script>
	<script src="${bootstrapminJS}"></script>
	<!-- Finish adding tags -->
    
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>
    
    <link rel="icon" type="image/png" href="${imageURL}/favicon-16x16.png" sizes="16x16"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <div class="container-fluid bg-pattern">
    <div class="container custom-container mt20 mb20">
	    <div class="row header-bg">
		    <div class="col-md-3">
			    <div class="logo">Meal Time</div>
		    </div>
		    <div class="col-md-9">
			    <ul class="list-1 pull-right">
			    	<li><a href="#"><img src="${imageURL}/email.png">&nbsp; onlineorders@mealtime.com</a></li>
			    	<li><img src="${imageURL}/tele.png">&nbsp; +91 40-41234567</li>
			    	<li><img src="${imageURL}/iphone.png">&nbsp; +91 9123456789</li>
			    	<li><img src="${imageURL}/phonetime.png">&nbsp; Daily - 6AM to 12PM</li>
			    </ul>
			    <div class="clearfix"></div>
			    <h1 class="titile-01">Meal Time Online Food Ordering Service</h1>
		    </div>
	    </div>
	    
	    <div class="row">
		    <div class="col-md-3">
			    <ul class="list-2">
			    	<li><img src="${imageURL}/line.png"></li>
			    	<li><a href="#">Home</a></li>
			    	<li><a href="#" class="active">About Us</a></li>
			    	<li><a href="#">Profile</a></li>
			    	<li><a href="#">AM Meal</a></li>
			    	<li><a href="#">PM Meal</a></li>
			    	<li><a href="#">Payment</a></li>
			    	<li><a href="#">Contact US</a></li>
			    	<li><img src="${imageURL}/line.png"></li>
			    </ul>
		    </div>
		    <div class="col-md-9">
			    <div class="col-md-6">
			    <c:if test="${not empty message}">
    ${message}
</c:if>
			    <form:form method="post" modelAttribute="user" action="saveProfile.spring">
			    <form:hidden path="userId"/>
<label>Name:</label><form:input path="firstName"/>	<br/>
<label>Email:</label><form:input path="email"/><br/>

<label>phone:</label><form:input path="mobileNumber"/><br/>
<label>Address:</label><form:textarea path="address"></form:textarea><br/>	

<button class="btn btn-danger" type="submit" value="submit" name="submit">${buttonName} </button>
</form:form>
</div>
	

	</div>
				</div>
		    <a class="btn btn-danger subscribe-btn pull-right" href="#" role="button">Subscribe Now</a>
	    </div>
	    
	    <div class="row">
		    <div class="col-md-6">
		    	<ul class="list-3">
		    		<li>&copy; 2016 Food Sense, all rights reserved.</li>
			    	<li><a href="#">Privacy Policy</a></li> |
			    	<li><a href="#">Terms of Use</a></li>
		    	</ul> 
				
		    </div>
		    <div class="col-md-6">
		    	<ul class="list-4">
			    	<li><a href="#" class="fb"></a></li>
			    	<li><a href="#" class="tw"></a></li>
			    	<li><a href="#" class="gplus"></a></li>
			    	<li><a href="#" class="utube"></a></li>
		    	</ul> 
				
		    </div>
	    </div>
	    
    </div>
	
	
	</div>
	<!--  <script src="js/jquery.min.1.11.3.js"></script>
    jQuery (necessary for Bootstrap's JavaScript plugins)
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    Include all compiled plugins (below), or include individual files as needed
    <script src="js/bootstrap.min.js"></script> -->
  </body>
</html>