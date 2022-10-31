package com;

import java.util.Scanner;

public class Estructura2YHZ {

	public static void main(String[] args) {
		int x;
		int y;
		int r;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de la tabla a realizar: ");
		x = lector.nextInt();
		System.out.println("Ingresa el numero de hasta donde desea multiplicar: ");
		y = lector.nextInt();
		
		for (int i=1;i<=y;i++) {
			r= i*x;
			System.out.println(r);
		}
		

	}

}
