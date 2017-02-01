<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<link
	href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css"
	rel="stylesheet">

<hr>

<div class="table-responsive">
	<table id="table1"
		class="table table-bordered table-hover table-striped">
		<thead>
			<tr class="bg-info">
				<th>Id</th>
				<th>Name</th>
				<th>Price $</th>
				<th>Description</th>
				<th>Manufacture</th>
				<th>Condition</th>
				<!--                  <th>Unit in Order</th>
 -->
				<th>Unit in Stock</th>
				<th></th>
			</tr>

		</thead>
		<tbody>

			<c:forEach items="${products}" var="product">

				<c:url var="updatelink" value="products/showFormForUpdate">
					<c:param name="productId" value="${product.productId }"></c:param>
				</c:url>

				<c:url var="deletelink" value="products/delete">
					<c:param name="productId" value="${product.productId}"></c:param>
				</c:url>
				<tr>
					<td>${ product.productId}</td>

					<td>${ product.name}</td>
					<td>${ product.unitPrice}</td>
					<td>${ product.description}</td>
					<td>${ product.manufacturer}</td>
					<td>${ product.condition}</td>
					<%-- 					    <td>${ product.unitsInOrder}</td>
 --%>
					<td>${ product.unitsInStock}</td>
					<td><a
						href="<spring:url value="viewProduct/${product.productId}"/>">
							<span class="glyphicon glyphicon-info-sign"></span>
					</a></td>


					<td><a href="${updatelink}"> <span
							class="glyphicon glyphicon-pencil"></span>
					</a></td>

					<td><a href="${deletelink}"> <span
							class="glyphicon glyphicon-remove"></span>
					</a></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>

</div>

<spring:url value="/products/addProduct" var="addProduct">
	<%-- <spring:param name="ISBN" value="1234" /> --%>
</spring:url>
<%-- 		<a href="${addProduct}">Add Book</a>
 --%>
<br>
<a href="${addProduct}" class="btn btn-default">Add Product</a>
<script src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js" type="text/javascript">
<!--

//-->
</script>

