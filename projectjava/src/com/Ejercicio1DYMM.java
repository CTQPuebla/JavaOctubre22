package com;

import java.util.Scanner;

public class Ejercicio1DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		int a;
		int b;
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa valor 1");
		a = lector.nextInt();
		System.out.println("Ingresa valor 2");
		b = lector.nextInt();
		
		if (a>b) {
			System.out.println("El n�mero mayor es " + a );
		}else if (b>a) {
			System.out.println("El n�mero mayor es " + b);
		}else if (a==b) { 
			System.out.println("Son n�meros iguales");
		}
		
	}
	
	
	
}
