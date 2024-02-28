package com.modelo;

import java.util.Date;

/**
 * DAO de acceso a la tabla de Usuarios.
 * 
 * @author jsolv @ since 13-1-2023.
 */
public class Usuario_DAO {
	/**
	 * Proceso de consulta de la base de datos por la clave primaria de la tabla.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	public Usuarios consultar_PorNombre(String nombre_usuario) {
		Usuarios usuario_consultado = null;
		// SIMULACION DEL RESULTADO DE LA CONSULTA
		if (nombre_usuario.equals("Juan")) {
			usuario_consultado = new Usuarios();
			usuario_consultado.setNombreUsuario("Juan");
			usuario_consultado.setPassword("admin");
			usuario_consultado.setFechaAlta(new Date());
			usuario_consultado.setRol("1");
		}
		return usuario_consultado;
	}

}
