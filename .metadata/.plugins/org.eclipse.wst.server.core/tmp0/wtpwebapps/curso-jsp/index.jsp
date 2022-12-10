<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	<title>Curso JSP</title>
	
	<style>
		form {
			position: absolute;
			top: 40%;
			left: 33%;
			right: 33%;
		}
		
		h5 {
			position: absolute;
			top: 30%;
			left: 33%;
			right: 33%;
		}
		
		.msg {
			position: absolute;
			top: 80%;
			left: 10%;
			right: 10%;
			
			font-size: 15px;
			color: #664d03;
			background-color: #fff3cd;
			border-color: #ffecb5;
		}
	</style>
</head>
<body>
	<h5>Bem vindo ao curso de JSP</h5>
	
	<form action="<%= request.getContextPath() %>/ServletLogin" method="POST" class="row g-3 needs-validation" novalidate>
		<input type="hidden"  value="<%= request.getParameter("url") %>" name="url">
			<div class="mb-3">
				<label class="form-label" for="login">Login</label>
				<input id="login" class="form-control" name="login" type="text" required>
				<div class="invalid-feedback">
					obrigatório
				</div>
				<div class="valid-feedback">
					ok
				</div>
			</div>
			<div class="mb-3">
				<label class="form-label" for="senha">Senha</label>
				<input id="senha" class="form-control" name="senha" type="password" required>
				<div class="invalid-feedback">
					obrigatório
				</div>
				<div class="valid-feedback">
					ok
				</div>
			</div>		
				
			<input type="submit" value="Acessar" class="btn btn-primary">
		
		<h5 class="msg">${msg}</h5>
					
	</form>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<script>(() => {
		  'use strict'
		 
		  const forms = document.querySelectorAll('.needs-validation')

		  Array.from(forms).forEach(form => {
		    form.addEventListener('submit', event => {
		      if (!form.checkValidity()) {
		        event.preventDefault()
		        event.stopPropagation()
		      }

		      form.classList.add('was-validated')
		    }, false)
		  })
		})()</script>
</body>
</html>