package com;

import java.util.Scanner;

public class Ejercicio18_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char letra;
		int y=0;
		
		System.out.println("Dime la palabra");
		frase = entrada.nextLine();
		System.out.println("Dime la letra");
		letra = entrada.next().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			
			if(letra == frase.charAt(i) ) {
				y++;
			}
			
		}
		
		if (y==0) {
			System.out.println("Caracter no encontrado");
		}else {
			System.out.println("El caracter se encontro "+y);
		}

	}

}
