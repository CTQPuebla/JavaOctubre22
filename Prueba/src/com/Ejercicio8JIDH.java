package com;

import java.util.Scanner;

public class Ejercicio8JIDH {
	
	public static void main(String[] args) {
		
		int r;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el resultado del lanzamiento del dado: ");
		r = lector.nextInt();
		
		switch(r) {
		case 1:
			System.out.println("Seis");
			break;
			
		case 2:
			System.out.println("Cinco");
			break;
			
		case 3:
			System.out.println("Cuatro");
			break;
			
		case 4:
			System.out.println("Tres");
			break;
			
		case 5:
			System.out.println("Dos");
			break;
			
		case 6:
			System.out.println("Uno");
			break;
			
		default:
			System.out.println("ERROR: Número Incorrecto.");
			
		}	
		
	}

}
