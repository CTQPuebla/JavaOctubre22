package com;

import java.util.Scanner;

public class ArrayMatrizMARB {
	public static void main(String[] args) {

		int sumatoria = 0;

		Scanner lector = new Scanner(System.in);

		// TABLA A
		String[][] tablaA = new String[3][5];
		// filas
		for (int f = 0; f < tablaA.length; f++) {
			// columnas
			for (int c = 0; c < tablaA[f].length; c++) {
				// fila [f][c] = s.nextline();
				System.out.println("ingrese los valores para la tabla A: ");
				tablaA[f][c] = lector.nextLine();
			}
		}
		// TABLA B
		String[][] tablaB = new String[3][5];
		// filas
		for (int f = 0; f < tablaB.length; f++) {
			// columnas
			for (int c = 0; c < tablaB[f].length; c++) {
				// fila [f][c] = s.nextline();
				System.out.println("ingresa los valores de la tabla B: ");
				tablaB[f][c] = lector.nextLine();
			}
		}

		// TABLA C
		String[][] tablaC = new String[3][5];
		// filas
		for (int f = 0; f < tablaC.length; f++) {
			// columnas
			for (int c = 0; c < tablaC[f].length; c++) {
				// fila [f][c] = s.nextline();
				System.out.println("el valor de la tabla c:");

				try { // intenta
					int n1 = Integer.parseInt(tablaA[f][c]);
					int n2 = Integer.parseInt(tablaB[f][c]);
					tablaC[f][c] = Integer.toString(n1 + n2);

				} catch (Exception ex) {
					tablaC[f][c] = "0";

				}

			}

		}

		for (int f = 0; f < tablaC.length; f++) {
			// columnas
			for (int c = 0; c < tablaC[f].length; c++) {
				System.out.print(tablaC[f][c]);
				
			}

			System.out.println("  ");
		}

	}// end main
} // end
