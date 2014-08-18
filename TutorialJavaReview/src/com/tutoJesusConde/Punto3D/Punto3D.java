package com.tutoJesusConde.Punto3D;
//Importamos la libreria awt que dentro tiene una clase point 
import java.awt.*;

//La clase la convertimos en subclase de la clase point
public class Punto3D extends Point {
	//Tenemos que definir la variable z ya que x e y las hereda de point
	public int z;
	
	//CONSTRUCTOR DE LA CLASE: Método con el mismo nombre que la clase donde se encuentra
	//Le pasamos los parametros le pasamos los 3 enteros "x e y" que hereda de clase point y tambien z que hemos definido arriba
	public Punto3D(int x, int y, int z){
		//Incluimos las declaraciones
		//Método super hace referfencia a la superclase. Y utiliza de la superclse x e y llamando al constructor
		super(x, y);
		//Método this, es para referenciar al actual objeto Punto3D desde el cual estamos ejecutando la clase.
		//la variable z de este objeto la igualamos al parametro dentro del metodo entre parentesis  
		this.z = z;	
	}
	
	//Creamos un metodo que tambien existen en la super clse point, 
	//utilizamos estos metods y añadimos el valor para z nuestra 3 dimension
	public void move(int x, int y, int z){
		this.z=z;
		super.move(x, y);
		
	}
	public void translate(int x, int y, int z){
		this.z +=z;
		super.translate(x, y);
		
	}
}
