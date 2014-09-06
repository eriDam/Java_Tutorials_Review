/* Los métodos constuctores son llamados automáticamente
 * cuando se crea un objeto es la única vez q es llamado, es especial, 
 * con diferencias respecto a otros metodos regulares:
 * - Tiene el mismo nombre que la clase, no tiene tipo de retorno, No return.
 * Es un método que no puede ser llamado, 
 */
public class ConstrPizarraHistoria {
	//Creamos tres variables instancia
	String estatus;
	int numeroPregunta;
	int puntuacion;
	
	//CREAMOS EL 1ER CONSTRUCTOR DE LA CLASE, LE PODEMOS PASAR ARGUMENTOS
	/*El constructor es llamado cuando usamos la plabra clave new, lo que hace 
	 * java cuando se crea un objeto es localizar memoria
	 * para el objeto, después inicializa las variables instancia de ese Objeto y
	 * después llama al método Constructor de la clase*/
	public ConstrPizarraHistoria(String entrada1, int entrada2, int entrada3) {
		//Damos un valor a las 3 variables q hemos creado antes, de modo que estatus=al parametro pasado String entrada1, numeroPreg=parametro2 int entrada2...
		estatus = entrada1;
		numeroPregunta = entrada2;
		puntuacion = entrada3;	
	}
	
	
	//Para poder probarlo creamos un método main, y dentro de nuestro metodo vamos a crear un objeto de nuestra Pizarra
	public static void main(String[] args) {
		ConstrPizarraHistoria grecia = new ConstrPizarraHistoria("activa", 3, 6);
		System.out.println("Los valores de nuetsras variables son: ");
		System.out.println(grecia.estatus);
		System.out.println(grecia.numeroPregunta);
		System.out.println(grecia.puntuacion);
		
	}

}
