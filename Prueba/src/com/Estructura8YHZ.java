package com;

import java.util.Scanner;

public class Estructura8YHZ {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el numero 1: ");
		num1 = lector.nextInt();
		System.out.println("Ingresa el numero 2: ");
		num2 = lector.nextInt();
	
		if (num1<num2) {
			for (int i = num1;i<=num2;i++) {
				System.out.println(i);	
		}
		}
			else {
			for (int i = num2;i<=num1;i++) {
				System.out.println(i);	
		}
		}
		
	}
}
