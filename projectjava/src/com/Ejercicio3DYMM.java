package com;

import java.util.Scanner;

public class Ejercicio3DYMM {

	public static void main(String[] args) {
		
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		int a;
		int b;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa valor 1");
		a = lector.nextInt();
		System.out.println("Ingresa valor 2");
		b = lector.nextInt();
				
		if (b == 0 ) {
			System.out.println("ERROR");
		} else {
			System.out.println("El resultado de la divisi�n es  " + a/b);
		}
		
		
		
	}
	
	
	
	
	
}
