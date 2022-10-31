package com;

import java.util.Scanner;

public class Ejercicio2YHZ {

	public static void main(String[] args) {
		
		int x;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		x = lector.nextInt();
		
		if(x % 2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
	}

}
