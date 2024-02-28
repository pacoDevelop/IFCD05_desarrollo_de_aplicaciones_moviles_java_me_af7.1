package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.Cliente;

/**
 * Servlet implementation class Servlet_Cliente
 */
@WebServlet(description = "Gestion de clientes", urlPatterns = { "/Controlar_Pedido" })
public class Servlet_Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
			throws ServletException, IOException {
		boolean valido = true;
		String salida = "jsp/cliente.jsp";
		// CAPTURA DE PARAMETROS DE LA PETICION
		// CREO OBJETO DE DOMINIO
		Cliente cliente = new Cliente();
		// PASO LOS PARAMETROS A LAS PROPIEDADES DEL OBJETO DE DOMINIO
		cliente.setCod_cliente(peticion.getParameter("cod_cliente"));
		cliente.setNombre_cliente(peticion.getParameter("nombre_cliente"));
		cliente.setTelefono(peticion.getParameter("telefono"));
		cliente.setCif(peticion.getParameter("cif"));
		// CONVERSION DE VALORES
		if (!peticion.getParameter("cod_postal").equals("")) {
			try {
				cliente.setCod_postal(Integer.valueOf(peticion.getParameter("cod_postal")));
			} catch (Exception e) {
				// ERROR DE CONVERSION- VALOR NO NUMERICO
				valido = false;
				System.out.println("valor no numerico");
			}
		} else {
			// ERROR DE CONVERSION- CAMPO VACIO
			valido = false;
			System.out.println("campo codigo postal vacio");
		}
		// VALIDACION
		if (valido) {
			if (cliente.getCod_cliente().equals("")) {
				// ERROR
				valido = false;
			}
			if (cliente.getNombre_cliente().equals("")) {
				// ERROR
				valido = false;
			}
			if (cliente.getTelefono().equals("")) {
				// ERROR
				valido = false;
			}
			if (cliente.getCif().equals("")) {
				// ERROR
				valido = false;
			}
		}

		if (valido) {
			// NAVEGACION A LA PAGINAS SIGUIENTE
			salida = "jsp/otra.jsp";
		} else {
			// DATOS PARA EL FORMULARIO PARA LA MODIFICACION POR PARTE DEL USUARIO
			peticion.setAttribute("cliente", cliente);
		}
		// NAVEGACION
		RequestDispatcher navegacion = peticion.getRequestDispatcher(salida);
		navegacion.forward(peticion, respuesta);
	}

}
