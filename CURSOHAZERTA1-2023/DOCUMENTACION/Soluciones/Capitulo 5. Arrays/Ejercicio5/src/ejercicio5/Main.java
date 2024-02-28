package ejercicio5;

public class Main {

    public static void main(String[] args) {

        char[] cars1 = new char[]{'1', '2', '3', '4', '5', '6'};
        char[] cars2 = new char[]{'a', 'e', 'r', 't', 'y', 'u'};

        char[] result = new char[cars1.length + cars2.length];

        int posicionArray1 = 0;
        int posicionArray2 = 0;
        int posicionArray3 = 0;

        while (posicionArray3 < result.length) {
            if (posicionArray1 < cars1.length) {
                result[posicionArray3] = cars1[posicionArray1];
                posicionArray1++;
                posicionArray3++;
            }

            if (posicionArray2 < cars2.length) {
                result[posicionArray3] = cars2[posicionArray2];
                posicionArray2++;
                posicionArray3++;
            }
        }


        for (char dato : result) {
            System.out.print(dato + " ");
        }
        System.out.println("");

    }
}
