package com;

import java.util.Scanner;

public class Ejercicio11DYMM {

	public static void main(String[] args) {
		
		String zona;
		int peso;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Indique la zona a la que necesita el env�o");
		zona = lector.nextLine();
		System.out.println("Indique el peso de su paquete");
		peso = lector.nextInt();
		
		if (zona.equals("Am�rica del norte") && peso <= 5) {
			System.out.println("El costo de su env�o es de " + 24.00 * peso + " euros");
		} else if (zona.equals("Am�rica central") && peso <= 5) {
			System.out.println("El costo de su env�o es de " + 20.00 * peso + " euros");
		} else if (zona.equals("Am�rica del sur") && peso <= 5) {
			System.out.println("El costo de su env�o es de " + 21.00 * peso + " euros");
		} else if (zona.equals("Europa") && peso <= 5) {
			System.out.println("El costo de su env�o es de " + 10.00 * peso + " euros");
		} else if (zona.equals("Asia") && peso <= 5) {
			System.out.println("El costo de su env�o es de " + 18.00 * peso + " euros");
		} else {
			System.out.println("No se puede realizar su env�o");
		}
		
	}
	
}
