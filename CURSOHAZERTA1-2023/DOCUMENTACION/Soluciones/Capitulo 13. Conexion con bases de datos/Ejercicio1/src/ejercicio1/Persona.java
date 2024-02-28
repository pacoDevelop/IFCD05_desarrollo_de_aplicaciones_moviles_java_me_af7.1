package ejercicio1;

import java.io.Serializable;
import java.sql.Date;

public class Persona implements Serializable{

	private String dni;
	private String nombre;
	private Date fechaNacimiento; 
	private String direccion;
	private int telefono;
	
	Persona(String dni, String nombre, Date fechaNacimiento, String direccion, int telefono){
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre
				+ ", fechaNacimiento=" + fechaNacimiento + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	

}


