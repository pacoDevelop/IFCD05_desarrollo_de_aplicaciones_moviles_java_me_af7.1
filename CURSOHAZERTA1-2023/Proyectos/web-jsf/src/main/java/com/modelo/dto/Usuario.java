package com.modelo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO para los datos a tratar con el datatable.
 * 
 * @author jsolv
 *
 */
public class Usuario implements Serializable {

	// PROPIEDADES PARA RECIBIR LOS DATOS
	private String nombreUsuario;
	private String password;
	private Date fechaAlta;
	private Date fechaBaja;
	private String carpetaDocumentacion;
	private String idioma;
	
	public Usuario() {}

	public Usuario(String nombreUsuario, String password, Date fechaAlta, Date fechaBaja, String carpetaDocumentacion,
			String idioma) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.carpetaDocumentacion = carpetaDocumentacion;
		this.idioma = idioma;
	}

	// ACCESORES
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getCarpetaDocumentacion() {
		return carpetaDocumentacion;
	}

	public void setCarpetaDocumentacion(String carpetaDocumentacion) {
		this.carpetaDocumentacion = carpetaDocumentacion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
