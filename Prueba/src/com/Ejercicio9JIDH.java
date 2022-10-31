package com;

import java.util.Scanner;

public class Ejercicio9JIDH {
	
	public static void main(String[] args) {
		
		int b;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el día de la semana (1-7): ");
		b = lector.nextInt();
		
		switch (b) {
		case 1:
			System.out.println("Lunes");
			break;
			
		case 2:
			System.out.println("Martes");
			break;
		
		case 3:
			System.out.println("Miercoles");
			break;
			
		case 4:
			System.out.println("Jueves");
			break;	

		case 5:
			System.out.println("Viernes");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;	
			
		case 7:
			System.out.println("Domingo");
			break;		
			
		default:
			System.out.println("Error");
		}	
		
	}

}
