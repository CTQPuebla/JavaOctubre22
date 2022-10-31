package com;

import java.util.Scanner;

public class EstructurasControl {
	
	public static void main(String[] args) {
		
		//Estructuras de decision - valores boolean
		
		int d = 5;
		
		if(d == 1) {
			System.out.println("Lunes");
		} else if(d == 2){
			System.out.println("Martes");
		} else if(d == 3) {
			System.out.println("Miercoles");
		} else if(d == 4) {
			System.out.println("Jueves");
		} else if(d == 5) {
			System.out.println("Viernes");
		} else if(d == 6) {
			System.out.println("Sabado");
		} else if(d == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("Desconocido");
		}
		
		
		int b = 5;
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
			System.out.println("Desconocido");
		}	
		
		
		int p = 20;
		String x;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa un valor");
		p = p + lector.nextInt(); //30\n
		lector.nextLine();
		System.out.println("Ingresa un texto");
		x = lector.nextLine();   //hola\n
		
		System.out.println("Valor: " + p);
		System.out.println("Valor: " + x);
		
	}

}
