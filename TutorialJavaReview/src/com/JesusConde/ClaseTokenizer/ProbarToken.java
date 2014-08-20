package com.JesusConde.ClaseTokenizer;
//Vamos a probar una clase que separa en tokens un String por ejemplo un texto
//importamos la libreria donde se encuentra esta clase
import java.util.StringTokenizer;

//Creamos la clase
public class ProbarToken {
	//añadimos el método main
	public static void main(String[]arguments){
		//Creamos 2 variables del tipo StringTokenizer donde guardaremos los dos objetos
		//que vamos a crear
		StringTokenizer st1, st2;
		//Creamos el primero de los strings que vamos a usar como argumento para dividirlo utilizando stringTokeizer
		String cita1 = "TEXTO 6 -3/4" ;
		st1 = new StringTokenizer(cita1);//le pasamos el argumento
		//usamos un metodo de StringTokenizer que nos muestra el siguiente token, el espacio en blanco es el que 
		//utiliza para separar las distintas partes del String
		System.out.println("Token 1 : "+st1.nextToken() ) ;
		System.out.println("Token 2 : "+st1.nextToken() ) ;
		System.out.println("Token 3 : "+st1.nextToken() ) ;
		
		//creamos el siguiente String cita2, de nuevo aparecen caracteres d espacio y caracteres de @
		String cita2 = "DSGR@9 32/ 25@2/17";
		//pasamos 2 argumentos para que tome como carcater de  separacion la @ 
		st2 = new StringTokenizer(cita2, "@");
		System.out.println("\nToken 1 : "+st2.nextToken() ) ;
		System.out.println("Token 2 : "+st2.nextToken() ) ;
		System.out.println("Token 3 : "+st2.nextToken() ) ;
	}
	
}
