import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;


public class Loopdo {

	public static void main(String[] args) {
		// Hacemos referencia a 1 archivo, mediante el uso de la clase preconstruida File, si existe va a eliminarse si contestamos que si
		File archivo = new File("c:\\miArchivo.txt"); 
		Scanner miScanner = new Scanner (System.in);
		char replica;
		//inicio del loop do while
		do {
			//escribimos la pregunta al user
			out.println("¿Borrar archivo? (s/n) :" );
			//recuperamos la respuesta
			replica = miScanner.findWithinHorizon(".", 0).charAt( 0);
			}
			//Mientras la respuesta sea diferente de s o n sigue el bucle, cuando sea igual continua al if
			//mediante el uso del operado && podemos poner mas de una condicion
			while (replica != 's' && replica != 'n' );
			
			if (replica == 's'){
				out.println("De acuerdo, borrando archivo...");
				archivo.delete();}
			else {
				out.println("De acuerdo, confirmado no borrar. ");
			}		
		}	
	}
