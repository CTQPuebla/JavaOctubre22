package com;

import java.util.Scanner;

public class Ejercicio17F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		int incio = 0;
		String Palabra;
	
		boolean Error = false;
		System.out.print("ingrese la palabra: ");
		Palabra=entrada.nextLine();
		int desarrollo = Palabra.length()-1;
		
		while ((incio<desarrollo) && (!Error)){
						
			if (Palabra.charAt(incio)==Palabra.charAt(desarrollo)){				
				incio++;
				desarrollo--;
			} else {
				Error = true;
			}
		}if (!Error)
			System.out.println(Palabra + " es un PALINDROMO");
		else
			System.out.println(Palabra + " NO es un palindromo");

		}
}