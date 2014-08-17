import java.util.*;	
// Programa que va a contar el número de veces que se repite una lera 
	//extrayendola del texto de la a a la z.
public class cuentaPalabras {

	public static void main(String[] args) {
	//Creamos un array de String donde almacenamos las frases y lo imprimimos
		System.out.println("          *** Array TextoFrases ***   ");
	String[] textoFrases={"En Java, los Array pueden ser de cualquier tipo de dato, incluidos objetos.",
		"El tipo de dato Array es, a su vez, un objeto.",
		"Las variables del tipo Array se declaran utilizando [], del siguiente modo:",
		"Por ejemplo, int[]  fila;",
		"declara la variable fila del tipo Array de datos del tipo int.",
		"Estas variables almacenarán la referencia al objeto."
		};
	for(int i=0;i<textoFrases.length;i++){
	System.out.println(textoFrases[i]);
	}
	//Creamos un array de integer que hara de contador y almacenador de numero de veces que
	// aparece cada letra, con 26 elementos
	int [] contadorLetras =new int [26];
	//Creamos un loop que se va a iterar a lo largo de textoFrases, y se determina la cantidad de veces con la variable .length 
	for (int contador = 0;contador <textoFrases.length; contador++){
		//creamos variable de tipo string vamos a configurarla con el valor
		//del elemento actual cada vez que va recorriendo el loop
		String actual = textoFrases[contador];
		//Creo un array de tipo char y utilizo dentro el metodo toCharArray, de modo que cada vez
		//que se vaya iterando el ciclo, convertiremos cada 1 de estas frases
		//en caracteres guardados dentro de un array. 
		char[] letras = actual.toCharArray();
		//incluye dentro otro loop for, anidado, 
		for (int contador2 = 0; contador2 < letras.length; contador2++){
			char let=letras[contador2];//crear variable tipo char, nombre let y vamos guardando el valor de la letra actual
			if ( (let >='a') & (let <='z') ) {
				contadorLetras[let - 'a']++;//Damos a let el valor de A justo para que coincidan y se resta de let para que coincida con los valores ASCII
			}
		}
	}
		System.out.println("***Recorremos el array del texto***");
		for (char contador='a';contador<='z';contador++){
			System.out.println("La letra : "+contador+" Aparece: "+contadorLetras[contador-'a']+" veces.");
		}
		
	}
}
