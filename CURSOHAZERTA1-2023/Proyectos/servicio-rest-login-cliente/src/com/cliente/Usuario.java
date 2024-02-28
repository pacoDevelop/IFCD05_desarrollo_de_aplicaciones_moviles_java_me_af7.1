package com.cliente;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombreUsuario;
	private String carpetaDocumentacion;
	private Date fechaAlta;
	private Date fechaBaja;
	private String idioma;
	private String password;
	private Roles roles;

	public Usuario() {
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCarpetaDocumentacion() {
		return this.carpetaDocumentacion;
	}

	public void setCarpetaDocumentacion(String carpetaDocumentacion) {
		this.carpetaDocumentacion = carpetaDocumentacion;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles role) {
		this.roles = role;
	}

}