package com;

import java.util.Scanner;

public class Ejercicio15cba {
	public static void main(String[] args) {
		
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int valor;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar valor final a multiplicar");
		valor = lector.nextInt();
		

		System.out.println("tabla del 12");
		for (int i = 0; i < valor+1; i++) {
			System.out.println(12*i);
			
		}
		
		
		
		
		
		
	}//fin main
	
	
}//fin
