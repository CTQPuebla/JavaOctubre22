package com;

import java.util.Scanner;

public class Arreglo3D {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[][] A = new String[3][5];
		String[][] B = new String[3][5];
		String[][] C = new String[3][5];

		System.out.println("ingresar caracteresa para el arreglo  A");

		for (int filas = 0; filas < A.length; filas++) {     //YENADO DE LA MATRZI A
			for (int columnas = 0; columnas < A[filas].length; columnas++) {
				System.out.print("ingresa datos: ");
				A[filas][columnas] = entrada.nextLine();
				// System.out.println("matris"+A[filas][columnas]);
				// System.out.printf(A[filas][columnas]);

			}
		}
		System.out.println("ingresar caracteres para el arreglo B");
		for (int filas = 0; filas < B.length; filas++) {  //LLENADO DE LA MATRIZ B
			for (int columnas = 0; columnas < B[filas].length; columnas++) {
				System.out.print("ingresa datos: ");
				B[filas][columnas] = entrada.nextLine();
			}
		}
		
		
		for (int filas = 0; filas < C.length; filas++) {
			for (int columnas = 0; columnas < C[filas].length; columnas++) {
				try {//CONVERCION DE STRING A INT PARA SUMAR LOS NUMEROS

					int numeroA = Integer.parseInt(A[filas][columnas]);
					int numeroB = Integer.parseInt(B[filas][columnas]);
					int suma = numeroA + numeroB;
					C[filas][columnas] = Integer.toString(suma );
					
					// System.out.println("ARREGLO LLERNO"+C[filas][columnas] );
				} catch (Exception ex) {
					C[filas][columnas] = "0";

				}
			}
		}
		//imprim el arreglo C
		
		for (int filas = 0; filas < C.length; filas++) {
			for (int columnas = 0; columnas < C[filas].length; columnas++) {
				
					 System.out.print(C[filas][columnas]);
				
			}
			
			System.out.println("");
		
		}
	}
}