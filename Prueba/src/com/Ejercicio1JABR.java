package com;

import java.util.Scanner;

public class Ejercicio1JABR {

	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingresa un valor");
		x=lector.nextInt();
		System.out.println("Ingresa otro valor");
		y=lector.nextInt();
		if (x<y) {
			System.out.println("El primer valor es menor");
		}else if (x==y) {
			System.out.println("Los valores son iguales");
		}else
			System.out.println("El primer valor es mayor");
		
		}
}
