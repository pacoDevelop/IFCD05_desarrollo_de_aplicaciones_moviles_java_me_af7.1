package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {

	DataInputStream dis;
	DataOutputStream dos;
	Socket s;
	String[] preguntas = { "¿Cuál es el horario de apertura?",
			"¿Está disponible el libro de Java?",
			"¿Cuántas copias tienen disponibles?", "salir" };

	SocketCliente() {

	}

	public void pasoDatos() {
		Scanner scanner = new Scanner(System.in);
		String numeroPregunta = "";

		while (!numeroPregunta.equals("4")) {

			try {

				// Establecer un socket al servidor
				s = new Socket("localhost", 9876);

				// Escribe la pregunta dirigida al servidor
				System.out
						.println("Selecciona una de las siguientes preguntas escribiento el número"
								+ " en la consola: \n"
								+ "(1) ¿Cuál es el horario de apertura? \n"
								+ "(2) ¿Está disponible el libro de Java? \n"
								+ "(3) ¿Cuántas copias tienen disponibles? \n"
								+ "(4) Salir");

				numeroPregunta = scanner.next();
				
				// Envia pregunta al servidor
				enviar(numeroPregunta);
				
				// Lee la respuesta del servidor y la escribe por pantalla
				System.out.println(recibir());


				// Cerrar los streams
				dis.close();

				dos.close();

				// cerrar el socket
				s.close();
	
			} catch (IOException ex) {
				System.out.println("Hemos salido del programa");
			}
		}
	}

	private String recibir() throws IOException {
		// Lee la respuesta del servidor
		dis = new DataInputStream(s.getInputStream());
		return dis.readUTF();
	}

	private void enviar(String numeroPregunta) throws IOException {
		// Envia pregunta al servidor
		dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF(numeroPregunta);
	}
}
