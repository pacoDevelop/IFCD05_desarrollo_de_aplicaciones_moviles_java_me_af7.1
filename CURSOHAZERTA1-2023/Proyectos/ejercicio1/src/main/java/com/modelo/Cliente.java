package com.modelo;
/**
 * Definicion del objeto de dominio y futuro DTO de clientes.
 * @author jsolv
 *
 */
public class Cliente {
	//PROPIEDADES DE CLASE
	private String cod_cliente;
	private String nombre_cliente;
	private String telefono;
	private String cif;
	private String calle;
	private String ciudad;
	private String provincia;
	private String email;
	private Integer cod_postal;

	// ACCESORES DE LAS PROPIEDADES DE CLASE
	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(Integer cod_postal) {
		this.cod_postal = cod_postal;
	}

}
