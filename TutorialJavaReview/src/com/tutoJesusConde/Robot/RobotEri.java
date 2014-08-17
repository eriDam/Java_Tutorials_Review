package com.tutoJesusConde.Robot;

public class RobotEri {

	//Creo los atributos del robot
	String estatus;
	double temperatura;
	int velocidad;
	
	//metodo para cambiar temperatura
	public void comprobarTemperatura() {
		if (temperatura > 660){
			estatus="Volviendo a casa...";
			velocidad=5;
		}
	}
	//metodo para mostrar los atributos.
	public void mostrarAtributos(){
		System.out.println("Estatus: "+estatus);
		System.out.println("Temperatura: "+temperatura);
		System.out.println("Velocidad: "+velocidad);
		System.out.println();
	}

}
