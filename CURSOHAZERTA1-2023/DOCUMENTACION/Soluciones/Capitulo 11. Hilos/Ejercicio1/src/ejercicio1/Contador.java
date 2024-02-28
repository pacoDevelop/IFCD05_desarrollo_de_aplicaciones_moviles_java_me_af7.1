package ejercicio1;

public class Contador extends Thread {

    private int incr;

    Contador(String nombre, int incremento) {
        super(nombre);
        incr = incremento;
    }

    public void run() {
        int num = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println(num);
            num += incr;
            try {
                sleep(10);
            } catch (Exception e) {
            }
        }

    }
}
