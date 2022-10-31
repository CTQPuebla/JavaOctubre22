package com;

import java.util.Scanner;

public class Ejercicio1_BMNA {

	public static void main(String[] args) {
		int x;
		int y;
		
		
		Scanner Numeros = new Scanner (System.in);
		System.out.println("Ingrese el primer numero: ");
		x = Numeros.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		y = Numeros.nextInt();
				
		if (x > y) {
			
			System.out.println( x +  " es mayor que " + y);
			
		} else if (y > x) {

			System.out.println(y + " es mayor que " + x);
			
	} else {
		
		System.out.println("Ambos numeros son iguales");
		
	}
		
	}

}
