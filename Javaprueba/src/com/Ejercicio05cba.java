package com;

import java.util.Scanner;

public class Ejercicio05cba {
	public static void main(String[] args) {
		
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		int nota;
		int edad;
		String sexo;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar nota");
		nota = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar edad");
		edad = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar sexo");
		sexo = lector.nextLine();
		
		if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("POSIBLE");
		}else if (nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
		
	}//fin main
	
}//fin
