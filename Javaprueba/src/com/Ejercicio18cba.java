package com;

import java.util.Scanner;

public class Ejercicio18cba {
	public static void main(String[] args) {

		//Programa que reciba una frase y una letra por teclado. 
		//Deber� retornar como resultado cu�ntas veces existe esa letra 
		//dentro de la frase. Si no existe, imprimir un mensaje 
		//�Car�cter no encontrado�.
		
		String frase;
		String letra;
		int cont = 0;

		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar frase");
		frase = lector.nextLine();
		System.out.println("ingresar letra a buscar");
		letra = lector.next();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra.charAt(0)) {

				cont++;

			}
		}

		if (cont != 0) {
			System.out.println("El caracter " + letra.charAt(0) + " se repite " + cont + " veces");
		} else {
			System.out.println("Caracter no encontrado");
		}

	}// fin main

}// fin
