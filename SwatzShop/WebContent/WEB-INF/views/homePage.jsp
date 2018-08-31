<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/custom.css">
<script type="text/javascript" src="resources/js/registration.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/js/bootstrap.js"></script>
<script>
	$("#carousel").carousel();

	$('.carousel').carousel({
		interval : 1000
	})
</script>
<title>SwatzShop</title>
</head>
<body>
	<div id="mainContainer">
		<div id="headerContainer">
			<jsp:include page="/shared/header.jsp" />
		</div>
		<div id="middleContainer">
			<div id="myCarousel" class="carousel slide">
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for carousel items -->
				<div class="carousel-inner">
					<!-- style=" width:100%; height: 500px !important;" -->
					<div class="item active">
						<a href="http://google.com"><img
							src="resources/images/adidas.jpg" alt="First Slide" /></a>
						<div class="carousel-caption">
							<h3>Flat 50% OFF on every purchase of Rs.2000!!!</h3>
						</div>
					</div>
					<div class="item ">
						<a href="http://google.com"><img src="resources/images/Lakme.jpg"
							alt="Second Slide" /></a>
						<div class="carousel-caption">
							<h3>Flat 20% OFF on every purchase of Rs.2000!!!</h3>
						</div>
					</div>
					<div class="item ">
						<a href="http://google.com"><img src="resources/images/levis.jpg"
							alt="Third Slide"></a>
						<div class="carousel-caption">
							<h3>Flat 60% OFF on every purchase of Rs.2000!!!</h3>
						</div>
					</div>
				</div>
				<!-- Carousel controls -->
				<a class="carousel-control left" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="carousel-control right" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>
	</div>
</body>
</html>