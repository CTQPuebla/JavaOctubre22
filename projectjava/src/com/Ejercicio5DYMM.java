package com;

import java.util.Scanner;

public class Ejercicio5DYMM {

	public static void main(String[] args) {
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		int a;
		int b;
		String c;
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Solicitud");
		System.out.println("Ingresa tus notas");
		a = lector.nextInt();
		System.out.println("Ingresa tu edad");
		b = lector.nextInt();
		lector.nextLine();
		System.out.println("Ingresa tu sexo 'M' o 'F'");
		c = lector.nextLine();
		
		if (a>=5 && b>=18 && c.equals("M")) {
			System.out.println("TU SOLICITUD ES POSIBLE");
		}else if (a>=5 && b>=18 && c.equals("F")) { 
			System.out.println("TU SOLICITUD FUE ACEPTADA");
		}else {
			System.out.println("TU SOLICITUD NO FUE ACEPTADA");
		}
		
	}
}
