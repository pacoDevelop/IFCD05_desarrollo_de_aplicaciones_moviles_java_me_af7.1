package com.modelo;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.modelo.dao.IUsuario_DAO;
import com.modelo.dto.Usuario;

/**
 * Fachada de acceso a los procesos de la tabla Usuarios.
 * 
 * @author jsolv
 *
 */
@Named("fachada_usuarios") // EL COMPONENTE ES ACCESIBLE POR EXPRESION DINAMICA
public class Usuarios_Fachada implements IUsuarios_Fachada {
	@Inject
	@Named("usuario-dao")
	private IUsuario_DAO usuario_dao;

	@Override
	public Usuario consultar_PorNombre(String nombre_usuario) {
		Usuario usuario_consultado = null;
		usuario_consultado = usuario_dao.consultar_PorNombre(nombre_usuario);
		return usuario_consultado;
	}

	@Override
	public List<Usuario> consultar_Todos() {
		List<Usuario> lista_usuarios = usuario_dao.consultar_Todos();
		return lista_usuarios;
	}

}
