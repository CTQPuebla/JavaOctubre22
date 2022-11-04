package com;

import java.util.Scanner;

public class Arraydimencional {
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		String [][] fila = new String [3][7];
		
		for (int f = 0; f < fila.length; f++) {
			for (int c = 0; c < fila[f].length; c++) {
				fila[f][c]=lector.nextLine();
			}
		}
		
		
	}//fin main

}//fin
