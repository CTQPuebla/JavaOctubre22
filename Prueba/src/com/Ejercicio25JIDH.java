package com;

import java.util.Scanner;

public class Ejercicio25JIDH {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese ancho: ");
		int ancho = lector.nextInt();
		System.out.print("Ingrese largo: ");
		int largo = lector.nextInt();
		

		for (int fila = 1; fila <= ancho; fila++) {
			for (int columna = 1; columna <= largo; columna++)
				System.out.print("*");
			
			System.out.println();
		}

	}
		
	}
