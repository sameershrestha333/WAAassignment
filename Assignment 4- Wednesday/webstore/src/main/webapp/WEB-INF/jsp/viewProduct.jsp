<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



		<hr>


		<div class="container">

			<div class="row">
				<form class="form-signin"
					action="/webstore/order/${product.productId}" method="POST">

					<div class="col-md-3">
						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>
							<strong>Manufacturer : </strong>${product.manufacturer}

						</p>
						<p>
							<strong>Category :</strong> ${product.category}
						</p>
						<p>
							<strong>Condition :</strong> ${product.condition}
						</p>
						<p>
							<strong>Units in Stock :</strong> ${product.unitsInStock}
						</p>


						<h4>${product.unitPrice} USD</h4>
						<br /> <label id="qty">Quantity</label>

						<%-- 						<form:input value="1" id="qty"  class="form-control type="number" path="qty" placeholder="Quantity" />
 --%>
						<input type="text" value="1" name="qty" id="qty"
							class="form-control" placeholder="Quantity" required autofocus />

						<br>
						<button type="submit" class="btn btn-warning">
							<span class="glyphicon glyphicon-shopping-cart"></span> Order Now
						</button>
						<a href="/webstore/products" class="btn btn-default">Back</a>

					</div>
				</form>

			</div>


		</div>
