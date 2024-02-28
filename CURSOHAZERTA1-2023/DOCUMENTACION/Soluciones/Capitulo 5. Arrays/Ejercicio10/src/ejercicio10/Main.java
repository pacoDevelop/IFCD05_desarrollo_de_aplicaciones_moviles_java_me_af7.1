package ejercicio10;

public class Main {

    public static void main(String[] args) {
        int[][] numeros = {{3, 4, 5, 78},
                           {0, 0, 0, 0},
                           {1, 1, 1, 1},
                           {6, 6, 6, -1}};

        for (int[] fila : numeros) {
            System.out.print("{");
            for (int dato : fila) {
                System.out.print(dato + " ");
            }
            System.out.println("}");
        }

    }
}
