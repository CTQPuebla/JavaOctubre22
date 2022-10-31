package com;

import java.util.Scanner;

public class Ejercicio3JIDH {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el primer valor");
		x = lector.nextInt();
		System.out.println("Ingresa el segundo valor");
		y = lector.nextInt();
		if(y == 0) {
			System.out.println("Error");
		} else {
			System.out.println(x/y);
		}
	}

}
