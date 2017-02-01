<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title><tiles:getAsString name="title" /></title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">



<!-- Custom styles for this template -->
<link
	href="${pageContext.request.contextPath}/resources/css/justified-nav.css"
	rel="stylesheet">

<!-- query ui -->
<link
	href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.theme.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.structure.css"
	rel="stylesheet">



<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">

<!--data table-->
<link
	href="${pageContext.request.contextPath}/resources/css/jquery.dataTable.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/dataTables.bootstrap.min.css"
	rel="stylesheet" />


</head>

<body>
	<!-- <div class="container">
		<form class="form-signin" action="logout" method="GET">

			<a href="logout" class="btn btn-info btn-md pull-right"> <span
				class="glyphicon glyphicon-log-out "></span> Log out
			</a>
		</form>
	</div> -->
	<div class="container">

		<!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
		<div class="masthead">


			<nav>
				<h3 class="text-muted">Sameer Web Store</h3>

				<ul class="nav nav-justified">
					<!-- 					<li><a href="home">Home</a></li>
 -->
					<li><a href="products">Product</a></li>
					<li><a href="customer">Customer</a></li>
					<li><a href="customerForm">Add Customer</a></li>
					<!-- <li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li> -->
					<li><a href="logout" class="btn btn-info btn-md"> <span
							class="glyphicon glyphicon-log-out "></span> Log out
					</a></li>

				</ul>
			</nav>
		</div>

		<tiles:insertAttribute name="body" />
		<br> <br>






	</div>
	<!-- /container -->
	<center>
		<tiles:insertAttribute name="footer" />
	</center>

	

	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/jquery-ui/jquery-ui.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	

	<!--data table-->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.min.js"></script>


</body>
</html>