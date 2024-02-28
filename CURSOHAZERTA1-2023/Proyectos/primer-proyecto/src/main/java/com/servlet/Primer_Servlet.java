package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Primer_Servlet
 */
@WebServlet(description = "Primer Servlet de prueba", urlPatterns = { "/Primer_Servlet" })
public class Primer_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Primer_Servlet() {
       System.out.println("CONSTRUCTOR DEL SERVLET");
    }
    
	@Override
	public void destroy() {
		System.out.println("SOY EL DESTROY");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("SOY EL METODO INIT");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SOY EL METODO GET");
		response.getWriter().append("Servidor en: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SOY EL METODO POST");
		doGet(request, response);
	}

}
