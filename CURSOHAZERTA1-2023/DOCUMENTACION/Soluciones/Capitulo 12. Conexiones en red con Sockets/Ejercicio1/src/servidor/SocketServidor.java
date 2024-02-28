package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {

	DataInputStream dis;
	DataOutputStream dos;
	ServerSocket ss;
	String[] respuestas = { "De lunes a Sabado de 9:00 a 20:00", "Si", "4" };

	SocketServidor() {

		ss = null;

		try {
			// abrir un puerto para que se conecten las aplicaciones clientes
			ss = new ServerSocket(9876);
		} catch (IOException ex) {
			System.out.println("Error al abrir el puerto");
			ex.printStackTrace();
		}

	}

	public void escuchandoDatos() {

		String pregunta = "";

		while (true) {

			try {

				Socket c = ss.accept();

				dos = new DataOutputStream(c.getOutputStream());

				dis = new DataInputStream(c.getInputStream());
				pregunta = dis.readUTF();

				if (pregunta.equals("1")) {
					dos.writeUTF(respuestas[0]);
				}
				if (pregunta.equals("2")) {
					dos.writeUTF(respuestas[1]);
				}
				if (pregunta.equals("3")) {
					dos.writeUTF(respuestas[2]);
				}
				if (pregunta.equals("4")) {
					break;
				}

				// cerrar los streams
				dos.close();

				dis.close();
				// cerrar el socket
				c.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
