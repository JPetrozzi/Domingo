<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="bootstrap/bootstrap.css"/>
		<title>¡Bienvenido!</title>
	</head>
	<body>
		<!-- Fixed Navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="index.jsp">Domingo</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <form action="" method="post" class="navbar-form navbar-right">
	            <div class="form-group">
	              <input type="text" placeholder="Usuario" class="form-control" name="user">
	            </div>
	            <div class="form-group">
	              <input type="password" placeholder="Password" class="form-control" name="pass">
	            </div>
	            <button type="submit" class="btn btn-success">Ingresar</button>
	          </form>
	        </div>
	      </div>
	    </nav>
	    <!-- Fixed Navbar -->
	    
	    <div class="container theme-showcase" role="main">
	      <div class="jumbotron">
	      	<br><br>
	        <h1>Theme example</h1>
	        <p>This is a template showcasing the optional theme stylesheet included in Bootstrap. Use it as a starting point to create something more unique by building on or modifying it.</p>
	      	<p><a href="nuevaCuenta.jsp" class="btn btn-primary btn-lg" role="button">Registrarse &raquo;</a></p>
	      </div>
      	</div>
      
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="bootstrap/bootstrap.js"></script>
	</body>
</html>