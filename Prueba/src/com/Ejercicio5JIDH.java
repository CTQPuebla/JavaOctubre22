package com;

import java.util.Scanner;

public class Ejercicio5JIDH {
	
	public static void main(String[] args) {
		
		int n;
		int e;
		char s;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese su nota: ");
		n = lector.nextInt();
		System.out.println("Ingrese su edad: ");
		e = lector.nextInt();
		System.out.println("Ingrese su sexo (M/F): ");
		s = lector.next().charAt(0);
		
		if(n >= 5 && e >= 18 && s == 'F') {
			System.out.println("Aceptada");
		} else if(n >= 5 && e >= 18 && s == 'M') {
			System.out.println("Posible");
		} else if(n < 5 && e < 18 && s == 'F') {
			System.out.println("No Aceptada");
		} else if(n < 5 && e < 18 && s == 'M') {
			System.out.println("No Aceptado");
		}
		
	}

}
