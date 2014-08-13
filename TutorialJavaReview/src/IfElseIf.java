
public class IfElseIf {

	public static void main(String[] args) {
		//Varias opciones aunque se mejora el código con uso de switch
		//Creo las variables con valor
		char grupo='M';
		System.out.println("-¿Sabes a qué grupo perteneces?");
		//En caso de que grupo sea igual == a A saltará el mensaje
		if (grupo == 'A') {
			System.out.println("-¡Formas parte del grupo A, enhorabuena! ");
		}
		//En caso de que grupo sea igual == a B saltará el mensaje
		else if (grupo == 'B'){
			System.out.println("-¡Formas parte del grupo B, aprobado! ");			
		}
		//En caso de que grupo sea igual == a C saltará el mensaje
		else if (grupo == 'C'){
			System.out.println("-¡Formas parte del grupo C, suspendido...! ");			
		}
		//Si no se cumple ninguno de los anteriores saltara este mensaje como en el default de switch
		//no le asignamos una letra de grupo ya que a la variable char ya se le ha indicado una letra 
		//así que la extraemos concatenando la variable grupo
		else {
			System.out.println("-Formas parte del grupo  "+grupo);
		}
	}

}
