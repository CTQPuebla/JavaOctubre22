package com;

import java.util.Scanner;

public class Ejercicio24_BMNA {

	public static void main(String[] args) {
		int sumap = 0, sumai = 0;
		int [] numeros = new int[20];
		
		Scanner numero = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Digite los numeros: ");
			numeros [i] = numero.nextInt();
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros [i] % 2 == 0) {
				System.out.println(numeros[i] + " Es un numero par");
			} else {
				System.out.println(numeros[i] + " Es un numero impar");
				sumai = sumai + numeros[i];
			}
			
			if(numeros [i] < 0) {
				System.out.println(numeros[i] + " Es un numero negativo");
			} else {
				System.out.println(numeros[i] + " Es un numero positivo");
				sumap = sumap + numeros[i];
			}
			
			
		}
		
		
		System.out.println("La suma de positivos es: " + sumap);
		System.out.println("La suma de impares es: " + sumai);

	}

}
