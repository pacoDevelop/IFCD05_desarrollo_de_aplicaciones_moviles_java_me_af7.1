package com.etiquetas;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * Ejemplo de etiqueta personaliza
 * @author jsolv
 *
 */
public class Ruta_DinamicaAplicacionParametro extends SimpleTagSupport {
	// PROPIEDAD DE CLASE RECIBIDA POR INYECCION DE DEPENDENCIAS
	private HttpServletRequest contexto_peticion;

	@Override
	public void doTag() throws JspException, IOException {
		// CALCULAMOS LA RUTA DINAMICAMENTE PARA PASARELA A LA PAGINA
		String path = contexto_peticion.getContextPath();
		String basePath = contexto_peticion.getScheme() + "://" + contexto_peticion.getServerName() + ":"
				+ contexto_peticion.getServerPort() + path + "/";
		// ESCRIBIR EL HTML PARA LA PAGINA JSP
		try {
			this.getJspContext().getOut().append("<base href='" + basePath + "'/>");
		} catch (IOException e) {
			// ERROR EN PROCESO DE SALIDA
			e.printStackTrace();
		}
	}

	// ACCESORES PARA EL SERVIDOR
	public void setContexto_peticion(HttpServletRequest contexto_peticion) {
		this.contexto_peticion = contexto_peticion;
	}

}
