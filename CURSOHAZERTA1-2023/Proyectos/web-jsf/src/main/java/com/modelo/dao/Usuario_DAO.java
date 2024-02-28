package com.modelo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;

import com.modelo.dto.Usuario;

/**
 * DAO de acceso a la tabla de Usuarios.
 * 
 * @author jsolv @ since 13-1-2023.
 */
@Named("usuario-dao")
public class Usuario_DAO implements IUsuario_DAO {

	/**
	 * Proceso de consulta de la base de datos por la clave primaria de la tabla.
	 * 
	 * @param nombre_usuario
	 * @return
	 */
	@Override
	public Usuario consultar_PorNombre(String nombre_usuario) {
		Usuario usuario_consultado = null;
		// SIMULACION DEL RESULTADO DE LA CONSULTA
		if (nombre_usuario.equals("Juan")) {
			usuario_consultado = new Usuario();
			usuario_consultado.setNombreUsuario("Juan");
			usuario_consultado.setPassword("admin");
			usuario_consultado.setFechaAlta(new Date());
		}
		return usuario_consultado;
	}

	/**
	 * Proceso de consulta de todos los usuarios de la base de datos.
	 * 
	 * @return
	 */
	@Override
	public List<Usuario> consultar_Todos() {
		List<Usuario> lista_usuarios = new ArrayList<Usuario>();
		// SIMULACION DE CONTENIDO DE LA BASE DE DATOS
		Usuario usuario_nuevo = new Usuario("Juan", "admin", new Date(), null, "mi carpeta", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Manolo", "administrador", new Date(), null, "carpeta manolo", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Cliente", "usuario", new Date(), null, "carpeta cliente", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Juan", "admin", new Date(), null, "mi carpeta", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Manolo", "administrador", new Date(), null, "carpeta manolo", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Cliente", "usuario", new Date(), null, "carpeta cliente", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Juan", "admin", new Date(), null, "mi carpeta", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Manolo", "administrador", new Date(), null, "carpeta manolo", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Cliente", "usuario", new Date(), null, "carpeta cliente", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Juan", "admin", new Date(), null, "mi carpeta", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Manolo", "administrador", new Date(), null, "carpeta manolo", "es");
		lista_usuarios.add(usuario_nuevo);
		usuario_nuevo = new Usuario("Cliente", "usuario", new Date(), null, "carpeta cliente", "es");
		lista_usuarios.add(usuario_nuevo);
		return lista_usuarios;
	}

}
