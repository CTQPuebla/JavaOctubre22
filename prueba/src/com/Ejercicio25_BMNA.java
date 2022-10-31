package com;

import java.util.Scanner;

public class Ejercicio25_BMNA {

	public static void main(String[] args) {

		int matriz [][];
		int columnas, filas;
		
		Scanner Dato = new Scanner (System.in);
		
		System.out.println("Digite la cantidad de columnas: ");
		columnas = Dato.nextInt();
		System.out.println("Digite la cantidad de filas: ");
		filas = Dato.nextInt();
		
		matriz = new int [filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				System.out.print("*" + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
	}

}
