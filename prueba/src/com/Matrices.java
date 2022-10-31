package com;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
                                      //f //c
		String [][] fila = new String [3] [7] ;
		Scanner cadena = new Scanner(System.in);
		
		for (int f = 0; f < fila.length; f++) {
			for (int c = 0; c < fila[f].length; c++) {
				System.out.println("Ingresa un dato: ");
				
				fila [f][c] = cadena.nextLine();
				
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
