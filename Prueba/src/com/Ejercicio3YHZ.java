package com;

import java.util.Scanner;

public class Ejercicio3YHZ {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		x = lector.nextInt();
		System.out.println("Ingresa el segundo numero");
		y = lector.nextInt();
		
		if (y==0) {
			System.out.println("No es posible dividir entre 0");
		}
		else {
			z = x/y;
			System.out.println("El resultado de la divivion es: " +z);
		}
			

	}

}
