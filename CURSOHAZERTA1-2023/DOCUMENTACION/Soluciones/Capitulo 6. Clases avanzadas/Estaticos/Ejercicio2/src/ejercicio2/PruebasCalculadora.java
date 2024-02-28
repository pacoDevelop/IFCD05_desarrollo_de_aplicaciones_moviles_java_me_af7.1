package ejercicio2;

public class PruebasCalculadora {
	public static void main (String args[]){
		int a, b;
		a = 2;
		b = 8;

		System.out.println("La suma de " + a + " y " + b + " es " +
                                   Calculadora.suma(a, b) );
                System.out.println("La resta de " + a + " y " + b + " es " +
                                   Calculadora.resta(a, b) );
                System.out.println("La multiplicacion de " + a + " y " + b + " es " +
                                   Calculadora.multiplica(a, b) );
                System.out.println("La division de " + a + " y " + b + " es " +
                                   Calculadora.divide(a, b) );

	}	
}