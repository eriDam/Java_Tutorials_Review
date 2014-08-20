package com.tutorial.JesusConde.ObjetosString;

public class RevisorStrings {

	public static void main(String[] args) {
		// creamos el String mediante el metodo implicito, estamos creand un objeto de la clase string, de  forma que de manera excepcional, no necesitamos poner new
		String str = "  La estupidez iniste siempre";
		System.out.println("***El String es: \n"+str);
	
		//Vamos a aplicarle los métodos que tiene la clase String
		System.out.println("La longitud es de "+str.length( ));
		//Permite indicar cual es el caracter que se encuentra en la posicion que le pasamos como argumento
		System.out.println("La posicion 5 es para el carácter: "+str.charAt(5) );
		//Permite acceder a una parte del string 
		System.out.println("El substring de 3 a 12: "+str.substring(3, 12));
		//Lo contrario de charAt, le indicamos el caracter y nos devuelve la posicion
		System.out.println("El index del carácter z: "+str.indexOf('z') );
		//Convierte todos los caracteres a mayusculas
		System.out.println("  En mayusculas:"+str.toUpperCase());
	}

}
