
public class Switch {

	public static void main(String[] args) {
		//Varias opciones aunque se mejora el c�digo con uso de switch
		//Creo las variables con valor
		char grupo='A';
		System.out.println("-�Sabes a qu� grupo perteneces?");
		//En caso de que grupo sea igual == a A saltar� el mensaje
		switch (grupo) {
		case 'A':	
		System.out.println("-�Formas parte del grupo A, enhorabuena! ");
		break;
		//En caso de que grupo sea igual == a B saltar� el mensaje
		case 'B':
			System.out.println("-�Formas parte del grupo B, aprobado! ");			
		break;
		//En caso de que grupo sea igual == a C saltar� el mensaje
		case 'C':
			System.out.println("-�Formas parte del grupo C, suspendido...! ");
		break;
		//Si no se cumple ninguno de los anteriores saltara este mensaje default 
		 default:
			 System.out.println("Tienes una D, necesitas un cambio...");
		}
	}

}
