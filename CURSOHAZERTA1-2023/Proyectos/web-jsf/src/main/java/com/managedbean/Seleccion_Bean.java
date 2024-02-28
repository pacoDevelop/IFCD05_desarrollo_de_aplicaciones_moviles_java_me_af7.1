package com.managedbean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import com.modelo.Gestion_Provincias;
import com.modelo.IGestion_Pais;
import com.modelo.IGestion_Provincias;
import com.modelo.dto.Pais;
import com.modelo.dto.Provincia;

@ManagedBean(name = "seleccion_bean")
@ViewScoped
public class Seleccion_Bean implements Serializable {
	// PROPIEDADES CON LA SELECCION DEL USUARIO
	private String pais_seleccionado;
	private String provincia_seleccionada;
	private String municipio_seleccionado;

	// CONTENIDO DE TEXTO DEL COMBO DE PROVINCIAS
	private String texto_provincia;
	private String texto_municipios;

	// PROPIEDADES DE CONTENIDO DE COMBOS
	private List<SelectItem> lista_paises;
	private List<SelectItem> lista_provincias;
	private List<SelectItem> lista_municipios;

	// ACCESO A LA CAPA MODELO - INYECCION DE DEPENDENCIAS
	@ManagedProperty("#{gestion_pais}")
	private IGestion_Pais gestion_pais;
	@ManagedProperty("#{gestion_provincias}")
	private IGestion_Provincias gestion_provincias;

	/**
	 * Valores iniciales para la vista.
	 */
	public Seleccion_Bean() {
		System.out.println("SOY EL CONSTRUCTOR DE SELECCION BEAN");
		// INICIAMOS LA LISTA DE LOS PAISES
		pais_seleccionado = "ningun pais";
		lista_paises = new ArrayList<>();
		// VALORES INICIALES DE PROVINCIAS
		texto_provincia = "Seleccione un pais";
		lista_provincias = new ArrayList<>(0);
		// VALORES INICIALES DE MUNICIPIOS
		texto_municipios = "Seleccione un pais";
		lista_municipios = new ArrayList<>(0);
	}

	/**
	 * Proceso de carga automatica de la lista de paises.
	 */
	@PostConstruct
	public void crear_ListaPaises() {
		// CONSULTA A LA BASE DE DATOS
		List<Pais> lista_consultada = gestion_pais.consultar_Todos();
		SelectItem opcion_nueva;
		// CARGA DE DATOS EN EL MODELO DEL COMBO
		for (Pais pais : lista_consultada) {
			opcion_nueva = new SelectItem();
			opcion_nueva.setValue(String.valueOf(pais.getCodigo_pais()));
			opcion_nueva.setLabel(pais.getPais_nombre());
			lista_paises.add(opcion_nueva);
		}
	}

	/**
	 * Proceso de carga dinamica del combo de provincias.
	 * 
	 * @param evento Evento producido por el combo de paises.
	 */
	public void carga_Provincias(ValueChangeEvent evento) {
		// SE RECIBE EL VALOR SELECCIONADO POR EL EVENTO
		String pais_seleccionado = (String) evento.getNewValue();
		// SE CONSULTA A LA BD. SI ES ESPAÑA
		if (pais_seleccionado.equals("73")) {
			try {
				// OBTENCION DE CONEXION PARA SEGUNDAS CARGAS DE PROVINCIAS
				if (gestion_provincias.getProvi_DAO().conexion.isClosed()) {
					gestion_provincias = new Gestion_Provincias();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			List<Provincia> lista_provinciasconsultadas = gestion_provincias.consultar_Provincias();
			// CREAMOS DINAMICAMENTE EL CONTENIDO DE LA LISTA
			SelectItem opcion = null;
			for (Provincia provincia : lista_provinciasconsultadas) {
				opcion = new SelectItem();
				opcion.setLabel(provincia.getProvincia());
				opcion.setValue(provincia.getCodigo_provincia());
				lista_provincias.add(opcion);
			}
			texto_provincia = "Seleccione una provincia";
		} else {
			// CUALQUIER OTRO PAIS
			// REINICAMOS LAS LISTAS DE PROVINCIAS Y MUNICIPIOS A VALORES
			// INICIALES
			texto_provincia = "Seleccione un pais";
			texto_municipios = "Seleccione un pais";
			// VACIAMOS LAS PROVINCIAS Y LOS MUNICIPIOS
			lista_provincias.clear();
			lista_municipios.clear();
		}
	}

	// ACCESORES PARA JSF
	public String getPais_seleccionado() {
		return pais_seleccionado;
	}

	public void setPais_seleccionado(String pais_seleccionado) {
		this.pais_seleccionado = pais_seleccionado;
	}

	public List<SelectItem> getLista_paises() {
		return lista_paises;
	}

	public void setLista_paises(List<SelectItem> lista_paises) {
		this.lista_paises = lista_paises;
	}

	public IGestion_Pais getGestion_pais() {
		return gestion_pais;
	}

	public void setGestion_pais(IGestion_Pais gestion_pais) {
		this.gestion_pais = gestion_pais;
	}

	public String getTexto_provincia() {
		return texto_provincia;
	}

	public void setTexto_provincia(String texto_provincia) {
		this.texto_provincia = texto_provincia;
	}

	public String getTexto_municipios() {
		return texto_municipios;
	}

	public void setTexto_municipios(String texto_municipios) {
		this.texto_municipios = texto_municipios;
	}

	public String getProvincia_seleccionada() {
		return provincia_seleccionada;
	}

	public void setProvincia_seleccionada(String provincia_seleccionada) {
		this.provincia_seleccionada = provincia_seleccionada;
	}

	public String getMunicipio_seleccionado() {
		return municipio_seleccionado;
	}

	public void setMunicipio_seleccionado(String municipio_seleccionado) {
		this.municipio_seleccionado = municipio_seleccionado;
	}

	public List<SelectItem> getLista_provincias() {
		return lista_provincias;
	}

	public void setLista_provincias(List<SelectItem> lista_provincias) {
		this.lista_provincias = lista_provincias;
	}

	public List<SelectItem> getLista_municipios() {
		return lista_municipios;
	}

	public void setLista_municipios(List<SelectItem> lista_municipios) {
		this.lista_municipios = lista_municipios;
	}

	public IGestion_Provincias getGestion_provincias() {
		return gestion_provincias;
	}

	public void setGestion_provincias(IGestion_Provincias gestion_provincias) {
		this.gestion_provincias = gestion_provincias;
	}

}
