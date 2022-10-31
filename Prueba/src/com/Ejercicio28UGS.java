package com;

import java.util.Scanner;

public class Ejercicio28UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Tipo de Variable[][] nombre variable = new Tipo de Variable[Fila][Columna]
		//[][]=dos dimensiones
		Integer[][] arreglo = new Integer[2][3];
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.println("Escriba el numero para agregar en el espacio ["+i+"]["+j+"]: ");
				arreglo[i][j]=entrada.nextInt();
			}
		}
		System.out.println("el arrglo es:");
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.print(arreglo[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
