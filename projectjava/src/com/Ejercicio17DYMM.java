package com;

import java.util.Scanner;

public class Ejercicio17DYMM {

	public static void main(String[] args) {
		
		String palabra;
		String reversa = "";
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresar la frase");
		palabra = lector.nextLine();
		
		for (int i= palabra.length()-1; i >=0; i--) { 
			
		System.out.println(palabra.charAt(i));
			
			reversa = reversa + palabra.charAt(i);

		}
		
		
		System.out.println(reversa);
		
		
		if (palabra.equals(reversa)) { 
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
		
		
	}
}
