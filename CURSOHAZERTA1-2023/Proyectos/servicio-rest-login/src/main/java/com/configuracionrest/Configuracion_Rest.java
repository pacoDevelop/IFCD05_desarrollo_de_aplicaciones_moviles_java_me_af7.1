package com.configuracionrest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.serviciologin.Servicio_Login;

/**
 * Ejemplo de configuracion de multiples servicios REST en la misma aplicacion.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.5.
 *
 */
@ApplicationPath("jaxrs")  // OPCION SOLO SIN WEB.XML
public class Configuracion_Rest extends Application {
	/**
	 * Proceso para indicar mediante los class al controlador (ServletContainer)
	 * cuales son las clases que definen los distintos servicios de la aplicacion.
	 */
	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("SE INICIA LA GESTION DE SERVICIOS");
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(Servicio_Login.class);
		return classes;
	}
}