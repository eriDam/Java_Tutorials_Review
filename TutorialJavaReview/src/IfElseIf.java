
public class IfElseIf {

	public static void main(String[] args) {
		//Varias opciones aunque se mejora el c�digo con uso de switch
		//Creo las variables con valor
		char grupo='M';
		System.out.println("-�Sabes a qu� grupo perteneces?");
		//En caso de que grupo sea igual == a A saltar� el mensaje
		if (grupo == 'A') {
			System.out.println("-�Formas parte del grupo A, enhorabuena! ");
		}
		//En caso de que grupo sea igual == a B saltar� el mensaje
		else if (grupo == 'B'){
			System.out.println("-�Formas parte del grupo B, aprobado! ");			
		}
		//En caso de que grupo sea igual == a C saltar� el mensaje
		else if (grupo == 'C'){
			System.out.println("-�Formas parte del grupo C, suspendido...! ");			
		}
		//Si no se cumple ninguno de los anteriores saltara este mensaje como en el default de switch
		//no le asignamos una letra de grupo ya que a la variable char ya se le ha indicado una letra 
		//as� que la extraemos concatenando la variable grupo
		else {
			System.out.println("-Formas parte del grupo  "+grupo);
		}
	}
}