package com;

import java.util.Scanner;

public class Ejercicio18JIDH {
	
	public static void main(String[] args) {
		
		String cadena;
		char l;		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		cadena = lector.next();
		System.out.println("Escriba una letra: ");
		l = lector.next().charAt(0);
		
		 int posicion, contador = 0;
	        
	        posicion = cadena.indexOf(l);
	        while (posicion != -1) { 
	            contador++;          
	                                          
	            posicion = cadena.indexOf(l, posicion + 1);
	        }
	        
	        System.out.println("La letra se repite: " + contador + " veces");
		
	}

}
