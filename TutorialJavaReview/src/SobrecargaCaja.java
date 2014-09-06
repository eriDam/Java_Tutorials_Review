import java.awt.Point;

	//Definimos una clase simple, va a servirnos para definir una forma rectangular, con 


	public class SobrecargaCaja {
	//4 variables instancia que definen las 4 esquinas, superior izquierda, sup derecha, inf izqda, inferior dcha.
	//Se inicializaran en 0
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	/*Creo un metodo de instancia donde configuro las variables con diferentes
	 *valores diferentes de los que se dan por defecto*/
	
	SobrecargaCaja construirCaja (int x1, int y1, int x2, int y2) {
		//Nos referimos a los parametros que hay que pasar al metodo, los uqe estan declarados arriba, 
		//los 4 valores que se le pasen son los que estan entre parentesis
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		return this;
	}
	
	SobrecargaCaja construirCaja (Point supIzq, Point infDer) {
		x1 = supIzq.x;
		y1 = supIzq.y;
		x2 = infDer.x;
		y2 = infDer.y;
		return this;
	}
	
	//Un tercer modo de poder definir un rectangulo es indicando una esquina superior e indicandole altula y anchura
	SobrecargaCaja construirCaja (Point supIzq, int an, int al) {
		x1 = supIzq.x;
		y1 = supIzq.y;
		x2 = (x1 + an);
		y2 = (y1 + al);
		return this;
	}
	
	//Método para imprimir al que le indicamos que nos imprima x1 y x2, y1 e y2
	void imprimirCaja(){
	System.out.print("Caja: <" + x1 + "," +y1);
	System.out.println(", "+ x2 + ", " + y2 + " >");
	}

	//CREAMOS MÉTODO MAIN PARA PROBAR LOS MÉTODOS DE CONSTRUCCION, (creando llamadas)
	
	public static void main(String[] args) {
		SobrecargaCaja rect = new SobrecargaCaja();
		
		System.out.println("Llamando a construir caja con coordenadas "+ "(25, 25) and (50, 50) :");
		rect.construirCaja(25, 25, 50, 50);
		rect.imprimirCaja();
		
		System.out.println("\nLlamando a contruirCaja con puntos");
		rect.construirCaja(10, 10, 20, 20);
		rect.imprimirCaja();
		

	}

}
