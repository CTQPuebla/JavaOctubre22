package com;

import java.util.Scanner;

public class Ejercicio7JIDH {
	
	public static void main(String[] args) {
		
		int e;
		int a;
		int b;
		int c;
		int d;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el número de estudiantes: ");
		e = lector.nextInt();
		
		if(e >= 100) {
			a = e*65;
			System.out.println("El costo es de 65 Euros por alumno, en total " + a + " Euros a la compañia de autobuses.");
		} else if(e >= 50 && e <= 99) {
			b = e*70;
			System.out.println("El costo es de 70 Euros por alumno, en total " + b + " Euros a la compañia de autobuses.");
		} else if (e >= 30 && e <= 49) {
			c = e*95;
			System.out.println("El costo es de 95 Euros por alumno, en total " + c + " Euros a la compañia de autobuses.");
		} else if(e < 30) {
			d = 4000/e;
			System.out.println("El costo del autobús es de 4000 Euros, cada alumno pagará " + d + " Euros.");
		}
	}

}
