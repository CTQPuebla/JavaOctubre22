package com;

import java.util.Scanner;

public class Ejercicio16JIDH {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el primer limite a multiplicar");
		num1 = lector.nextInt();
		System.out.println("Introduce el segundo limite a multiplicar");
		num2 = lector.nextInt();
		
		for (int i = num1; i <= num2 ; i++) {
			
			int r;
			r = i*num1;
			System.out.println(i + "x" + num2 + "=" + r );
			
		}
	}

}
