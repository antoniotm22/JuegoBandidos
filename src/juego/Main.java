package juego;

import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int VIDAS = 3;
		boolean estaVivoJugador = true;
		int contadorTiempo = 10000;

		System.out.println("Bienvenido a BANDIDOS!!");
		System.out.println();

		int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres jugar" + "\n" + "1- Sí \n 0- No"));

		switch (opcion) {
		case 0: {

			System.out.println("¡¡Hasta pronto!!");
		}
		case 1: {

			// Empiezo el juego
			do {
				int[] array = Tiempo.generaArray();

				int[] arrayJugador = new int[array.length];

				long tiempoIni = new Date().getTime();

				Tiempo.muestraArray(array);
				System.out.println();
				for (int i = 0; i < array.length; i++) {

					arrayJugador[i] = Integer
							.parseInt(JOptionPane.showInputDialog("Introduce la secuencias de Bandidos"));
				}

				long tiempoFin = new Date().getTime();

				// Comprueba el tiempo
				if ((tiempoFin - tiempoIni) > contadorTiempo) {
					System.out.println();
					System.out.println("Has tardado mucho, te han disparado!!");

				}

				// Comprueba la cadena
				if (Tiempo.comparaArray(array, arrayJugador) == false) {

					VIDAS = VIDAS - 1;
					System.out.println("Has fallado tus disparos!!");

				} else {
					System.out.println();
					System.out.println("Has ganado la ronda");
				}

				if (contadorTiempo > 899)
					contadorTiempo = contadorTiempo - 50;

				if (VIDAS == 0) {
					estaVivoJugador = false;
					System.out.println("TE HAN MATADO PACO");
				}

				JOptionPane.showMessageDialog(null, "Te quedan: " + VIDAS + " vidas.");
				JOptionPane.showMessageDialog(null,
						"Tienes " + contadorTiempo + " millis para contestar, date prisa!!");

			} while (estaVivoJugador == true);

		}

		}

	}

}
