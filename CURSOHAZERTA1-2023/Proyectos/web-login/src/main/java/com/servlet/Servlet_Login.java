package com.servlet;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.IUsuarios_Fachada;
import com.modelo.Usuarios;
import com.modelo.Usuarios_Fachada;

/**
 * Servlet implementation class Servlet_Login
 */
//@WebServlet(description = "Tratamiento de credenciales de entrada a la aplicacion", urlPatterns = { "/Login" })
public class Servlet_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
			throws ServletException, IOException {
		// CREAMOS EL RECURSO IDIOMATICO SEGUN PREFERENCIAS DE USUARIO
		ResourceBundle rb = ResourceBundle.getBundle((String) peticion.getSession().getAttribute("idioma_elegido"));
		// PROPIEDADES LOCALES DEL METODO
		boolean valido = true;
		String salida = "jsp/principal.jsp?tarea=login.jsp";
		String error_nombre = null;
		String error_clave = null;
		// 1º CAPTURA DE PARAMETROS DE LA PETICION
		String nombre_usuario = peticion.getParameter("nombre_usuario");
		String clave_usuario = peticion.getParameter("clave_usuario");
		// 2º CONVERSION - NINGUNA NO ES NECESARIO
		// 3º VALIDACION
		if (nombre_usuario.isEmpty()) {
			// GESTION DE ERROR
			error_nombre = rb.getString("login.error.nombrevacio");
			// error_nombre = "EL NOMBRE ES OBLIGATORIO";
			valido = false;
		}
		if (clave_usuario.equals("")) {
			// GESTION DE ERROR
			error_clave = rb.getString("login.error.clavevacio");
//			error_clave = "LA CLAVE ES NECESARIA";
			valido = false;
		} else if (clave_usuario.length() < 5) {
			error_clave = rb.getString("login.error.clavelargo");
//			error_clave = "LA CLAVE DEBE DE SER MAYOR A 5 CARACTERES";
			valido = false;
		}
		// 4 º LOGICA
		if (valido) {
			// USO DE LA CAPA MODELO PARA CONSULTAR LOS DATOS EN LA BASE
			IUsuarios_Fachada usuario_fachada = new Usuarios_Fachada();
			Usuarios usuario_consultado = usuario_fachada.consultar_PorNombre(nombre_usuario);
			// LOGICA DE COMPROBACION DE DATOS
			if (usuario_consultado != null) {
				if (usuario_consultado.getPassword().equals(clave_usuario)) {
					// CREDENCIALES CORRECTAS
					salida = "jsp/principal.jsp?tarea=inicio.jsp";
					// SEGUIMIENTO DE LA SESION
					peticion.getSession().setAttribute("usuario", usuario_consultado);
				} else {
					// ERROR DE CLAVE ERRONEA
					error_clave = rb.getString("login.error.claveerronea");
//					error_clave = "LA CLAVE DADA NO PERTENECE AL USUARIO";
				}
			} else {
				// ERROR DE NOMBRE NO EXISTENTE
				error_nombre = rb.getString("login.error.nombreerroneo");
//				error_nombre = "NO HAY NINGUN USUARIO REGISTRADO CON ESE NOMBRE";
			}
		}
		// LA POSIBLE INFORMACION ACERCA DE LOS ERRORES SE PASAN COMO ATRIBUTOS DE
		// PETICION A LA PAGINA JSP
		if (error_nombre != null || error_clave != null) {
			peticion.setAttribute("error_nombre", error_nombre);
			peticion.setAttribute("error_clave", error_clave);
		}
		// 5º NAVEGACION
		RequestDispatcher navegacion = peticion.getRequestDispatcher(salida);
		navegacion.forward(peticion, respuesta);
	}

}
