import java.util.*;
public class ordenarNombres {

	public static void main(String[] args) {
		// Creamos el array ya con los nombres que contiene
		String nombres[] = {"Miguel","Maria","Alberto","Fernando","Alejandro", 
				"Rosa","Evaristo","Bernardo","Francisco","Homero",
				"Cristina","Carla","César"};
		
		System.out.println("**** El orden original ****");
		for (int i = 0;i < nombres.length; i++){
			System.out.println(i + " : "+nombres[i]+ " " );
		}
		//Ordenamos con sort por orden alfabetico
	Arrays.sort(nombres);
	System.out.println("\n **** El nuevo orden ****");
	for (int i = 0; i < nombres.length; i++) {
		System.out.println(i + " : "+nombres[i]+ " ");
	
	}
	System.out.println();
	}

}
