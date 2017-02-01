<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">





	<form class="form-signin" action="login" method="POST">
		<h2 class="form-signin-heading">Please sign in</h2>
		<label for="username" class="sr-only">Username</label> <input
			type="text" value="${cookie.userName.value}" name="user_name"
			id="username" class="form-control" placeholder="Username" required
			autofocus> <br> <label for="inputPassword"
			class="sr-only">Password</label> <input type="password"
			id="inputPassword" class="form-control" placeholder="Password"
			name="password" required>
		<div class="checkbox">
			<label> <input type="checkbox" name="remember"
				<c:if test="${cookie.containsKey('userName')}">checked</c:if> />
				Remember me
			</label>
		</div>
		<label>${err_msg}</label>

		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
		<br />


	</form>


</div>
<!-- Site footer -->


<!-- /container -->

