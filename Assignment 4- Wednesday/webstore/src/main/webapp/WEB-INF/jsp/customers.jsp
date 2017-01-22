<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="container">
	<h2>Customer info</h2>

	<div class="table-responsive">
		<table class="table table-bordered table-hover table-striped">
			<thead>
				<tr>
					<th>UserName</th>
					<th>Address</th>
					<th>Date of birth</th>
					<th>Password</th>
					<th>Sex</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${customerForm.username}</td>
					<td>${customerForm.address}</td>

					<td><fmt:formatDate value="${customerForm.birthdate}"
							pattern="yyyy-MM-dd" /></td>
					<td>${customerForm.password}</td>
					<td>${customerForm.sex}</td>
				</tr>
			</tbody>
		</table>
	</div>

	<br> <a href="/webstore/customerForm" class="btn btn-default">Back</a>



</div>



