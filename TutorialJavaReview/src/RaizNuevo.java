import java.io.*;
//Programa que va a sacar la raiz cuadrada del numero que introduzca el usuario por teclado

public class RaizNuevo {
		// Utilizo throws para capturar las excepciones
	public static void main(String[] args) throws IOException{
		//Creamos el objeto de la clase y llamamos al metodo que nos permite recuperar la info que escvriba el usuario
		
		BufferedReader buff = new BufferedReader(new InputStreamReader);
		System.out.println("Escribe un número: ");
		String str = buff.readLine();
		//Convertimos lo el string que nos pasa el usuario en  Integer
		int conversion = Integer.parseInt(str);
		//REalizamos la operacion
		System.out.println("La raiz cuadrada de " 
		+conversion+" es: "
		+Math.sqrt(conversion));
		
	}

}
