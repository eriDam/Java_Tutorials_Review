
public class EliminarEspacio {

	public static void main(String[] args) {
		// Almacena un texto en 2 sitios, en uno como String
		String citaDiaria = "La educación consiste en .....";
	    //tambien lo va a almacenar como char conviertiendo el string a carateres
		//El array tendrá tantas posiciones como caracteres tenga el string
		char [] convertir = citaDiaria.toCharArray();
	    
		for (int dex = 0;dex < convertir.length;dex++){
	    	char current = convertir[dex];
	    	//comprobara si lo que tiene es un caracter, si no colocara un punto
	    	if (current != ' '){
	    		System.out.println(current);
	    	}
	    	else {
	    		System.out.println('.');
	    	}
	    }
	}

}
