package com.modelo;
/**
 * Fachada de acceso a los procesos de la tabla Usuarios.
 * @author jsolv
 *
 */
public class Usuarios_Fachada implements IUsuarios_Fachada {
	private Usuario_DAO usuario_dao;

	public Usuarios_Fachada() {
		usuario_dao = new Usuario_DAO();
	}

	@Override
	public Usuarios consultar_PorNombre(String nombre_usuario) {
		Usuarios usuario_consultado = null;
		usuario_consultado = usuario_dao.consultar_PorNombre(nombre_usuario);
		return usuario_consultado;
	}
}
