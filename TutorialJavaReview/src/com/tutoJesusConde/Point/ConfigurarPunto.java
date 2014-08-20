package com.tutoJesusConde.Point;
import java.awt.Point;

public class ConfigurarPunto {

	public static void main(String[] args) {
		//Creo un objeto de la clase point y pasandole unos argumentos que ya conocemos x e y
		Point localizacion = new Point(4, 13);
		System.out.println("Empezar localización: ");
		
		//Utilizamos la sintxis del punto, dot notation, un objeto creado. asignar o modificar los valores de 1 objeto
		System.out.println("La localización de x es: "+localizacion.x);
		System.out.println("La localización de y es: "+localizacion.y);
		
		//Cambio los valores de x e y
		System.out.println("\nAsignamos nuevo valor, mover a (7-6)");
		localizacion.x = 7;
		localizacion.y = 6;
		System.out.println("Nueva localizacion de x = "+localizacion.x+"\nNueva localizacion de y = "+localizacion.y);
	}

}
