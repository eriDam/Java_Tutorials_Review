import java.util.Calendar;


public class Reloj {

	public static void main(String[] args) {
		//Obtener fecha y hora actual creando un objeto y utilizando Calendar
		Calendar ahora = Calendar.getInstance();
		int hora = ahora.get(Calendar.HOUR_OF_DAY);
		int minuto = ahora.get(Calendar.MINUTE);
		int mes = ahora.get(Calendar.MONTH)+1;
		int dia = ahora.get(Calendar.DAY_OF_MONTH);
		int anyo = ahora.get(Calendar.YEAR);
		
		//Mostrar saludo
		if (hora < 12) {
			System.out.println("¡¡Buenos días!!");
			} else if (hora > 17) {
				System.out.println("¡¡Buenas tardes!!");
			} else {
				System.out.println("¡¡Buenas noches!!.");
			}
		
		//Iniciar el mensaje horario mostrando las horas
		System.out.println("Son las");
		System.out.print( (hora > 12) ? (hora - 12) : hora);
		System.out.println(" horas ");
	
		//Mostramos los minutos
		if (minuto != 0) {
			System.out.print(minuto + " ");
			System.out.println( (minuto != 1) ? "minutos" :
				"minuto ");
		}
		
		//Mostramos el día
		System.out.print("del día " + dia + " de ");
		
		//Mostrar el nombre del mes
		switch (mes){
		case 1:
			System.out.println("Enero.");
			break;
		case 2:
			System.out.println("Febrero.");
			break;
		case 3:
			System.out.println("Marzo.");
			break;
		case 4:
			System.out.println("Abril.");
			break;
		case 5:
			System.out.println("Mayo.");
			break;
		case 6:
			System.out.println("Junio.");
			break;
		case 7:
			System.out.println("Julio.");
			break;
		case 8:
			System.out.println("Agosto.");
			break;
		case 9:
			System.out.println("Septiembre.");
			break;
		case 10:
			System.out.println("Octubre.");
			break;
		case 11:
		System.out.println("Noviembre.");
			break;
		case 12:
			System.out.println("Diciembre.");
			break;
		}
		
		//Mostrar año
		System.out.println("Estamos en el año " + anyo + ".");
	}

}
