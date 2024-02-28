package com.serviciologin;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.excepciones.Validacion_Exception;
import com.modelo.Gestion_Roles;
import com.modelo.Gestion_Usuarios;
import com.modelo.IGestion_Roles;
import com.modelo.IGestion_Usuarios;
import com.modelo.dto.Roles;
import com.modelo.dto.Usuario;
import com.respuesta.ICodigos_Error;
import com.respuesta.Respuesta_Servicio;
import com.validadores.Validar_Datos;

/**
 * Adaptacion a tipo de servicio REST del servicio de login.<br/>
 * Se añaden librerias para la conversion por parte del servicio al formato
 * JSON, incluida una dependencia externa no gestionada por MyEclipse.
 * 
 * @PATH URL concreta de las peticiones a responder por los metodos de esta
 *       clase.
 * 
 * @author Juan Antonio Solves Garcia
 * @version 2.1.
 */
@Path("/servicio_login")
public class Servicio_Login {
	// USUARIO MANDADO POR EL CLIENTE
	private Usuario usuario_aconsultar;
	// RESPUESTA DEL SERVICIO
	private String respuesta;
	private Respuesta_Servicio resultado_operacion;

	/**
	 * Se recibira una cadena de texto que sera un objeto usuario serializado en
	 * JSON.<br/>
	 * En caso de ser correcto se devolvera valor booleano indicando si las
	 * credenciales son validas o no.<br/>
	 * 
	 * La respuesta es objeto respuesta_servicio que engloba toda la informacion
	 * posible. Dicho objeto se convertira a formato Json antes de ser devuelto.
	 * 
	 * @POST Tipo de peticion del protocolo http que recibira este metodo.
	 * @PATH URL concreta para este metodo.
	 * @PRODUCES Tipo MIME para la respuesta concreta de un cliente rest.
	 * @CONSUMES Tipo MIME para la informacion de la peticion del cliente rest.
	 * 
	 * @param usuario Objeto usuario en JSON:
	 * @return Objeto respuesta servicio en JSON.
	 */
	@POST
	@Path("/comprobar_Credenciales")
	@Consumes("application/json")
	@Produces("application/json")
	public Respuesta_Servicio comprobar_Credenciales(Usuario usuario) {
		// VALIDAMOS PREVIAMENTE A LA OPERACION DEL SERVICIO
		boolean valido = inicio_Operacion(usuario);
		// SI LOS PASOS ANTERIORES SON CORRECTOS SE REALIZA EL PROCESO DEL
		// SERVICIO
		if (valido) {
			// CON LA INFORMACION RECIBIDA SE REALIZA LA CONSULTA EN LA BD.
			IGestion_Usuarios gestion_usuarios = new Gestion_Usuarios();
			Usuario usuario_consultado = gestion_usuarios.consultar_PorNombre(usuario.getNombreUsuario());
			if (usuario_consultado != null) {
				// NOMBRE DE USUARIO CORRECTO
				if (usuario_consultado.getPassword().equals(usuario.getPassword())) {
					// CREDENCIALES CORRECTAS
					resultado_operacion.setValor_booleano(true);
					resultado_operacion.setCodigo_error(ICodigos_Error.USUARIO_CORRECTO);
					resultado_operacion.setMensaje("Credenciales correctas");
				} else {
					// PASSWORD INVALIDO
					resultado_operacion.setValor_booleano(false);
					resultado_operacion.setCodigo_error(ICodigos_Error.ERROR_USUARIOCLAVE);
					resultado_operacion.setMensaje("La clave dada no es la del usuario");
				}
			} else {
				// ERROR EN NOMBRE
				resultado_operacion.setValor_booleano(false);
				resultado_operacion.setCodigo_error(ICodigos_Error.ERROR_USUARIOINEXISTENTE);
				resultado_operacion.setMensaje("No existe ningun usuario con ese nombre");
			}
		}
		return resultado_operacion;
	}

