package com;

import java.util.Scanner;

public class Ejercicio1DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int a;
		int b;
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa valor 1");
		a = lector.nextInt();
		System.out.println("Ingresa valor 2");
		b = lector.nextInt();
		
		if (a>b) {
			System.out.println("El número mayor es " + a );
		}else if (b>a) {
			System.out.println("El número mayor es " + b);
		}else if (a==b) { 
			System.out.println("Son números iguales");
		}
		
	}
	
	
	
}
