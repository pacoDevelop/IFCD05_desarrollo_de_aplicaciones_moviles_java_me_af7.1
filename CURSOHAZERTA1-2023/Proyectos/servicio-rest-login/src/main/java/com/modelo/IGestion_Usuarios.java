package com.modelo;

import com.modelo.dto.Usuario;

public interface IGestion_Usuarios {

	/**
	 * Operacion de llamada a la consulta de un usuario por su nombre.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	Usuario consultar_PorNombre(String nombre_usuario);

}