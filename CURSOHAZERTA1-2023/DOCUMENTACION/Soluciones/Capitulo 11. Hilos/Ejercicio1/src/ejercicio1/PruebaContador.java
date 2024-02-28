package ejercicio1;

public class PruebaContador {

    public static void main(String arg[]) {
        Contador c1 = new Contador("contador1", 1);
        Contador c2 = new Contador("contador2", 7);

        c1.setPriority(4);
        c2.setPriority(5);
        System.out.println("Iniciando el hilo " + c1.getName() + "...");
        c1.start();
        System.out.println("Iniciando el hilo " + c2.getName() + "...");
        c2.start();

    }
}
