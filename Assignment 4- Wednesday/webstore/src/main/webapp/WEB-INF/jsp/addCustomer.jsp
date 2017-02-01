<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">


<div class="container">
	<div class="page-header">
		<h1>Customer Entry Form</h1>
		<p class="lead">Fill the below information to add a customer !</p>

		<a href="?locale=en" class="btn btn-success">English</a> <a
			href="?locale=fr" class="btn btn-warning">Nepali</a>

	</div>

	<form:form action="customerForm" method="post"
		modelAttribute="customerForm" class="form-horizontal">


		<div class="form-group">

			<!-- <label for="username">
				User Name
							 
				
				</label> -->
			<label for="username"> <spring:message code="username" />
			</label>

			<div class="alert alert-warning fade in">
				<form:errors path="username" />
			</div>
			<form:input path="username" placeholder="username" id="username"
				class="form-control" />
		</div>




		<div class="form-group">
			<label for="address"><spring:message code="address" /></label>

			<div class="alert alert-warning fade in">
				<form:errors path="address" />
			</div>
			<form:input path="address" placeholder="address" id="address"
				class="form-control" />
		</div>

		<div class="form-group">
			<label for="birthdate">Birthdate</label>
			<div class="alert alert-warning fade in">
				<form:errors path="birthdate" />
			</div>
			<form:input type="text" path="birthdate" placeholder="birthdate"
				id="birthdate" class="form-control" />
		</div>

		<div class="form-group">
			<label for="password">Password</label>
			<div class="alert alert-warning fade in">
				<form:errors path="password" />
			</div>
			<form:password path="password" placeholder="password" id="password"
				class="form-control" />
		</div>

		<div class="form-group">
			<label for="sex">Sex</label>
			<div class="alert alert-warning fade in">
				<form:errors path="sex" />
			</div>
			<label for="sex"> <form:radiobutton path="sex" id="sex"
					value="M" class="radio-inline" /> Male
			</label> <label> <form:radiobutton path="sex" id="sex" value="F"
					class="radio-inline" /> Female
			</label>

		</div>


		<div class="form-group">
			<input type="submit" value="Submit"
				class="btn btn-lg btn-success btn-block">
		</div>
	</form:form>

</div>