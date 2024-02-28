package ejercicio1;

public class Main {

    public static void main(String[] args) {

        String cadena = "Bienvenido al curso de Java";

        // Mostrar la cadena toda en mayúsculas
        System.out.println(cadena.toUpperCase());

        // Mostrar la cadena en minúsculas
        System.out.println(cadena.toLowerCase());

        // Mostrar solo la palabra Bienvenidos
        System.out.println(cadena.substring(0, cadena.indexOf(" ")));

        // Mostrar solo la palabra Java
        System.out.println(cadena.substring(cadena.lastIndexOf(" ") + 1));

        // Mostrar la palabra curso
        System.out.println(cadena.substring(14, 19));
        
        // Mostrar la posición de la letra c
        System.out.println(cadena.indexOf("c"));

        // Devolver la longitud de la cadena
        System.out.println(cadena.length());
        
        // Modificar las e minúsculas por E mayúsculas
        System.out.println(cadena.replace('e', 'E'));

        // Concatenar la frase anterior con " con fecha 14 de Septiembre"
        System.out.println(cadena.concat(" con fecha 14 de Septiembre"));
    }
}
