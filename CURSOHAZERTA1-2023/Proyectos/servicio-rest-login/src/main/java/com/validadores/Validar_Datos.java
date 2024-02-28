package com.validadores;

import com.excepciones.Validacion_Exception;
import com.modelo.dto.Usuario;
import com.respuesta.ICodigos_Error;

/**
 * Reglas de validacion a aplicar a las operaciones del servicio.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 2.0.
 * 
 */
public class Validar_Datos {
	/**
	 * Reglas de validacion para las operaciones del servicio.</br>
	 * 1º El nombre del usuario es obligatorio, no puede venir en blanco o nulo.
	 * </br>
	 * 2º La clave del usuario es obligatorio, no puede venir en blanco o nulo.</br>
	 * 3º El tamaño maximo del campo usuario es 20 y el de clave 10.
	 * 
	 * @param usuario_aconsultar Objeto usuario a validar.
	 * @throws Validacion_Exception
	 */
	public void validar_Datos(Usuario usuario_aconsultar) throws Validacion_Exception {
		// REGLAS DE VALIDACION PARA EL NOMBRE DE USUARIO
		if (usuario_aconsultar.getNombreUsuario() == null) {
			throw new Validacion_Exception("El nombre del usuario no puede estar nulo",
					ICodigos_Error.ERROR_VALIDACIONNOMBRENULO);
		} else if (usuario_aconsultar.getNombreUsuario().equals("")) {
			throw new Validacion_Exception("El nombre del usuario no puede ser una cadena vacia",
					ICodigos_Error.ERROR_VALIDACIONNOMBREVACIO);
		} else if (usuario_aconsultar.getNombreUsuario().length() > 20) {
			throw new Validacion_Exception("El nombre del usuario tiene mas caracteres de los permitidos,maximo 20.",
					ICodigos_Error.ERROR_VALIDACIONTAMNOMBRE);
		}
		// REGLAS DE VALIDACION PARA LA CLAVE DEL USUARIO
		if (usuario_aconsultar.getPassword() == null) {
			throw new Validacion_Exception("La clave no puede estar nula", ICodigos_Error.ERROR_VALIDACIONCLAVENULO);
		} else if (usuario_aconsultar.getPassword().equals("")) {
			throw new Validacion_Exception("La clave no puede ser una cadena vacia",
					ICodigos_Error.ERROR_VALIDACIONCLAVEVACIA);
		} else if (usuario_aconsultar.getPassword().length() > 10) {
			throw new Validacion_Exception("La clave tiene mas caracteres de los permitidos,maximo 10.",
					ICodigos_Error.ERROR_VALIDACIONTAMCLAVE);
		}
	}

}
