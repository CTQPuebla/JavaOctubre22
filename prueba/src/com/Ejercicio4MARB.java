package com;

import java.util.Scanner;

public class Ejercicio4MARB {
	//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String cadena;
		//solicitud de datos al usuario
		System.out.println("introduce la cadena que deses");
		cadena = lector.nextLine();
		
		// realizamos calculos y mostramos en pantalla
		if (cadena.length() !=1){
			System.out.println("la letra no es una letra mayuscula");
			
			//else if ((cadena>"A")&&(cadena<"Z")){
		}else if ((cadena.compareTo("A") >=0) && (cadena.compareTo("Z")<=0)) {
			System.out.println("la cadena es una letra mayscula.");
		}else {
			System.out.println("la cadena no es una letra mayuscula.");
			
		}
	}

}
