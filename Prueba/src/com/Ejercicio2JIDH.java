package com;

import java.util.Scanner;

public class Ejercicio2JIDH {
	
	public static void main(String[] args) {
		
		int x;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa un n�mero: ");
		x = lector.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("El n�mero es par");
		} else {
			System.out.println("El n�mero es impar");
		}
		
		
		
	}

}
