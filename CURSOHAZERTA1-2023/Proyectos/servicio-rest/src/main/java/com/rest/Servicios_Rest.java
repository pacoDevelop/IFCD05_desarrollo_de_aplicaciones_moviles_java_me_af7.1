package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Ejemplo de definicion de metodos rest. Segun que tipo de informacion mande el
 * cliente se cambia el Consumes y la inyeccion del valor de la peticion
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 2.0.
 * 
 */
@Path("/servicio")
public class Servicios_Rest {

	// ********************** DATOS EN EL CUERPO DE LA PETICION
	/**
	 * Proceso de peticion via post.
	 * 
	 * @param nombre Datos llegados en el cuerpo de la peticion.
	 * @return Datos enviados al cliente.
	 */
	@POST
	@Path("/prueba_post")
	@Produces("application/json")
	@Consumes("application/json")
	public String peticion_Post(String nombre) {
		System.out.println("Soy la peticion post ......" + nombre);
		return "{\"nombre\":\"soy la peticion post json\"}" + nombre;
	}

	/**
	 * Proceso de peticion via post.
	 * 
	 * @param nombre Datos llegados en el cuerpo de la peticion.
	 * @return Datos enviados al cliente.
	 */
	@POST
	@Path("/prueba_post2")
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public String peticion_Post2(@FormParam("primer_paramformu") String primero,
			@FormParam("segundo_paramformu") String segundo) {
		System.out.println("Soy la peticion post ......" + primero + " - " + segundo);
		return "{\"nombre\":\"soy la peticion post formulario\"}";
	}

	// *************************** DATOS EN LA URL
	/**
	 * Proceso de peticion via get.
	 * 
	 * @param nombre Datos llegados en la url de la peticion.
	 * @return Datos enviados al cliente.
	 */
	@GET
	@Path("/prueba_get")
	@Produces("application/json")
	@Consumes("application/json")
	public String peticion_Get(@HeaderParam("cabecera") String datos_cabecera) {
		System.out.println("Soy la peticion get ......" + datos_cabecera);
		return "{\"nombre\":\"soy la peticion get\"}";
	}
}
