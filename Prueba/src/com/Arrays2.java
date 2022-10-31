package com;

import java.util.Scanner;

public class Arrays2 {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String [][] fila = new String[3][7];
		
		for (int f = 0; f < fila.length; f++) {
			for (int c = 0; c < fila[f].length; c++) {
				System.out.println("Ingresa los valores del arreglo: ");
				fila[f][c] = s.nextLine();	
			}
		}
		
		for (int f = 0; f < fila.length; f++) {
			for (int c = 0; c < fila[f].length; c++) {
				System.out.print(fila[f][c] + " ");
				
			}
			System.out.println();
		}
		
		

		
	}

}
