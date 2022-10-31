package com;

import java.util.Scanner;

public class Ejercicio18DYMM {

	public static void main(String[] args) {
		
		String frase, letra; 
		int contador = 0;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa una frase");
		frase = lector.nextLine();
		System.out.println("Ingresa una letra a encontrar");
		letra = lector.nextLine();
		

	    for (int i = 0; i < frase.length(); i++) {
	      if (frase.charAt(i) == letra.charAt(0)) {

	        contador++;

	      }
	    }

	    if (contador != 0) {
	      System.out.println("El caracter " + letra.charAt(0) + " se repite " + contador + " veces");
	    } else {
	      System.out.println("Caracter no encontrado");
	    }
		
		
		
		
	}// fin main
	
}//fin
