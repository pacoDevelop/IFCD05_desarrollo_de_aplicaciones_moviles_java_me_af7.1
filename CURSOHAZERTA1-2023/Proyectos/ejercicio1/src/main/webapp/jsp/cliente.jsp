<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Controlar_Pedido" method="post">
		<table>
			<%-- PRIMERA LINEA FORMULARIO --%>
			<tr>
				<td>Codigo cliente:</td>
				<td><input type="text" id="cod_cliente" name="cod_cliente"
					size="5" value="${requestScope.cliente.cod_cliente}" /></td>
				<td>Nombre cliente:</td>
				<td><input type="text" id="nombre_cliente"
					name="nombre_cliente" size="25"
					value="${requestScope.cliente.nombre_cliente}" /></td>
				<td>Telefono:</td>
				<td><input type="text" id="telefono" name="telefono" size="9"
					value="${requestScope.cliente.telefono}" /></td>
			</tr>
			<%-- SEGUNDA LINEA FORMULARIO --%>
			<tr>
				<td>Cif-NIF</td>
				<td><input type="text" id="cif" name="cif" size="9"
					value="${requestScope.cliente.cif}" /></td>
				<td>Calle :</td>
				<td><input type="text" id="calle" name="calle" size="25"
					value="${requestScope.cliente.calle}" /></td>
				<td>Ciudad :</td>
				<td><input type="text" id="ciudad" name="ciudad"
					value="${requestScope.cliente.ciudad}" /></td>
			</tr>
			<%-- TERCERA LINEA DEL FORMULARIO --%>
			<tr>
				<td>Provincia :</td>
				<td><input type="text" id="provincia" name="provincia" size="9"
					value="${requestScope.cliente.provincia}" /></td>
				<td>Email:</td>
				<td><input type="text" id="email" name="email" size="25"
					value="${requestScope.cliente.email}" /></td>
				<td>Codigo postal:</td>
				<td><input type="text" id="cod_postal" name="cod_postal"
					value="${requestScope.cliente.cod_postal}" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Comprobrar">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>