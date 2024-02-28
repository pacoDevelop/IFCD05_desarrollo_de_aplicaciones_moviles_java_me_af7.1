package com.modelo;

import java.sql.SQLException;

import com.modelo.dao.Usuarios_DAO;
import com.modelo.dto.Usuario;

/**
 * Procesos contra la tabla de USUARIOS en la base de datos.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.5.
 *
 */
public class Gestion_Usuarios implements IGestion_Usuarios {
	// DEFINIMOS EL DAO PARA SU USO EN LA FACHADA
	private Usuarios_DAO usuario_dao;

	public Gestion_Usuarios() {
		usuario_dao = new Usuarios_DAO();
	}

	/**
	 * Operacion de llamada a la consulta de un usuario por su nombre.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	@Override
	public Usuario consultar_PorNombre(String nombre_usuario) {
		Usuario usuario_consultado = null;
		try {
			// CONSULTAMOS A LA BASE DE DATOS
			usuario_consultado = usuario_dao.consultar_PorNombre(nombre_usuario);
		} catch (SQLException e) {
			System.out.println("ERROR EN LA CONSULTA DE USUARIOS");
			e.printStackTrace();
		} finally {
			try {
				usuario_dao.liberar_Recursos();
			} catch (SQLException e) {
				System.out.println("ERROR EN EL CIERRE DE LA CONEXION");
				e.printStackTrace();
			}
		}
		// RETORNAMOS EL RESULTADO DE LA CONSULTA
		return usuario_consultado;
	}
}
