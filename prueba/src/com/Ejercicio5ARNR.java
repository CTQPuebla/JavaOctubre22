package com;

import java.util.Scanner;

public class Ejercicio5ARNR {
	public static void main(String[] args) {

		int nota;
		int edad;
		String sexo;

		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa la nota");
		nota = sc.nextInt();

		System.out.println("ingresa la edad");
		edad = sc.nextInt();
		
		sc.nextLine();
		System.out.println("ingresa el sexo");
		sexo = sc.nextLine();

		if (nota>=5&&edad>=18&&sexo.equals("M")) {
			System.out.println("posible");

		} else if (nota>=5&&edad>=18&&sexo.equals("F")) {
			System.out.println("aceptado");

		} else {
			System.out.println("no aceptado");

		}
	}
}
