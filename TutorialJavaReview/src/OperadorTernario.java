
public class OperadorTernario {

	public static void main(String[] args) {
		// El operador ternario simplifica mucho el codigo con apenas 5 pasos
		int puntuacion = 3;
		String mensaje;
		mensaje = (puntuacion>=5) ? "¡Enhorabuena, has aprobado!"+" Tu nota final es: "+puntuacion : "Has supedido, lo siento."+" Tu nota final es: "+puntuacion;
		System.out.println(mensaje);		

	}

}
