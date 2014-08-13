
public class Switch {

	public static void main(String[] args) {
		//Varias opciones aunque se mejora el código con uso de switch
		//Creo las variables con valor
		char grupo='A';
		System.out.println("-¿Sabes a qué grupo perteneces?");
		//En caso de que grupo sea igual == a A saltará el mensaje
		switch (grupo) {
		case 'A':	
		System.out.println("-¡Formas parte del grupo A, enhorabuena! ");
		break;
		//En caso de que grupo sea igual == a B saltará el mensaje
		case 'B':
			System.out.println("-¡Formas parte del grupo B, aprobado! ");			
		break;
		//En caso de que grupo sea igual == a C saltará el mensaje
		case 'C':
			System.out.println("-¡Formas parte del grupo C, suspendido...! ");
		break;
		//Si no se cumple ninguno de los anteriores saltara este mensaje default 
		 default:
			 System.out.println("Tienes una D, necesitas un cambio...");
		}
	}

}
