package ejercicio3;

public class Persona {

    public void calcularEdad(int edad){

        // Calculamos la edad en dias
        int dias = edad * 365;
        System.out.println("La edad es dias son " + dias);

        // Calculamos la edad en segundos
        long segundos = dias * 24 * 60* 60L;
        System.out.println("La edad es segundos son " + segundos);

    }
}
