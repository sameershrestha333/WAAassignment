<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




	<div class="container">
		<div class="page-header">
			<h1>Add Product</h1>
			<p class="lead">Fill the below information to add a product !</p>
		</div>

		<form:form method="post"
			modelAttribute="products" class="form-horizontal">
			<form:hidden path="productId"/>


			<div class="form-group">
				<label for="productId">ProductId</label>
				<form:errors path="productId" cssStyle="color: #ff4740" />
				<form:input path="productId" placeholder="Product Id" id="productId"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="name">Name</label>
				<form:errors path="name" cssStyle="color: #ff4740" />
				<form:input path="name" placeholder="Product Name" id="name"
					class="form-control" />
			</div>

			<div class="form-group">
				<label for="unitPrice">unitPrice</label>
				<form:errors path="unitPrice" cssStyle="color: #ff4740" />
				<form:input path="unitPrice" placeholder="Unit Price" id="unitPrice"
					class="form-control" />
			</div>


			<div class="form-group">
				<label for="description">Description</label>
				<form:errors path="description" cssStyle="color: #ff4740" />
				<form:input path="description" placeholder="description"
					id="description" class="form-control" />
			</div>

			<div class="form-group">
				<label for="manufacturer">Manufacturer</label>
				<form:errors path="manufacturer" cssStyle="color: #ff4740" />
				<form:input path="manufacturer" placeholder="manufacturer"
					id="manufacturer" class="form-control" />
			</div>

			<div class="form-group">
				<label for="category">Category</label>
				<form:errors path="category" cssStyle="color: #ff4740" />
				<form:input path="category" placeholder="category" id="category"
					class="form-control" />
			</div>


			<div class="form-group">
				<label for="unitsInStock">UnitsInStock</label>
				<form:errors path="unitsInStock" cssStyle="color: #ff4740" />
				<form:input path="unitsInStock" placeholder="unitsInStock"
					id="unitsInStock" class="form-control" />
			</div>

			<div class="form-group">
				<label for="condition">Condition</label>
				<form:errors path="condition" cssStyle="color: #ff4740" />
				<form:input path="condition" placeholder="condition" id="condition"
					class="form-control" />
			</div>







			<br>
			<div class="form-group">
				<input type="submit" value="Submit" class="btn btn-success">

			<a href="/webstore/products"
				class="btn btn-default">Cancel</a>
				
			</div>

			
		</form:form>


		