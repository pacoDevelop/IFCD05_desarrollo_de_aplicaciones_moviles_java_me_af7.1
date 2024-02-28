package com.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.modelo.dao.Provincias_DAO;
import com.modelo.dto.Provincia;


/**
 * Definicion de la interface de la fachada Gestion_Provincias.
 * 
 * @author Juan Antonio Solves Garcia.
 * @version 1.0.
 *
 */
public interface IGestion_Provincias {

	// PROCESO DE CONSULTA DE TODOS LOS PAISES DE LA BASE DE DATOS
	public abstract List<Provincia> consultar_Provincias();

	public abstract void modificacion_Provincia(Provincia provincia);

	public abstract void baja_Provincia(Provincia provincia);

	public abstract void alta_Provincia(Provincia provincia);

	Provincias_DAO getProvi_DAO();

}