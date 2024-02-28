package com.modelo;

import com.modelo.dto.Roles;

public interface IGestion_Roles {

	/**
	 * Proceso de consulta a la base de datos a traves del DAO.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	Roles consultar_Rol(String nombre_usuario);

}