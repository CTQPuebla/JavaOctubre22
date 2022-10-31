package com;

import java.util.Scanner;

public class Ejercicio8UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("indicar el número de la cara del dado lanzado: ");
		n = Integer.parseInt(entrada.next());
		switch (n) {
		case 1:
			System.out.println("La cara contraria es seis");
			break;
		case 2:
			System.out.println("La cara contraria es cinco");
			break;
		case 3:
			System.out.println("La cara contraria es cuatro");
			break;
		case 4:
			System.out.println("La cara contraria es tres");
			break;
		case 5:
			System.out.println("La cara contraria es dos");
			break;
		case 6:
			System.out.println("La cara contraria es uno");
			break;
		default: 
			System.out.println("Error de número");
			break;
		}
	}
}
