package com;

import java.util.Scanner;

public class Ejercicio01cba {
	public static void main(String[] args) {
		
		
		int x;
		int y;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar valor x");
		x = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar valor y");
		y = lector.nextInt();
		
		if (x>y) {
			System.out.println(x+" es el mayor");
		}else if (x<y) {
			System.out.println(y+" es el mayor");
		}else if (x==y) {
			System.out.println("valores iguales");
		}
		
		
	}

}
