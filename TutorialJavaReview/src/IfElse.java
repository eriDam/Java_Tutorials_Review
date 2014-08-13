
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
		}else{
			System.out.println("Lo siento, pero has suspendido...");
		}

	}

}
