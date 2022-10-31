package com;

import java.util.Scanner;

public class EjercicioArrayDYMM {

	public static void main(String[] args) {
		
		int sumatoria = 0; 
		
		Scanner lector = new Scanner (System.in);
		
		
		
		String [][] tablaA = new String [3][5];
		
		for (int f = 0; f < tablaA.length; f++) {
			for (int c = 0; c < tablaA[f].length; c++) {
				
				System.out.println("Ingrese valor para la tabla A");
				tablaA [f][c] = lector.nextLine();
				
			}	
						
		}	
			

		
		
		String [][] tablaB = new String [3][5];
		
		for (int f = 0; f < tablaB.length; f++) {
			for (int c = 0; c < tablaB[f].length; c++) {
				
				System.out.println("Ingrese valor para la tabla B");
				tablaB [f][c] = lector.nextLine();
		
			}	
			
		}
		
		
		
		
		String [][] tablaC = new String [3][5];
		
		System.out.println("La tabla C es: ");
		
		for (int f = 0; f < tablaC.length; f++) {
			for (int c = 0; c < tablaC[f].length; c++) {
				
				try {
					int n1 = Integer.parseInt(tablaA[f][c]);
					int n2 = Integer.parseInt(tablaB[f][c]);
					tablaC [f][c] = Integer.toString(n1+n2);
				
				
				} catch (Exception ex){
					tablaC[f][c] = "0";	
				}
				
				System.out.print(tablaC[f][c]);
				
			}		
			
			System.out.println(" ");
		}
		
		
		
	} //fin main
	
	
} // fin
