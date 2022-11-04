package com;

import java.util.Scanner;

public class Ejercicio11cba {
	public static void main(String[] args) {
		
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
		
		int zona;
		int peso;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar zona 1. NA, 2. CA 3. SA, 4. EUR, 5. ASIA");
		zona = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar peso");
		peso = lector.nextInt();
		
		
		if (zona == 1 && peso <6 ) {
			System.out.println(peso * 24 + " euros");
		}else if (zona == 2 && peso <6) {
			System.out.println(peso * 20 + " euros");
		}else if (zona == 3 && peso <6) {
			System.out.println(peso * 21 + " euros");
		}else if (zona == 4 && peso <6) {
			System.out.println(peso * 10 + " euros");
		}else if (zona == 5 && peso <6) {
			System.out.println(peso * 18 + " euros");
		}else {
			System.out.println("ENTREGA RECHAZADA");
		}
		
		
	}//fin main

}//fin
