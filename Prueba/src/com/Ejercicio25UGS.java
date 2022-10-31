package com;

import java.util.Scanner;

public class Ejercicio25UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ancho, alto;
		System.out.print("Inserte ancho: ");
		ancho = Integer.parseInt(entrada.next());
		System.out.print("Inserte alto: ");
		alto = Integer.parseInt(entrada.next());
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
