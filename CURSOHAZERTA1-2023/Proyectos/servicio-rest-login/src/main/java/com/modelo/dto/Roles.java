package com.modelo.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {
	// Fields
	private Byte codigoRol;
	private String descripcionRol;
	private Set<Tarea> tareas = new HashSet(0); // REPRESENTACION RELACION ROLES/TAREAS

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** minimal constructor */
	public Roles(Byte codigoRol) {
		this.codigoRol = codigoRol;
	}

	/** full constructor */
	public Roles(Byte codigoRol, String descripcionRol, Set tareases) {
		this.codigoRol = codigoRol;
		this.descripcionRol = descripcionRol;
		this.tareas = tareases;

	}

	// Property accessors

	public Byte getCodigoRol() {
		return this.codigoRol;
	}

	public void setCodigoRol(Byte codigoRol) {
		this.codigoRol = codigoRol;
	}

	public String getDescripcionRol() {
		return this.descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public Set<Tarea> getTareas() {
		return this.tareas;
	}

	public void setTareas(Set tareases) {
		this.tareas = tareases;
	}

}