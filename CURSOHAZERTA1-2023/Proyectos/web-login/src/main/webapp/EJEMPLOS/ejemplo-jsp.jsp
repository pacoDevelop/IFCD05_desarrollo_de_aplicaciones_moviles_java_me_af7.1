<!-- Pagina de ejemplo HTML -->
<!-- version: 2.7-->

<!-- *** DIRECTIVAS DE JSP *** -->
<!-- CONFIGURACION DE LA PAGINA -->
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-15"
	isErrorPage="false" errorPage="" extends="PAQUETES Y CLASE"
	contentType="text/html; charset=ISO-8859-15"%>
<!-- CARGA DE LIBRERIA DE ETIQUETAS EXTERNAS -->
<%@ taglib uri="RUTA NOMBRE DEL FICHERO TLD" prefix="PREFIJO"%>
<!-- *** SCRIPT DE CODIGO JAVA *** -->
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
<!-- EXPRESION DINAMICA JSP -->
<base href="<%=basePath%>">

</head>

<body>
	<!-- *** REDIRECIONAMIENTO A LA SIGUIENTE PAGINA/COMPONENTE *** -->
	<jsp:forward page="RUTA Y NOMBRE PAGINA -- URLPATTERN" />
	<!-- OPCION CON PARAMETROS -->
	<jsp:forward page="RUTA Y NOMBRE PAGINA -- URLPATTERN">
		<jsp:param value="VALOR PARAMETRO" name="NOMBRE PARAMETRO" />
	</jsp:forward>

	<!-- LLAMADA A UN FRAGMENTO DE PAGINA -->
	<jsp:include page="RUTA NOMBRE DE PAGINA JSP" />
	<!-- OPCION CON PARAMETROS -->
	<jsp:include page="RUTA NOMBRE DE PAGINA JSP">
		<jsp:param value="VALOR PARAMETRO" name="NOMBRE PARAMETRO" />
	</jsp:include>

	<!-- CREACION/RECUPERACION DE ATRIBUTOS -->
	<jsp:useBean id="NOMBRE" class="PAQUETES CLASE" type="PAQUETES CLASE"
		scope="page">
		<!-- OPCION DE INYECCION DE VALORES -->
		<jsp:setProperty property="VALOR" name="NOMBRE" />
	</jsp:useBean>

	<!-- ***** EXPRESIONES DINAMICAS EN JSP (EL) ***** -->

	${OBJETO.METODO}
	${OBJETO.PROPIEDAD} 
	${EXPRESION LOGICA} ${X==0 ? VALOR SI : VALOR NO }
	${EXPRESION ARITMETICA} ${ (5 * 10)-2 }
	
	<!-- OBJETOS IMPLICITOS -->
	${pageScope}
	${requestScope} -- CONTEXTO DE PETICION
	${sessionScope} -- CONTEXTO DE SESION
	${applicationScope} - CONTEXTO DE APLICACION
	${header} -- PARAMETROS DE LA CABECERA
	${headerValues}
	${param} -- PARAMETROS DE LA PETICION
	${paramValues}
	${initParam} -- PARAMETROS DE CONFIGURACION
	${pageContext}
	${cookie} -- COOKIES DE LA PETICION
</body>
</html>
