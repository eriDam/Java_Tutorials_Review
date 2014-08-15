
public class ContinueLoop {

	public static void main(String[] args) {
		//Ejemplo de loop similar al anterior pero usando continue:
				int index2 = 0;
				//mientras que index sea menos o igual que 1000 
				while (index2 <= 1000){
				//index irá aumentando en 5
				index2 = index2 +5;
				//Con este if, indicamos que si index es == 400, 
					if (index2 == 400)
					//saltará el 400 y va a seguir hasta 1000 
					continue;
					System.out.println("El index2 es: "+index2);
				}//fin while

	}

}
