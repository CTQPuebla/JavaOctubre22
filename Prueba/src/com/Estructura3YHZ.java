package com;

import java.util.Scanner;

public class Estructura3YHZ {

	public static void main(String[] args) {
		
		String cadena;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa la palabra");
		cadena = lector.nextLine();
		
		int ini=0;
		int fin = cadena.length()-1;
		boolean v = true;
		
		while (ini<fin) {
				if (cadena.charAt(ini)!=cadena.charAt(fin)) {
					v=false;
				}
			
			ini ++;
			fin--;
		}
		
		if (v) {
			System.out.println(cadena+" Es palindromo");
		}else{
			System.out.println(cadena+" No es palindromo");
		}
		

	}

}
