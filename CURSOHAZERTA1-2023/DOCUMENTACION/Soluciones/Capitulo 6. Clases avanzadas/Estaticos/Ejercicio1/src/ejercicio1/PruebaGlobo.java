package ejercicio1;

public class PruebaGlobo {
	public static void main (String args[]){
		Globo g1 = new Globo();
		System.out.println("El globo g1 referencia a " + g1.mostrarReferencia());
		Globo g2 = new Globo();
		System.out.println("El globo g2 referencia a " + g2.mostrarReferencia());
		Globo g3 = new Globo();
		System.out.println("El globo g3 referencia a " + g3.mostrarReferencia());
		System.out.println("El globo g1 referencia a " + g1.mostrarReferencia());
	}	
}