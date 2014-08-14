import static java. lang. System. out;
import java.util.Random;//para poder generar numero aleatorios
import java.util.Scanner;//Es para recuperar los numeros introducidos por teclado con system.in


public class LoopsProgramRandomNumbers {

	public static void main(String[] args) {
		// Para probar el uso de Loops voy a realizar un juego que 
		//genera números aleatorios y solicita al usuario averiguar el número mediante 
		//la entrada x consola/teclado, se repite mediante loop hasta que se acierte el numero
		
		//Creo un objeto de la clase Scanner e importo la clase
		Scanner miScanner =new Scanner (System. in) ;
		//Guardamos el numero de intentos en una variable
		int numIntentos = 0;
		//Creo la variable del alatorio y guardo un objeto de la clase random, el 10 +1 es para que cuente desde 1 los aleatorios
		int numAleatorio = new Random().nextInt ( 10) + 1;
		
		//ponemos solo out ya que hemos importado la clase system para no tener que estar poniendola 
		out. println("      *******************                *******************       ") ;
		out. println("              Bienvenid@ al juego **¡¡Acierta el número!! ");
		out. println("      *******************                *******************       ") ;
		out. println() ;
		out. print("Escribe un número del 1 al 10: ");
		//recuperamos el numero que ha introducido el ususario
		int numeroEscrito = miScanner.nextInt();
		//con cada iteracion o repeticion del loop incremento el uno el contador de intentos
		numIntentos++;
		//Se lleva a cabo el loop con while
		while (numeroEscrito != numAleatorio){//Compara numeroEscrito con Aleatorio si son diferentes repite el loop, en el 
			//momento q compare y sean iguales sale del loop y salta a la siguiente línea de código. 
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
