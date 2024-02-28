package ejercicio2;

public class TestPersona {

    public static void main(String[] args) {

        Persona objPersona1 = new Persona("Juan", 27, EstadoCivil.CASADO);
        Persona objPersona2 = new Persona("Pedro", 56, EstadoCivil.DIVORCIADO);
        Persona objPersona3 = new Persona("Maria", 19, EstadoCivil.SOLTERO);

        System.out.println(objPersona1);
        System.out.println(objPersona2);
        System.out.println(objPersona3);

    }

}
