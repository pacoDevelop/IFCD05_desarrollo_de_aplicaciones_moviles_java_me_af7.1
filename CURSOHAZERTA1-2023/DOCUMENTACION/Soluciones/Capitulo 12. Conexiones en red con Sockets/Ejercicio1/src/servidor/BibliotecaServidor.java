package servidor;

public class BibliotecaServidor {

	SocketServidor servidor;
	
	BibliotecaServidor(){
		
		servidor = new SocketServidor();
	}
	
	void dameDatos()
	{
		
		servidor.escuchandoDatos();
		
	}
	
	public static void main(String[] args)
	{
		
		BibliotecaServidor bc =new BibliotecaServidor();
		
		bc.dameDatos();
		
		
		
	}
	
}
