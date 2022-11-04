package com;

import java.util.Scanner;

public class Ejercicio22DYMM {

	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
		
		int a, b, mayor, menor;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa número 1");
		a = lector.nextInt();
		System.out.println("Ingresa número 2");
		b = lector.nextInt();
		
		
		
		
		for (int i = a; i <= b; i++) {
			
			if (a>b) {
				mayor= a;
			} else {
				menor= a;

			
			System.out.println(i);
		}
		}
	}
}