	/**
	 * Se recibira una cadena de texto que sera un objeto usuario serializado en
	 * JSON.<br/>
	 * Se devolvera el objeto usuario con el rol cargado.
	 * 
	 * La respuesta es objeto respuesta_servicio que engloba toda la informacion
	 * posible. Dicho objeto se convertira a formato Json antes de ser
	 * devuelto.<br/>
	 * Se define un tipo de salida concreto para el cliente remoto a partir de las
	 * opciones internas del servicio rest. La conversion con el JsonLib en la fecha
	 * no es compatible.
	 * 
	 * @POST Tipo de peticion del protocolo http que recibira este metodo.
	 * @PATH URL concreta para este metodo.
	 * @PRODUCES Tipo MIME para la respuesta concreta de un cliente rest.
	 * @CONSUMES Tipo MIME para la informacion de la peticion del cliente rest.
	 * 
	 * @param usuario Objeto usuario en JSON:
	 * @return Objeto respuesta servicio en JSON.
	 */
	@POST
	@Path("/consultar_Rol")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta_Servicio consultar_Rol(Usuario usuario) {
		// VALIDAMOS PREVIAMENTE A LA OPERACION DEL SERVICIO
		boolean valido = inicio_Operacion(usuario);
		// SI LOS PASOS ANTERIORES SON CORRECTOS SE REALIZA EL PROCESO DEL
		// SERVICIO
		if (valido) {
			Roles rol_consultado = null;
			IGestion_Roles gestion_roles = new Gestion_Roles();
			rol_consultado = gestion_roles.consultar_Rol(usuario.getNombreUsuario());
			if(rol_consultado != null) {
				// ROL DE USUARIO
				resultado_operacion.setCodigo_error(ICodigos_Error.USUARIO_CORRECTO);
				resultado_operacion.setMensaje("Se manda el rol del usuario pedido");
				resultado_operacion.setRol(rol_consultado);
			}else {
				// EL USUARIO NO TIENE ROL O NO EXISTE
				// USUARIO SIN ROL ASIGNADO EN LA BD
				resultado_operacion.setCodigo_error(ICodigos_Error.ERROR_USUARIOSINROL);
				resultado_operacion.setMensaje("El usuario no tiene ningun rol asignado");
			}
		}
		return resultado_operacion;
	}

	/**
	 * Se recibira una cadena de texto que sera un objeto usuario serializado en
	 * JSON.<br/>
	 * Se devolvera la coleccion de tareas del usuario concreto en formato JSON.
	 * 
	 * La respuesta es objeto respuesta_servicio que engloba toda la informacion
	 * posible. Dicho objeto se convertira a formato Json antes de ser
	 * devuelto.<br/>
	 * Se define un tipo de salida concreto para el cliente remoto a partir de las
	 * opciones internas del servicio rest. La conversion con el JsonLib en la fecha
	 * no es compatible.
	 * 
	 * @POST Tipo de peticion del protocolo http que recibira este metodo.
	 * @PATH URL concreta para este metodo.
	 * @PRODUCES Tipo MIME para la respuesta concreta de un cliente rest.
	 * @CONSUMES Tipo MIME para la informacion de la peticion del cliente rest.
	 * 
	 * @param usuario Objeto usuario en JSON:
	 * @return Objeto respuesta servicio en JSON.
	 */
	@POST
	@Path("/consultar_tareas")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta_Servicio consultar_Tareas(Usuario usuario) {
		// VALIDAMOS PREVIAMENTE A LA OPERACION DEL SERVICIO
		boolean valido = inicio_Operacion(usuario);
		// SI LOS PASOS ANTERIORES SON CORRECTOS SE REALIZA EL PROCESO DEL
		// SERVICIO
		if (valido) {

		}
		return resultado_operacion;
	}

	/**
	 * Proceso auxiliar para todas las operaciones del servicio. Llama a la
	 * operacion de conversion y validacion.
	 * 
	 * @param usuario String mandado por el cliente.
	 * @return Indicador se si continuar con la operacion o no.
	 */
	private boolean inicio_Operacion(Usuario usuario) {
		// PROPIEDADES PARA EL PROCESO
		// RESPUESTA DEL SERVICIO
		respuesta = null;
		resultado_operacion = new Respuesta_Servicio(false);
		// BANDERA DE VALIDACION
		boolean valido = true;
		// VALIDACION DE DATOS
		if (usuario != null) {
			Validar_Datos validador = new Validar_Datos();
			try {
				validador.validar_Datos(usuario);
			} catch (Validacion_Exception e) {
				// ERROR EN LA VALIDACION
				valido = false;
				resultado_operacion.setCodigo_error(e.getCodigo_error());
				resultado_operacion.setMensaje(e.getMensaje_error());
			}
		} else {
			// ERROR EN LA CONVERSION
			valido = false;
			resultado_operacion.setCodigo_error(ICodigos_Error.ERROR_FORMATOINCORRECTO);
			resultado_operacion.setMensaje("El formato en el que se envio lainformacion no es correcto");
		}
		return valido;
	}

}
