package com.modelo.dao;

import java.util.List;

import com.modelo.dto.Usuario;

public interface IUsuario_DAO {

	/**
	 * Proceso de consulta de la base de datos por la clave primaria de la tabla.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	Usuario consultar_PorNombre(String nombre_usuario);

	/**
	 * Proceso de consulta de todos los usuarios de la base de datos.
	 * 
	 * @return
	 */
	List<Usuario> consultar_Todos();

	/**
	 * Proceso de consulta de la base de datos por la clave primaria de la tabla.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	Usuario consultar_PorNombre(String nombre_usuario);

	
}