package com;

import java.util.Scanner;

public class Ejercicio17_BMNA {

	public static void main(String[] args) {
		
		int x=0,y;
		String cadena;
		
		
		Scanner Cadena = new Scanner (System.in);
		
		System.out.println("Indique una palabra: ");
		cadena = Cadena.next();
		y= cadena.length()-1;
		
		
		for (int i = 0; i <= y; i++) {
			
			if(cadena.charAt(i) == cadena.charAt(y-i)) {
				x++;
			}
				
		}
		
		if (x == cadena.length()) {
			System.out.println("Es un palindromo");
		} else {
			System.out.println("No es un palindromo");
		}
		
		
		

		
		
		

		
		
		
		
		
		

	}

}
