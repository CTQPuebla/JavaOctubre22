package com;

import java.util.Scanner;

public class Ejercicio11JIDH {
	
	public static void main(String[] args) {
		
		int k;		
		int u;
		int p;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese la zona de ubicación:\n"
				+ "1 América del Norte\n"
				+ "2 América Central\n"
				+ "3 América del Sur\n"
				+ "4 Europa\n"
				+ "5 Asia\n");
		u = lector.nextInt();
		System.out.println("Ingrese el peso del paquete: ");
		k = lector.nextInt();
		
		
		if(u == 1 && k <= 5) {
			p = k*24;
			System.out.println("El costo sería de: " + p + " Euros");
		} else if(u == 2 && k <= 5) {
			p = k*20;
			System.out.println("El costo sería de: " + p + " Euros");
		} else if(u == 3 && k <= 5) {
			p = k*21;
			System.out.println("El costo sería de: " + p + " Euros");
		} else if(u == 4 && k <= 5) {
			p = k*10;
			System.out.println("El costo sería de: " + p + " Euros");
		} else if(u == 5 && k <= 5) {
			p= k*18;
			System.out.println("El costo sería de: " + p + " Euros");
		} else if(u > 5) {
			System.out.println("No existe esta zona de ubicación.");
		}else if(k > 5) {
			System.out.println("No se puede transportar con un peso mayor a 5kg.");
		}
	}

}
