import static java. lang. System. out;
import java.util.Random;
import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		// Para probar el uso de Loops voy a realizar un juego que 
		//genera números aleatorios y solicita al usuario averiguar el número mediante 
		//la entrada x consola/teclado
		
		Scanner miScanner =new Scanner (System. in) ;
		int numIntentos = 0;
		int numAleatorio = new Random().nextInt ( 10) + 1;
		out. println("      *******  *******       ") ;
		out. println("     Bienvenid@ al juego ");
		out. println("      *******  *******       ") ;
		out. println() ;
		out. print("Escribe un número del 1 al 10: ");
		int numeroEscrito = miScanner.nextInt();
		numIntentos++;
		while (numeroEscrito != numAleatorio){
			out. println("      *******       *******       ") ;
			out. println("       Intentalo de nuevo ");
			out. println("      *******       *******       ") ;
			out . println ("Escribe un número del 1 al 10: ");
			numeroEscrito = miScanner.nextInt();
			numIntentos++;
		}
		out. println("      *****  Has ganado después de ");
		out. println("             "+numIntentos + " intentos.         **** ");
	}
}
