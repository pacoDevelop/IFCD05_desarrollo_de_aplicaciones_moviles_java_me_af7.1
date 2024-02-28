package com.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

/**
 * Cliente basico para la prueba remota del servicio rest.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 2.2.
 * 
 */
public class Inicio {

	public static void main(String[] args) {
		// A PARTIR DEL FACTORY CLIENTBUILDER INSTANCIAMOS LA CONEXION
		Client cliente = ClientBuilder.newClient();
		// ********************** DATOS EN EL CUERPO DE LA PETICION
		// *********** PETICION VIA POST
		WebTarget objeto_remoto2 = cliente.target("http://localhost:8080/servicio-rest/jaxrs/servicio/prueba_post");
		// INDICAMOS EL TIPO DE INFORMACION A MANDAR EN EL CUERPO DE LA PETICION
		Builder tipo_peticion2 = objeto_remoto2.request(MediaType.APPLICATION_JSON_TYPE);
		// CONVERSION DEL OBJETO AL FORMATO PEDIDO
		Entity<Datos> datos3 = Entity.json(new Datos("Soy el contenido de la peticion post"));
		Datos respuesta_servicio3 = tipo_peticion2.post(datos3, Datos.class);
		System.out.println(respuesta_servicio3.getNombre());
		// *********** PETICION VIA POST
		WebTarget objeto_remoto22 = cliente.target("http://localhost:8080/servicio-rest/jaxrs/servicio/prueba_post2");
		// INDICAMOS EL TIPO DE INFORMACION A MANDAR EN EL CUERPO DE LA PETICION
		Builder tipo_peticion22 = objeto_remoto22.request();
		// CREACION DE DATOS DE FORMULARIO
		Form formulario = new Form();
		formulario.param("primer_paramformu", "valor_primerparam");
		formulario.param("segundo_paramformu", "valor_segundoparam");
		Entity<Form> formulario_peticion = Entity.entity(formulario, MediaType.APPLICATION_FORM_URLENCODED_TYPE);
		Datos respuesta_servicio33 = tipo_peticion22.post(formulario_peticion, Datos.class);
		System.out.println(respuesta_servicio33.getNombre());
		// *********** PETICION VIA GET
		// A PARTIR DE LA CONEXION OBTENEMOS EL OBJETO REMOTO PARA LANZAR LA
		// PETICION
		WebTarget objeto_remoto = cliente.target("http://localhost:8080/servicio-rest/jaxrs/servicio/prueba_get");
		// FORMATO HTTP DE LA RESPUESTA
		Builder tipo_peticion = objeto_remoto.request(MediaType.APPLICATION_JSON_TYPE);
		// DATOS PARA LA PETICION
		Datos datos_peticion = new Datos("{\"campo_1\":\"Juan\",\"campo_2\":\"admin\"}");
		// CREACION DE LA CABECERA
		tipo_peticion.header("cabecera", datos_peticion.getNombre());
		// LANZAMOS LA PETICION EN TIPO HTTP QUE NOS INTERESA Y OBTENEMOS LA
		// RESPUESTA
		Datos respuesta_servicio = tipo_peticion.get(Datos.class);
		System.out.println(respuesta_servicio.getNombre());
	}

}
