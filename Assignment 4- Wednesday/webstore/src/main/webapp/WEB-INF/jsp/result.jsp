<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


		<div class="container">
			<h2>Customer info</h2>

			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped">
					<thead>
						<tr>
							<th>Country</th>
							<th>Java Skills</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${customer.country}</td>
							<td>${customer.javaSkills}</td>
						</tr>
					</tbody>
				</table>
			</div>

			<%-- <h2>Customer info</h2>
			Country : ${customer.country} <br /> Java Skills :
			${customer.javaSkills} <br /> --%>
		</div>
		<br> <a href="/webstore/customer" class="btn btn-default">Back</a>
