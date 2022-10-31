package com;

import java.util.Scanner;

public class Ejercicio16cba {
	public static void main(String[] args) {
	
	// Programa un algoritmo que realice la tabla de multiplicar de un numero 
	// introducido desde teclado, hasta la iteración 
	// deseada por el usuario.
			
	int tabla;
	int valor;
	Scanner lector = new Scanner(System.in);
	System.out.println("ingresar numero de la tabla deseada");
	tabla = lector.nextInt();
	lector.nextLine();
	System.out.println("ingresar valor final a multiplicar");
	valor = lector.nextInt();
	
	System.out.println("tabla del "+tabla);
	
	for (int i = 0; i <= valor; i++) {
		System.out.println(tabla*i);
		
	}
		
		
	}//fin main
	
}//fin
