
<!-- DIRECTIVAS DE JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- DEFINICION DE PROPERTIES A USAR EN LA PAGINA -->
<fmt:setBundle basename="${sessionScope.idioma_elegido}" />
<form action="Login" method="post">
	<table>
		<tr>
			<td><fmt:message key="formu.login.eti.nombreusuario" /></td>
			<td><input type="text" name="nombre_usuario"
				value="${param.nombre_usuario}"></td>
			<td>${requestScope.error_nombre}</td>
		</tr>
		<tr>
			<td><fmt:message key="formu.login.eti.claveusario" /></td>
			<td><input type="password" name="clave_usuario"
				value="${param.clave_usuario}"></td>
			<td>${requestScope.error_clave}</td>
		</tr>
		<tr>
			<td colspan="2"><fmt:message key="formu.login.bot.comprobar"
					var="boton" /> <input type="submit" value="${boton}"></td>
		</tr>
	</table>
</form>
