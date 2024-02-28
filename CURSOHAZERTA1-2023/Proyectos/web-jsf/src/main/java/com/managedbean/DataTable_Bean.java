package com.managedbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.modelo.IUsuarios_Fachada;
import com.modelo.Usuarios_Fachada;
import com.modelo.dto.Usuario;

@ManagedBean(name = "usuarios_bean")
@ViewScoped
public class DataTable_Bean {
	// COLECCION DONDE SE ALMACENARAN LOS DATOS A MOSTRAR
	private List<Usuario> lista_usuarios;
	// PROPIEDADES PARA EL CONTROL DE NAVEGACION
	private int primera_filapagina;
	private int total_filas;
	private int numero_filastabla;
	// ACCESO A LA CAPA MODELO PARA LA CONSULTA DE INFORMACION
	@ManagedProperty("#{fachada_usuarios}") //INYECCION CON JSF - OBLIGATORIO USO EL
	private IUsuarios_Fachada usuario_fachada;

	@PostConstruct
	public void cargar_Datos() {
		// CREAMOS LOS DATOS PARA EL DATATABLE
		lista_usuarios = new ArrayList<Usuario>();
		lista_usuarios = usuario_fachada.consultar_Todos();
		// CARGA DE DATOS EN LA PROPIEDAD DEL MANAGEDBEAN
		primera_filapagina = 0;// PRIMERA FILA QUE SE MUESTRA EN EL DATATABLE
		numero_filastabla = 5;// TAMAÑO DE LA PAGINA
		total_filas = lista_usuarios.size();// NUMERO MAXIMO DE FILAS
	}

	/**
	 * Evento para la paginacion del contenido. Se muestra la primera pagina de la
	 * tabla.
	 * 
	 * @param evento
	 */
	public void paginainicio_Tabla(ActionEvent evento) {
		primera_filapagina = 0;
	}

	/**
	 * Evento para la paginacion del contenido. Se muestra la siguiente pagina.
	 * 
	 * @param evento
	 */
	public void siguientepagina_Tabla(ActionEvent evento) {
		if (!(primera_filapagina + numero_filastabla > total_filas)) {
			primera_filapagina += numero_filastabla;
		}
	}

	/**
	 * Evento para la paginacion del contenido.Se muestra la pagina anterior.
	 * 
	 * @param evento
	 */
	public void paginaanterior_Tabla(ActionEvent evento) {
		if (!(primera_filapagina - numero_filastabla < 0)) {
			primera_filapagina -= numero_filastabla;
		}
	}

	// ACCESORES PARA JSF
	public List<Usuario> getLista_usuarios() {
		return lista_usuarios;
	}

	public void setLista_usuarios(List<Usuario> lista_usuarios) {
		this.lista_usuarios = lista_usuarios;
	}

	public int getPrimera_filapagina() {
		return primera_filapagina;
	}

	public void setPrimera_filapagina(int primera_filapagina) {
		this.primera_filapagina = primera_filapagina;
	}

	public int getTotal_filas() {
		return total_filas;
	}

	public void setTotal_filas(int total_filas) {
		this.total_filas = total_filas;
	}

	public int getNumero_filastabla() {
		return numero_filastabla;
	}

	public void setNumero_filastabla(int numero_filastabla) {
		this.numero_filastabla = numero_filastabla;
	}

	public IUsuarios_Fachada getUsuario_fachada() {
		return usuario_fachada;
	}

	public void setUsuario_fachada(IUsuarios_Fachada usuario_fachada) {
		this.usuario_fachada = usuario_fachada;
	}

}
