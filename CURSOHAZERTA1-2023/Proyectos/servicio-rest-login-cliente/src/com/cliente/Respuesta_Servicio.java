package com.cliente;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Conjunto de propiedades para crear la respuesta al cliente que se comunique
 * con el servicio.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 2.1.
 * 
 */
public class Respuesta_Servicio implements ICodigos_Error, Serializable {
	// PROPIEDADES DE CLASE
	private Boolean valor_booleano;
	private String mensaje;
	private Integer codigo_error;
	private Usuario usuario;
	private Roles rol;
	private List<Tarea> tareas;
	private Map<String, String> mapa_erroresbd;

	// CONSTRUCTORES
	public Respuesta_Servicio() {
		valor_booleano = new Boolean(false);
	}

	public Respuesta_Servicio(boolean valor) {
		valor_booleano = new Boolean(valor);
	}

	// ACCESORES PROPIEDADES
	public Boolean getValor_booleano() {
		return valor_booleano;
	}

	public void setValor_booleano(Boolean valor_booleano) {
		this.valor_booleano = valor_booleano;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getCodigo_error() {
		return codigo_error;
	}

	public void setCodigo_error(Integer codigo_error) {
		this.codigo_error = codigo_error;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public Map<String, String> getMapa_erroresbd() {
		return mapa_erroresbd;
	}

	public void setMapa_erroresbd(Map<String, String> mapa_erroresbd) {
		this.mapa_erroresbd = mapa_erroresbd;
	}

}
