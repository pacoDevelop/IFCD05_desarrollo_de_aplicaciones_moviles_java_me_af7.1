package ejercicio2;

public class TestAnimal {

    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.mamifero= true;
        perro.numPatas = 4;
        perro.nombre = "Fifi";
        perro.comer();
        perro.dormir();
        perro.mostrarInformacion();
        System.out.println("--------------------------------------------");

        Animal pez = new Animal();
        pez.mamifero= false;
        pez.numPatas = 0;
        pez.nombre = "Nemo";
        pez.comer();
        pez.dormir();
        pez.mostrarInformacion();
        System.out.println("--------------------------------------------");

        Animal cocodrilo = new Animal();
        cocodrilo.mamifero= false;
        cocodrilo.numPatas = 4;
        cocodrilo.nombre = "Dundee";
        cocodrilo.comer();
        cocodrilo.dormir();
        cocodrilo.mostrarInformacion();
        System.out.println("--------------------------------------------");
    }

}
