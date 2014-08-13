
public class IfElse {

	public static void main(String[] args) {
		// Uso de condicionales, normalmente para 2 casos o condiciones
		//Creo las variables con su valor ya directamente
		int puntuacion = 9;
		char grupo = 'C';
		
		//Comienza el if
		if (puntuacion >= 5) {
			System.out.println("Enhorabuena has aprobado!!");
			System.out.println("Tu nota final es: "+puntuacion);
			//Si la condicion se cumple lo introducimos en el grupo A
			grupo='A';
		}else{
			System.out.println("Lo siento, pero has suspendido...");
			//Si la condicion no se cumple lo introducimos en el grupo B
			grupo='B';	
		}
		//Después el programa continua las lineas siguientes y nos muestra según la calificación
		//obtenida, el grupo al que pertenece el usuario
		System.out.println("*** Según la calificación obtenida que ha sido: "+puntuacion+" ***\n***      Ahora formas parte del grupo: "+grupo+" ***");
	}

}
