/*
* Jorge Ivan Hernandez Falcon 
* Realiza un programa que lea una cadena por teclado
*y compruebe si es una letra mayúscula.
*/

package com;

import java.util.Scanner;

public class Ejercicio4HFJI {
	public static void main (String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String cadena;
	
		
//Solicitar datos al usuario
		System.out.print("Introduce la letra");
		cadena = scanner.nextLine();
//Realizamos calculos y mostramos en pantalla
		if (cadena.length() !=1) {
			System.out.println("La cadena no es una letra Mayuscula");
		}else if ((cadena.compareTo("A") >=0) && (cadena.compareTo("Z") <=0)) {
			System.out.println("La cadena es una letra Mayuscula. ");
		}else {
			System.out.println("La cadena no es una letra mayuscula");
		}	
	}
}
