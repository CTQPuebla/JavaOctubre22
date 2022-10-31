package com;

import java.util.Scanner;

public class Ejercicio5MARB {
	// Realiza un programa que calcule la aceptación de una solicitud en base a los
	// siguientes parámetros: edad, nota y sexo.
	// * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	// * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	// * Otros casos -> NO ACEPTADA}

	public static void main(String[] args) {

		int nota;
		int edad;
		String sexo;

		Scanner letrero = new Scanner(System.in);
		System.out.println("ingresa la nota");
		nota = letrero.nextInt();
		System.out.println("ingresa la edad");
		edad = letrero.nextInt();
		letrero.nextLine();
		System.out.println();
		sexo = letrero.nextLine();

		if (nota > 5 && edad >= 18 && sexo.equals("M")) {

			System.out.println("posible");

		} else if (nota > 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("aceptada");

		} else {
			System.out.println("no aceptado");
		}

	}

}
