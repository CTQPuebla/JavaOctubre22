package com;

import java.util.Scanner;

public class Ejercicio2DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int a;
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa valor 1");
		a = lector.nextInt();
		
		if (a % 2 == 0 ) {
			System.out.println("Número par");
		} else if (a % 2 != 0) {
			System.out.println("Número impar");
		}
		
		
	
	
	
	}
	
}
