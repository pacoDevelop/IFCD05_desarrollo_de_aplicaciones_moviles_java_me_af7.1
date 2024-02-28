package com.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.modelo.dao.Provincias_DAO;
import com.modelo.dto.Provincia;



/**
 * Fachada de la tabla provincias.
 * 
 * @author Juan Antonio Solves Garcia
 * @version 2.0
 * 
 */
@Named("gestion_provincias")
public class Gestion_Provincias implements IGestion_Provincias {
	// PROPIEDADES DE CLASE
	@Inject
	@Named("provincias_dao")
	private Provincias_DAO provi_DAO;

	// ********** CONSTRUCTORES
	/**
	 * Conexion por defecto,
	 */
	public Gestion_Provincias() {
		provi_DAO = new Provincias_DAO();
	}

	/**
	 * Conexion segun parametro pasado.
	 * 
	 * @param tipo_conexion
	 */
	public Gestion_Provincias(int tipo_conexion) {
		provi_DAO = new Provincias_DAO(tipo_conexion);
	}

	/**
	 * Consulta general de todas las provincias.
	 */
	@Override
	public List<Provincia> consultar_Provincias() {
		List<Provincia> lista = new ArrayList<>(0);
		try {
			lista = provi_DAO.consultar_Provincias();
		} catch (Exception e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
			System.out.println("ERROR EN LA CONSULTA DE PROVINCIAS");
		}
		try {
			provi_DAO.liberar_Recursos();
			System.out.println("CIERRE DE CONEXION");
		} catch (Exception e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
		return lista;
	}

	/**
	 * Proceso de alta de provincias.
	 */
	@Override
	public void alta_Provincia(Provincia provincia) {
		try {
			provi_DAO.alta_Provincia(provincia);
		} catch (SQLException e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
		try {
			provi_DAO.liberar_Recursos();
		} catch (Exception e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
	}

	/**
	 * Proceso de baja de provincias.
	 */
	@Override
	public void baja_Provincia(Provincia provincia) {
		try {
			provi_DAO.baja_Provincia(provincia);
		} catch (SQLException e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
		try {
			provi_DAO.liberar_Recursos();
		} catch (Exception e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
	}

	/**
	 * Proceso de modificacion de provincias.
	 */
	@Override
	public void modificacion_Provincia(Provincia provincia) {
		try {
			provi_DAO.modificacion_Provincia(provincia);
		} catch (SQLException e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
		try {
			provi_DAO.liberar_Recursos();
		} catch (Exception e) {
			// TRATAMIENTO DE ERROR, SIN IMPLEMENTAR
		}
	}

	@Override
	public Provincias_DAO getProvi_DAO() {
		return provi_DAO;
	}
	
}
