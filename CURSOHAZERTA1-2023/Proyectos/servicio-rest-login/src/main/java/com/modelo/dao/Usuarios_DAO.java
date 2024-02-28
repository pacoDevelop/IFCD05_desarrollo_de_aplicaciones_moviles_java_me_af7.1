package com.modelo.dao;

import java.sql.SQLException;

import com.modelo.dto.Usuario;

/**
 * DAO de acceso a la tabla de Usuarios.
 * 
 * @author jsolv @ since 13-1-2023.
 */
public class Usuarios_DAO extends Abstract_DAO {

	public Usuario consultar_PorNombre(String nombre_usuario) throws SQLException {
		Usuario usuario_consultado = null;
		// CREAMOS EL STATEMENT NECESARIO PARA LANZAR LA ORDEN SQL SIN
		// VARIABLES
		pta = conexion.prepareStatement(rb.getString("usuarios.consulta.clave"));
		// SUSTITUIMOS LA VARIABLE DEL SQL POR SU VALOR
		pta.setString(1, nombre_usuario);
		// EJECUTAMOS LA CONSULTA SACANDO EL CODIGO SQL DEL PROPERTIES
		rs = pta.executeQuery();
		// PROCESAMOS LOS DATOS OBTENIDO EN LA CONSULTA
		if(rs.next()) {
			usuario_consultado = new Usuario();
			usuario_consultado.setNombreUsuario(rs.getString("nombre_usuario"));
			usuario_consultado.setCarpetaDocumentacion(rs.getString("carpeta_documentacion"));
			usuario_consultado.setPassword(rs.getString("password"));
			usuario_consultado.setIdioma(rs.getString("idioma"));
		}
		// RETORNAMOS EL DTO CON LA INFORMACION
		return usuario_consultado;
	}
}
