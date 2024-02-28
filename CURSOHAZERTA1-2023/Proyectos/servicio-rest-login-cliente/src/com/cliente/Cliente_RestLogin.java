package com.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

public class Cliente_RestLogin {

	public static void main(String arg[]) {
		// A PARTIR DEL FACTORY CLIENTBUILDER INSTANCIAMOS LA CONEXION
		Client cliente = ClientBuilder.newClient();
		// ********************** PRUEBA OPERACION COMPROBAR CREDENCIALES
		WebTarget objeto_remoto2 = cliente
				.target("http://localhost:8080/servicio-rest-login/jaxrs/servicio_login/comprobar_Credenciales");
		// INDICAMOS EL TIPO DE INFORMACION A MANDAR EN EL CUERPO DE LA PETICION
		Builder tipo_peticion2 = objeto_remoto2.request(MediaType.APPLICATION_JSON);
		// CRECION DE LOS DATOS QUE SE VAN A MANDAR AL SERVICIO
		Usuario usuario_prueba = new Usuario();
		usuario_prueba.setNombreUsuario("Juan");
		usuario_prueba.setPassword("admin");
		// PARAMETROS PARA LA CABECERA DE LA PETICION
		tipo_peticion2.header("Content-Type", "application/json");
		tipo_peticion2.header("Accept", "application/json");
//		System.out.println(JSONObject.fromObject(usuario_prueba).toString());
		// CONVERSION DEL OBJETO AL FORMATO PEDIDO
		Entity<Usuario> datos_usuario = Entity.json(usuario_prueba);
		Respuesta_Servicio respuesta = tipo_peticion2.post(datos_usuario, Respuesta_Servicio.class);
		System.out.println(respuesta.getMensaje());
		
	}

}
