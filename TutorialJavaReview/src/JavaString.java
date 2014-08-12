
public class JavaString {


		public static void main(String[] args) {
		    //Uso de String como objeto
			//Los Strings como objetos que s�n pueden utilizar metodos
			//Comparaci�n de Strings con equals()
			System.out.println("Creamos las variables con su valor");
			String respuesta="Amarillo";
			String resultado="Verde";
			System.out.println("Has respondido que el color es: "+resultado);
			System.out.println("Respuesta: "+respuesta.equals(resultado)+"\nPor que la respuesta correcta es: "+respuesta);
			
			//Para obtener la longitud de la cadena
			System.out.println("La longitud de la respuesta es de: "+respuesta.length()+" caracteres.");
			
			//Para cambiar de may�sculas a min�sculas y viceversa
			System.out.println("Respuesta se muestra as�: "+respuesta+".\n***Pero si lo convertimos con toLowerCase***\n Se muestra en min�sculas: "+respuesta.toLowerCase());
			System.out.println("Respuesta se muestra as�: "+respuesta+".\n***Pero si lo convertimos con toUperCase***\n Se muestra en may�sculas: "+respuesta.toUpperCase());
			
			//Para buscar una cadena de caracteres
			String texto="Es un lenguaje de programaci�n de prop�sito general, concurrente, orientado a objetos"
					+ " y basado en clases que fue dise�ado espec�ficamente para tener tan pocas dependencias de"
					+ " implementaci�n como fuera posible. Su intenci�n es permitir que "
					+ "los desarrolladores de aplicaciones escriban el programa una vez y lo "
					+ "ejecuten en cualquier dispositivo";
			int busca=texto.indexOf("general");
			System.out.println("Vamos a buscar la palabra general"+"\nEst� en la posici�n: "+busca);
		}

	}
