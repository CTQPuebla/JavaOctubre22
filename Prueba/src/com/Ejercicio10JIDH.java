package com;

import java.util.Scanner;

public class Ejercicio10JIDH {
	
	public static void main(String[] args) {
		
		int d;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero entre el 1 y el 12: ");
		d = lector.nextInt();
		
		switch (d) {
		case 1:
			System.out.println("Enero - 31 d�as");
			break;
			
		case 2:
			System.out.println("Febrero - 28 d�as");
			break;
		
		case 3:
			System.out.println("Marzo - 31 d�as");
			break;
			
		case 4:
			System.out.println("Abril - 30 d�as");
			break;	

		case 5:
			System.out.println("Mayo - 31 d�as");
			break;
			
		case 6:
			System.out.println("Junio - 30 d�as");
			break;	
			
		case 7:
			System.out.println("Julio - 31 d�as");
			break;
			
		case 8:
			System.out.println("Agosto - 31 d�as");
			break;	
			
		case 9:
			System.out.println("Septiembre - 30 d�as");
			break;	
			
		case 10:
			System.out.println("Octubre - 31 d�as");
			break;	
			
		case 11:
			System.out.println("Noviembre - 31 d�as");
			break;	
			
		case 12:
			System.out.println("Diciembre - 31 d�as");
			break;		
			
		default:
			System.out.println("Error");
		}
		
	}

}
