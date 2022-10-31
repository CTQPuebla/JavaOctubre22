package com;

import java.util.Scanner;

public class Ejercicio3_BMNA {

	public static void main(String[] args) {
		int x;
		int y;
		
		
		
		Scanner Numeros = new Scanner (System.in);
		System.out.println("Ingrese el primer numero: ");
		x = Numeros.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		y = Numeros.nextInt();
		
		if (y > 0) {
			
			System.out.println("Es resultado de la division es: " + (x/y));
			
		} else {
			System.out.println("No se puede dividir entre 0");
		}

	}

}
