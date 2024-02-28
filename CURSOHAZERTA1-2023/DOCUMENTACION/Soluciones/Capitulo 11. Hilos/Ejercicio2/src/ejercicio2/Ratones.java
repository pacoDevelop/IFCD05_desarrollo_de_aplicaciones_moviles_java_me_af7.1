package ejercicio2;

public class Ratones extends Thread {

    static int plato = 100;
    String nombre;
    int comida;

    public Ratones(String nombre, int comida) {
        this.nombre = nombre;
        this.comida = comida;
        System.out.println(nombre + " Preparado para comer");
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((plato - comida) > 0) {
                comer();
            } else {
                llenar();
            }
        }
    }

    public synchronized void comer() {
        plato = plato - comida;
        System.out.println(nombre + " Ha comido y queda " + plato + " en el plato");
    }

    public synchronized void llenar() {
        plato = 100;
        System.out.println("El plato ha sido llenado");
    }

    public static void main(String[] args) {
        new Ratones("Raton1", 5).start();
        new Ratones("Raton2", 5).start();
    }
}
