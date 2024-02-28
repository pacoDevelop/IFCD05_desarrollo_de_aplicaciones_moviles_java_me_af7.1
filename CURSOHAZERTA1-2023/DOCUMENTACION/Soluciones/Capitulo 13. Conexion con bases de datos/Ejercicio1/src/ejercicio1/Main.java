package ejercicio1;

import java.sql.Date;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        PersonasDAO pdao = new PersonasDAO();

        Persona p = new Persona("78565665P", "Pedro P�rez", new Date(1975 - 01 - 01), "Calle Lleida 5, 7, 3", 936852666);
        Persona p1 = new Persona("Y85212121", "Mario Ruiz", new Date(1955 - 12 - 07), "Calle Milla 4, p, 1", 936121212);
        Persona p2 = new Persona("0898900", "Maria Matera", new Date(1980 - 10 - 31), "Calle Verde 9, 3, 1", 936712893);

        try {


            System.out.println(pdao.altaPersona(p));
            System.out.println(pdao.altaPersona(p1));
            System.out.println(pdao.altaPersona(p2));

            System.out.println("Censo inicial*******************************************");

            for (Persona per : pdao.consultarTodasPersonas()) {
                System.out.println(per);
            }

            System.out.println(pdao.bajaPersona(p));
            System.out.println(pdao.modificarPersona(p2, 111111111));
        } catch (SQLException e) {
            e.printStackTrace();
        }



        System.out.println("Censo final *******************************************");


        for (Persona per : pdao.consultarTodasPersonas()) {
            System.out.println(per);
        }

    }
}
