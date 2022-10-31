package com;

import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		String[][] fila=new String [3][7];
		
		Scanner s=new Scanner(System.in);
		
		for (int f = 0; f < fila.length; f++) {
			for (int c = 0; c < fila[f].length; c++) {
				System.out.println("Introduce un valor");
				fila[f][c]=s.nextLine();
		
			}
	
		}
		
	}

}
