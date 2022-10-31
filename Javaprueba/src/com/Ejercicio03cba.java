package com;

import java.util.Scanner;

public class Ejercicio03cba {
	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar valor x");
		x = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar valor y");
		y = lector.nextInt();
		
		if (y == 0) {
			System.out.println("error");
		}else if (y != 0) {
			System.out.println(x / y);
		}
		
		
		
	}//main

}//fin
