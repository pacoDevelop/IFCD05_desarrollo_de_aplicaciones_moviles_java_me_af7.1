<!-- Pagina principal -->
<!-- fecha: 20-1-2023. -->
<!-- version: 2.7-->

<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://com.atrium.jsg" prefix="jsg"%>

<html>
<head>
<jsg:ruta-parametro contexto_peticion="${pageContext.request}">
</jsg:ruta-parametro>

<!-- *** PETICION DE RECURSOS ADICIONALES AL SERVIDOR *** -->
<!-- HOJAS DE ESTILOS -->
<link rel="stylesheet" type="text/css" href="css/estilos.css" />

<!-- CARGA DE BOOTSTRAP -->
<!-- ESTILOS -->
<link rel="stylesheet" href="bootstrap-3.3.6/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="bootstrap-3.3.6/css/bootstrap-theme.min.css" />
<!-- JAVASCRIPT -->
<script src="bootstrap-3.3.6/js/bootstrap.min.js"></script>
<!-- FIN CARGA DE BOOTSTRAP -->

</head>

<body>
	<%-- DEFINICION DE ZONAS EN LA PLANTILLA DE LA VISTA --%>
	<div id="banner">
		<%-- CONTENIDO FIJO --%>
		<jsp:include page="/jsp/idiomas.jsp" />
	</div>
	<div id="cuerpo">
		<%-- CONTENIDO VARIABLE --%>
		<jsp:include page="/jsp/${param.tarea}" />
	</div>
	<div id="menu">
		<%-- CONTENIDO FIJO --%>
		<jsp:include page="/jsp/menu.jsp" />
	</div>
</body>
</html>
