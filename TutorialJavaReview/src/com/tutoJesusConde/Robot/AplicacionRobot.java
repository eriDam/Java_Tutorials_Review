package com.tutoJesusConde.Robot;

public class AplicacionRobot {

	public static void main(String[] args) {
		// Creo un objeto llamado robot para utilizar los metodos de la clase robotEri
		RobotEri robot = new RobotEri();
		//Doy valores a los atributos
		robot.estatus="Explorando";
		robot.velocidad=2;
		robot.temperatura=510;
		//Utilizo uno de los metodos
		robot.mostrarAtributos();
		
		System.out.println("Incrementando la velocidad a 3");
		//Volvemos a modificar la velocidad
		robot.velocidad=3;
		robot.mostrarAtributos();
		
		//Comprobamos que funciona el metodo cambiando la temperatura 
		System.out.println("Cambiando temperatura");
		robot.temperatura=670;
		//Utilizo el metodo para que compruebe la Temperatura
		robot.comprobarTemperatura();
		//Volvemos a mostrar atributos para ver los cambios
		robot.mostrarAtributos();
		
	}

}
