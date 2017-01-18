<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
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

    <title>WebStore</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">



    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/css/justified-nav.css" rel="stylesheet">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">

      <!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
      <div class="masthead">
        <h3 class="text-muted">Sameer Web Store</h3>
        <nav>
          <ul class="nav nav-justified">
            <li><a href="/">Home</a></li>
            <li><a href="products">Products</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Downloads</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
        </nav>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1 class="text-muted">Welcome to Sameer Webstore</h1>
        <p class="lead">Webstore is a form of electronic commerce whereby consumers directly buy goods or services from a seller over the Internet without an intermediary service. </p>
        <p><a class="btn btn-lg btn-success" href="products" role="button">View Products</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-4">
          <h2>Payment</h2>
          <p>An affordable way to open an online store with PayPal, UPS, FedEx and USPS compatability
           and follwing :</p>
         <p>
         	<ul>
         	<li>Credit</li>
         	         	<li>Debit</li>
         	         	<li>Check</li>
         	         	<li>Advance payment</li>
         	         	<li>Cash on delivery
         	         	</li>
         	         	<li>Invoice</li>
         	
         	</ul>
         </p>
         
             </div>
        <div class="col-lg-4">
          <h2>Defination</h2>
          <p>Online shopping is the process whereby consumers directly buy goods or services from a seller in real-time, without an intermediary service, over the Internet
           </p>
           <p>Provides a good and reliable online business, providing the customer with a simple and rewarding shopping experience
           </p>
          <p><a class="btn btn-primary" href="products" role="button">View Products &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <h2>e-Commerce: </h2>
          <p>Buying and Selling on the Internet.</p>
          <p>Selling on the Internet</p>
          <p>Buying on the Internet
          </p>
          <p><a class="btn btn-primary" href="products" role="button">View Products &raquo;</a></p>
        </div>
      </div>

      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; 2016 Company, Inc.</p>
      </footer>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>