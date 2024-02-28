package com.cliente;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the "ROLES" database table.
 * 
 */
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;
	private long codigoRol;
	private String descripcionRol;
	private List<Tarea> tareas;
	private List<Usuario> usuarios;

	public Roles() {
	}

	public long getCodigoRol() {
		return this.codigoRol;
	}

	public void setCodigoRol(long codigoRol) {
		this.codigoRol = codigoRol;
	}


	
	public String getDescripcionRol() {
		return this.descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public List<Tarea> getTareas() {
		return this.tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setRoles(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setRoles(null);

		return usuario;
	}

}