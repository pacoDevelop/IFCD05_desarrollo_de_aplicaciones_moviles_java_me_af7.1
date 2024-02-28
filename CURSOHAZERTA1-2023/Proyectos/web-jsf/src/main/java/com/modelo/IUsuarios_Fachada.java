package com.modelo;

import java.util.List;

import com.modelo.dto.Usuario;

public interface IUsuarios_Fachada {

	Usuario consultar_PorNombre(String nombre_usuario);

	List<Usuario> consultar_Todos();



}