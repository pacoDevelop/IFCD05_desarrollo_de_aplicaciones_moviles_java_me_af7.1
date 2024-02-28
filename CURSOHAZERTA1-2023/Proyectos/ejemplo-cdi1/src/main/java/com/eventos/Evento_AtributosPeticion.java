package com.eventos;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.javaee7.cdi.bean.discovery.Greeting;

/**
 * Application Lifecycle Listener implementation class Evento_AtributosPeticion
 *
 */
@WebListener
public class Evento_AtributosPeticion implements ServletRequestAttributeListener{

	/**
	 * Default constructor.
	 */
	public Evento_AtributosPeticion() {
		System.out.println("SOY EL CONSTRUCTOR DE LOS EVENTOS DE PETICION");
	}


	/**
	 * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
	 */
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		String nombre_atributo = srae.getName();
		Object atributo = srae.getServletRequest().getAttribute(nombre_atributo);
		if (atributo instanceof Greeting) {
			Greeting objeto_inyectado = (Greeting) srae.getSource();
			System.out.println("SE ELIMINA UN ATRIBUTO DE PETICION .. " + atributo.toString());
		} else {
			System.out.println("SE añade otro tipo de atributo .. " + nombre_atributo);
		}
	}

	/**
	 * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
	 */
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		String nombre_atributo = srae.getName();
		Object atributo = srae.getServletRequest().getAttribute(nombre_atributo);
		if (atributo instanceof Greeting) {
			Greeting objeto_inyectado = (Greeting) srae.getSource();
			System.out.println("SE CREA UN ATRIBUTO DE PETICION NUEVO .. " + atributo.toString());
		} else {
			System.out.println("SE crea otro tipo de atributo .. " + nombre_atributo);
		}
	}

	/**
	 * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
	 */
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		String nombre_atributo = srae.getName();
		Object atributo = srae.getServletRequest().getAttribute(nombre_atributo);
		if (atributo instanceof Greeting) {
			Greeting objeto_inyectado = (Greeting) srae.getSource();
			System.out.println("SE MODIFICA UN ATRIBUTO DE PETICION .. " + atributo.toString());
		} else {
			System.out.println("SE modifica otro tipo de atributo .. " + nombre_atributo);
		}
	}

}
