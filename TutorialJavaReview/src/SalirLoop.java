// En esta clase  veremos el uso de break para salir de 1 loop o bucle, as� como continue para continuar el c�digo 
//sin que termine el loop
public class SalirLoop {

	public static void main(String[] args) {
		int index = 0;
		//mientras que index sea menos o igual que 1000 
		while (index <= 1000){
		//index ir� aumentando en 5
		index = index +5;
		//en cada vuelta hasta 1000 ir� aumentando index en 5 y lo imprimir�
			System.out.println(index);
		//Con este if, indicamos que si index es == 400, saldremos del loop y se imprimir�
			if (index == 400){
			System.out.println("index == 400. Saliendo del loop...");
			//termina el loop no va a seguir hasta 1000 aunque la condicion de while as� o indica
			break;
			}//fin if
		}//fin while

		
	}//fin main

}//fin class
