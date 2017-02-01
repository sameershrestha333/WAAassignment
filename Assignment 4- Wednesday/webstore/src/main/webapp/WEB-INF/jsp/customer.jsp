<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

		<hr>
		<div class="container">

			<form:form method="post" action="customer" modelAttribute="customer"
				class="form-horizontal">


				<div class="form-group">
					<label for="c">Country</label>
					<form:select id="c" path="country" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${countries}" />
					</form:select>
				</div>

				<div class="form-group">
					<label for="j">Java Skills</label>
					<form:select path="javaSkills" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${javaskills}" />
					</form:select>
				</div>
				<div class="form-group">
					<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
				</div>

				<br />

				
			</form:form>


		</div>
		