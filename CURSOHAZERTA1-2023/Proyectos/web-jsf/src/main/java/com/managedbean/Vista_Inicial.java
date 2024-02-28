package com.managedbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;


/**
 * Ejemplo basico de definicion de managedbean.
 * 
 * @author jsolv
 *
 */
@ManagedBean(name = "prueba_bean")
@ViewScoped
public class Vista_Inicial {
	// PROPIEDADES DE CLASE PARA RECIBIR LOS VALORES DE LA VISTA
	private String texto1;
	private String texto2;
	
	public Vista_Inicial() {
		System.out.println("SOY EL CONSTRUCTOR DEL MANAGEDBEAN");
	}
	
	@PostConstruct
	public void metodo_Finalizacion() {
		System.out.println("SOY EL METODO DE POSTCONTRUCCION");
	}
	
	/**
	 * Ejemplo de definicion de metodo de evento
	 * 
	 * @param evento
	 */
	public void prueba_Evento(ActionEvent evento) {
		System.out.println("SOY EL METODO DE EVENTO");
	}
	/**
	 * Ejemplo de definicion de metodo de accion.
	 * 
	 * @return
	 */
	public String prueba_Accion() {
		System.out.println("SOY EL METODO DE ACCION");
		return null;
	}

	// ACCESORES DE LAS PROPIEDADES PARA LAS EXPRESIONES DINAMICAS
	public String getTexto1() {
		return texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public String getTexto2() {
		return texto2;
	}

	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}

}
