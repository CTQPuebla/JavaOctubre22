package com;

import java.util.Scanner;

public class Ejercicio6JIDH {
	
	public static void main(String[] args) {
		
		char t;
		int ta;
		int p;
		double a;
		double b;
		double c;
		double d;

		p= 10;
		System.out.println("Precio inicial: $10 el kilo de Uva");
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el tipo de uva (A/B):");
		t = lector.next().charAt(0);
		System.out.println("Ingrese el tamaño de la uva (1/2):");
		ta = lector.nextInt();
		
		
		if(t == 'A' && ta == 1) {
			a = p + 0.2;
			System.out.println("El precio final es de: $" + a);
		} else if(t == 'A' && ta == 2) {
			b = p + 0.3;
			System.out.println("El precio final es de: $" + b);
		} else if(t == 'B' && ta == 1) {
			c = p - 0.2;
			System.out.println("El precio final es de: $" + c);
		} else if(t == 'B' && ta == 2) {
			d = p - 0.5;
			System.out.println("El precio final es de: $" + d);
		}
		
	}

}
