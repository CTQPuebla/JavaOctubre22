package com;

import java.util.Scanner;

public class Ejercicio10DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el mes correspondiente.
		
		int mes; 
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingrese el n�mero para obtener d�a de la semana");
		mes = lector.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("enero");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("marzo");
			break;
		case 4:
			System.out.println("abril");
			break;
		case 5:
			System.out.println("mayo");
			break;
		case 6:
			System.out.println("junio");
			break;
		case 7:
			System.out.println("julio");
			break;
		case 8:
			System.out.println("agosto");
			break;
		case 9:
			System.out.println("septiembre");
			break;
		case 10:
			System.out.println("octubre");
			break;
		case 11:
			System.out.println("noviembre");
			break;
		case 12:
			System.out.println("diciembre");
			break;
		default:
			System.out.println("ERROR");
			
		}
		
	}
	
}
