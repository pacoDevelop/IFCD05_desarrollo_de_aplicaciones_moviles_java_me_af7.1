package com.modelo;

import java.sql.SQLException;

import com.modelo.dao.Roles_DAO;
import com.modelo.dto.Roles;

/**
 * Procesos contra la tabla de ROLES en la base de datos.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.5.
 *
 */
public class Gestion_Roles implements IGestion_Roles {
	private Roles_DAO rol_dao;

	public Gestion_Roles() {
		rol_dao = new Roles_DAO();
	}

	/**
	 * Proceso de consulta a la base de datos a traves del DAO.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	@Override
	public Roles consultar_Rol(String nombre_usuario) {
		Roles rol_consultado = null;
		try {
			rol_consultado = rol_dao.consultar_Rol(nombre_usuario);
		} catch (SQLException e) {
			System.out.println("ERROR EN LA CONSULTA DEL ROL");
			e.printStackTrace();
		} finally {
			try {
				rol_dao.liberar_Recursos();
			} catch (SQLException e) {
				System.out.println("ERROR EN EL CIERRE DE LA CONEXION");
				e.printStackTrace();
			}
		}
		return rol_consultado;
	}

}
