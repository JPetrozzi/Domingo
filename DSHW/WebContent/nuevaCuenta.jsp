<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="bootstrap/bootstrap.css"/>
		<title>¡Bienvenido!</title>
	</head>
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <a class="navbar-brand" href="index.jsp">Domingo</a>
	        </div>
	       	<a class="navbar-brand navbar-right" href="index.jsp">Volver</a>
	      </div>
	    </nav>
		<div class="container">
			<div class="row">
				<div class="col-md-4"></div>
					<div class="col-md-4">
						<form class="form-signin" action="RegistroPersona" method="post">
							<br><br><br>
					        <h2 class="form-signin-heading text-center">Nueva Cuenta</h2>
					        <label for="inputNombre" class="sr-only">Nombre</label>
					        <input type="text" name="nombre" id="inputNombre" class="form-control" placeholder="Nombre" required autofocus>
					        <label for="inputApellido" class="sr-only">Apellido</label>
					        <input type="text" name="apellido" id="inputApellido" class="form-control" placeholder="Apellido" required>
					        <label for="inputEmail" class="sr-only">Email</label>
					        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email" required>
					        <label for="inputUser" class="sr-only">Usuario</label>
					        <input type="text" name="user" id="inputUser" class="form-control" placeholder="Usuario" required>
					        <label for="inputPassword" class="sr-only">Password</label>
					        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
					        <label for="inputRePassword" class="sr-only">Confirmar Password</label>
					        <input type="password" id="inputRePassword" class="form-control" placeholder="Confirmar Password" required>
					        <br>
					        <button class="btn btn-lg btn-primary btn-block" type="submit">Crear Cuenta</button>
					    </form>
					</div>	
				<div class="col-md-4"></div>
			</div>
			<div class="row">
      			<div class="col-md-12 text-center">
			      	<%
						session = request.getSession();
						if(session.getAttribute("mensajeOK")!=null)
						{
							out.println("<div class=\"well\"><p class=\"lead\" style=\"color: #2FC61F;\">" + (String)session.getAttribute("mensajeOK") + "</p></div>");
							session.setAttribute("mensajeOK", null);
						}
						if(session.getAttribute("mensajeError")!=null)
						{
							out.println("<div class=\"well\"><p class=\"lead\" style=\"color: #F70707;\">" + (String)session.getAttribute("mensajeError") + "</p></div>");
							session.setAttribute("mensajeError", null);
						}
					%>
				</div>
			</div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="bootstrap/bootstrap.js"></script>
	</body>
</html>