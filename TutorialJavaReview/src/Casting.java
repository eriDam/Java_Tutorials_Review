import java.awt.Graphics;
import java.awt.Graphics2D;

// Casting en Java se utiliza para convertir información entre distintos formatos, objetos y variables simples
//Existen varios tipos de Casting: 
//Se pueden convertir: Variables entre variables, objeto en otro objeto, convertir un objeto en una variable y variable en objeto
//Fuente(origen) y destino (version convertida a un nuevo formato).
//Con el casting no modificamos el original, sino que creamos una nueva variable u objeto

public class Casting {

	public static void main(String[] args) {
		//Los valores booleanos no pueden convertirse a otros formatos
		//Casting de variables simples, precederemos la variable del nuevo formato entre parentesis
		float fuente = (float) 13.213;
		System.out.println("Valor de fuente siendo double: "+fuente);
		int destino=(int)fuente;//Al convertir a integer perdemos la precisión, la coma.
		
		System.out.println("Valor de fuente: "+fuente);
		
		 
	}

}
