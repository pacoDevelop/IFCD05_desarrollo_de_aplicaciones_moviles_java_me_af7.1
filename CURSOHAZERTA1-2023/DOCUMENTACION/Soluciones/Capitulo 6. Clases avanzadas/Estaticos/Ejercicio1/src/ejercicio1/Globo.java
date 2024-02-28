package ejercicio1;

public class Globo {
	private int referencia;
	private static int contadorGlobos = 0;

	public Globo(){
		contadorGlobos ++;
		referencia = contadorGlobos;
	}

	public int mostrarReferencia(){
		return referencia;
	}	
}