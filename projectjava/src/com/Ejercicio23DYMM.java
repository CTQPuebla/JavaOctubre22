package com;

import java.util.Scanner;

public class Ejercicio23DYMM {

	public static void main(String[] args) {
		
		//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		int a, b, mayor, menor;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa n�mero 1");
		a = lector.nextInt();
		System.out.println("Ingresa n�mero 2");
		b = lector.nextInt();
		
		for (int i = a; i <= b; i++) {
			
			if (a>b) {
				mayor= a;
			} else {
				menor= a;
				
				if (i % 2 == 0 ) {
					System.out.println(i);
		
				}
				
			}
		}
	}
}
