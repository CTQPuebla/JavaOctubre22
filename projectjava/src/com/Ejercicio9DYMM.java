package com;

import java.util.Scanner;

public class Ejercicio9DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
		//escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
		
		int dia; 
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingrese el n�mero para obtener d�a de la semana");
		dia = lector.nextInt();
		
		switch (dia) {
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
			System.out.println("s�bado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("ERROR");
			
		}
		
		
		
		
	}
	
		
	
	
	
}
