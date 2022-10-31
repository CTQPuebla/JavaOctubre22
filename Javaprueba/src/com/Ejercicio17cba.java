package com;

import java.util.Scanner;

public class Ejercicio17cba {
	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo.
		
		String texto;
		String reverse = "";
		
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar texto");
		texto = lector.nextLine();
		String texto2 = texto.toLowerCase().replace(" ", "");
		//System.out.println(texto2);
		
		for (int i = texto2.length()-1; i >=0; i--) {
			
			reverse=reverse+texto2.charAt(i);
		}
		
		if (texto2.equals(reverse)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
			
		
	}//fin main
	
}//fin
