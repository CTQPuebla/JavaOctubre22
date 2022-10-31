package com;

import java.util.Scanner;

public class Ejercicio18_BMNA {

	public static void main(String[] args) {
		
		String Palabra;
		char caracter;
		int largo,x=0;
		
		Scanner Cadena = new Scanner (System.in);
		
		System.out.println("Introduzca una palabra: ");
		Palabra=Cadena.next();
		System.out.println("Introduzca una letra: ");
		caracter=Cadena.next().charAt(0);
		
		largo=Palabra.length();
		
		for (int i = 0; i <= largo-1; i++) {
			
			if(caracter == Palabra.charAt(i)) {
				x++;
			}
				
		}
		
		System.out.println("El caracter aparece " + x + " veces");
		
		
	}

}
