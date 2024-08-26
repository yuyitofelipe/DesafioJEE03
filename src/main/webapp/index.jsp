<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Calcular</h1>
		<div class="grid">
			<form name="formulario" action="/DesafioMiCalculadora/Servlet"
				method="post">
				<div class="field">
					<label for="Numero 1">Primer valor</label> <input type="number"
						name="numero1" placeholder="Ingresar un número entero">
				</div>
				<div class="field">
					<label for="Numero 2">Segundo valor</label> <input type="number"
						name="numero2" placeholder="Ingresar un número entero">
				</div>
				<select class="field" name="operacion">
					<option selected>Seleccione operacion</option>
					<option value="suma">Sumar</option>
					<option value="resta">Restar</option>
					<option value="multiplicacion">Multiplicar</option>
					<option value="division">Dividir</option>
					<option value="ordenarNumero">Ordenar</option>
					<option value="parOImpar">Par o Impar</option>
				</select>
				<div class="actions">
					<input type="submit" value="Calcular">
				</div>
			</form>
		</div>
	</main>
</body>
</html>