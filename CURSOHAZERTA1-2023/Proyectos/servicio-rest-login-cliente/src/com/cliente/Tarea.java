package com.cliente;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the TAREAS database table.
 * 
 */

public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;
	private long codigoTarea;
	private String descripcionTarea;
	private String vinculo;
	private List<Roles> roles;

	public Tarea() {
	}


	
	public long getCodigoTarea() {
		return this.codigoTarea;
	}

	public void setCodigoTarea(long codigoTarea) {
		this.codigoTarea = codigoTarea;
	}


	
	public String getDescripcionTarea() {
		return this.descripcionTarea;
	}

	public void setDescripcionTarea(String descripcionTarea) {
		this.descripcionTarea = descripcionTarea;
	}


	
	public String getVinculo() {
		return this.vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}



	public List<Roles> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

}