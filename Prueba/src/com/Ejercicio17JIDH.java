package com;

import java.util.Scanner;

public class Ejercicio17JIDH {
	
	public static void main(String[] args) {
		
		String cadena;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese una cadena: ");
		cadena = lector.next();

		int cont = 1;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)) {
				cont = 0;
				break;
			}
			
			
		}
		
		System.out.println(cont == 1 ? "Es palindromo" : "No es palindromo");
      

	}
}
