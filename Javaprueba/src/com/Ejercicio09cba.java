package com;

import java.util.Scanner;

public class Ejercicio09cba {
	public static void main(String[] args) {
		
		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		int diadelaseman;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar dia de la semana");
		diadelaseman = lector.nextInt();
		
		switch (diadelaseman) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("ERROR");
		}
		
	}//fin main
	
	
}//fin
