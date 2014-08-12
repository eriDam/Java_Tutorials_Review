
public class JavaString {


		public static void main(String[] args) {
		    //Uso de String como objeto
			//Los Strings como objetos que són pueden utilizar metodos
			//Comparación de Strings con equals()
			System.out.println("Creamos las variables con su valor");
			String respuesta="Amarillo";
			String resultado="Verde";
			System.out.println("Has respondido que el color es: "+resultado);
			System.out.println("Respuesta: "+respuesta.equals(resultado)+"\nPor que la respuesta correcta es: "+respuesta);
			
			//Para obtener la longitud de la cadena
			System.out.println("La longitud de la respuesta es de: "+respuesta.length()+" caracteres.");
			
			//Para cambiar de mayúsculas a minúsculas y viceversa
			System.out.println("Respuesta se muestra así: "+respuesta+".\n***Pero si lo convertimos con toLowerCase***\n Se muestra en minúsculas: "+respuesta.toLowerCase());
			System.out.println("Respuesta se muestra así: "+respuesta+".\n***Pero si lo convertimos con toUperCase***\n Se muestra en mayúsculas: "+respuesta.toUpperCase());
			
			//Para buscar una cadena de caracteres
			String texto="Es un lenguaje de programación de propósito general, concurrente, orientado a objetos"
					+ " y basado en clases que fue diseñado específicamente para tener tan pocas dependencias de"
					+ " implementación como fuera posible. Su intención es permitir que "
					+ "los desarrolladores de aplicaciones escriban el programa una vez y lo "
					+ "ejecuten en cualquier dispositivo";
			int busca=texto.indexOf("general");
			System.out.println("Vamos a buscar la palabra general"+"\nEstá en la posición: "+busca);
		}

	}
