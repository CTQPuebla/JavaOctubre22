package com;

import java.util.Scanner;

public class Ejercicio25_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int matriz[][], filas, columnas;
		System.out.println("Digite el numero de columnas");
		columnas = entrada.nextInt();
		System.out.println("Digite el numero de filas");
		filas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}

	}

}
