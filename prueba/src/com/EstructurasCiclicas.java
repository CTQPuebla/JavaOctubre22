package com;

import java.util.Scanner;

public class EstructurasCiclicas {

	public static void main(String[] args) {

		// while
//		int x = 20;
//		//Debe tener una linea que forze el cambio de valor en la variable
//		//de control (x++)
//		while(x>=5) {
//			System.out.println("hola: "+x);
//			x--;
//		}
//		

		// Realiza la ejecucion del codigo al menos 1 vez, y despues pregunta
		// si seguir realizandola

//		int y = 5;
//
//		do {
//			System.out.println("uiuhiuh");
//			y++; //Es necesario agregar la linea del cambio de variable
//		} while (y < 10);
//		
////		
//		//for
//		for (int i = 30; i > 10; i--) {
//			System.out.println("hola: "+i);
//		}
//		
//		
		
		//Ejercicio 17 - Palindromo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");		
		String original;
		String reversa="";		
		original = sc.nextLine(); //Leer lo que cachas del teclado		
		//System.out.println("jyf6d5icb4".charAt(6));		
		//Iterando para armar la reversa
		for (int i = original.length()-1; i >=0 ; i--) {
			//System.out.println(original.charAt(i));			
			reversa = reversa + original.charAt(i);			
		}		
		System.out.println("reversa: "+reversa);
		//System.out.println(reversa.replace(" ", ""));		
		//Comparar original vs reversa
		if(original.equals(reversa)) {
			System.out.println("Si es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		

	}

}
