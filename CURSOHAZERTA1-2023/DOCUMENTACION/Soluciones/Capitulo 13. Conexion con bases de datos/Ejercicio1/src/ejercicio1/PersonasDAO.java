package ejercicio1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {

    private Connection conexion;

    public void abrirConexion() {

        try {
            // Cargar el driver de mySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Establecer la conexion con la Base de Datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/censo", "root", "password");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexion");
            e.printStackTrace();
        }

    }

    public void cerrarConexion() {

        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion");
            e.printStackTrace();
        }
    }

    public String altaPersona(Persona p) throws SQLException {

        String mensaje = "No se pudo dar de alta a la persona";

        PreparedStatement stm;

        try {
            //conexion.setAutoCommit(false);

            abrirConexion();

            stm = conexion.prepareStatement("INSERT INTO censo.persona VALUES (?,?,?,?,?)");
            stm.setString(1, p.getDni());
            stm.setString(2, p.getNombre());
            stm.setDate(3, p.getFechaNacimiento());
            stm.setString(4, p.getDireccion());
            stm.setInt(5, p.getTelefono());

            int resultados = stm.executeUpdate();

            if (resultados == 1) {
                mensaje = "Alta OK";
                //conexion.commit();
            }

        } catch (SQLException e) {
            //conexion.rollback();
            e.printStackTrace();
        } finally {

            cerrarConexion();
        }

        return mensaje;
    }

    public String bajaPersona(Persona p) throws SQLException {

        String mensaje = "No se pudo dar de baja a la persona";

        PreparedStatement stm;

        try {

            abrirConexion();

            stm = conexion.prepareStatement("DELETE FROM censo.persona WHERE DNI=?");
            stm.setString(1, p.getDni());

            int resultados = stm.executeUpdate();

            if (resultados == 1) {
                mensaje = "Baja OK";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            cerrarConexion();
        }

        return mensaje;
    }

    public String modificarPersona(Persona p, int telefonoNuevo) throws SQLException {

        String mensaje = "No se pudo modificar la persona llamada " + p.getNombre();

        PreparedStatement stm;

        try {

            abrirConexion();

            stm = conexion.prepareStatement(" UPDATE censo.persona SET TFNO=? WHERE DNI=?");
            stm.setInt(1, telefonoNuevo);
            stm.setString(2, p.getDni());


            int resultados = stm.executeUpdate();

            if (resultados == 1) {
                mensaje = "Modificaci�n Tel�fono OK";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            cerrarConexion();
        }

        return mensaje;
    }

    public List<Persona> consultarTodasPersonas() {

        PreparedStatement stm;

        List<Persona> lista = new ArrayList<Persona>();


        try {

            abrirConexion();

            stm = conexion.prepareStatement(" SELECT * FROM censo.persona");

            ResultSet resultados = stm.executeQuery();

            while (resultados.next()) {
                lista.add(new Persona(resultados.getString("DNI"),
                        resultados.getString("NOMBRE"),
                        resultados.getDate("FECNAC"),
                        resultados.getString("DIR"),
                        resultados.getInt("TFNO")));

            }

        } catch (SQLException e) {
            System.out.println("Error al consultar todos");
            e.printStackTrace();


        } finally {

            cerrarConexion();
        }

        return lista;
    }
}
