package com.tutoJesusConde.Punto3D;
import java.awt.*;
public class ComprobarPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point objeto1 = new Point(11, 22);
		Punto3D objeto2 = new Punto3D(7,6,64);
		
		System.out.println("**El punto 2D está localizado en ("+objeto1.x+", "+objeto1.y+")");
		System.out.println("\tEstá siendo movido a (4, 13) \n");
		objeto1.move(4,  13);
		System.out.println("**El punto 2D está ahora en ("+ objeto1.x +", "+objeto1.y +")\n");
		System.out.println("\tEstá siendo movido -10 unidades tanto en el eje  x" 
		+ ", como en el eje y");
		objeto1.translate(-10, -10);
		System.out.println("**El punto 2D finaliza en ("+objeto1.x+ ", "+objeto1.y+")\n");
		
		System.out.println("El punto 3D está localizado en ("+ objeto2.x + ", " + objeto2.y + ", " +objeto2.z +")");
		System.out.println("");
	}

}
