package com.modelo.dao;

import java.sql.SQLException;

import com.modelo.dto.Roles;

/**
 * DAO de acceso a la tabla de rOLES.
 * 
 * @author jsolv @ since 6-2-2023.
 */
public class Roles_DAO extends Abstract_DAO {

	/**
	 * Proceso de consulta del ROL de un usuario concreto
	 * 
	 * @param nombre_usuario Usuarioa buscar
	 * @return Rol en contrado
	 * @throws SQLException
	 */
	public Roles consultar_Rol(String nombre_usuario) throws SQLException {
		Roles rol_consultado = null;
		// CREAMOS EL STATEMENT NECESARIO PARA LANZAR LA ORDEN SQL SIN
		// VARIABLES
		pta = conexion.prepareStatement(rb.getString("roles.consulta.usuario"));
		// SUSTITUIMOS LA VARIABLE DEL SQL POR SU VALOR
		pta.setString(1, nombre_usuario);
		// EJECUTAMOS LA CONSULTA SACANDO EL CODIGO SQL DEL PROPERTIES
		rs = pta.executeQuery();
		// PROCESAMOS LOS DATOS OBTENIDO EN LA CONSULTA
		if(rs.next()) {
			rol_consultado = new Roles();
			rol_consultado.setCodigoRol(rs.getByte("codigo_rol"));
			rol_consultado.setDescripcionRol(rs.getString("descripcion_rol"));
		}
		// RETORNAMOS EL DTO CON LA INFORMACION
		return rol_consultado;
	}

}
