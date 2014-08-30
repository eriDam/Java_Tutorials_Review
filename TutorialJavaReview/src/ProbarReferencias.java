//Una referencia es una direccion que indica donde estan almacenados
//los métodos y variables de un objeto. Las referencias no crean o copian objetos. 
import java.awt.Point;

public class ProbarReferencias {

	public static void main(String[] args) {
		// Creamos dos variables del tipo point
		Point pt1, pt2;
		//Creamos un objeto de la clase point, al que le pasamos unos valores x e y, y que vamos a guardar en la variable pt1
		pt1 = new Point (100, 100);
		//Incluimos la diferenciaa. En la variable pt2 vamos a almacenar una referencia del objeto que hemos almacenado en pt1
		pt2 = pt1;//no creamos  un nuevo objeto para pt2
		System.out.println("El valor de pt1 es: "+pt1+"\nEl valor de pt2 es igual al del pt1, pt2: "+pt2);
		
		//Si cambiamos los valores de pt1 tambien se cambian en pt2, por que no se ha creado un nuevo objeto, si no una referencia
		pt1.x= 200;
		pt1.y= 200;
		System.out.println("\n\t\t**Modificación de valores**\n   ");
		System.out.println("El valor de pt1 es: "+pt1+"\nEl valor de pt2 es igual al del pt1, pt2: "+pt2);
	}

}
