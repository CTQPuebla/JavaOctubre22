package com;

import java.util.Scanner;

public class EjercicioCiclico10MARB {
//leer 20 números y entregue la suma de los números pares y por otro lado entregue la suma de los números impares que se ingresaron.
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int sumaPares = 0, sumaImpares = 0;
		for (int i = 1; i <= 20; i++) {
			System.out.println("\nEntrada " + i + "/20");
			System.out.print("Ingrese numero: ");
			int numero = Integer.parseInt(teclado.nextLine());
			if (numero % 2 == 0)
				sumaPares += numero;
			else
				sumaImpares += numero;
		}
		System.out.println("\nSuma de pares: " + sumaPares);
		System.out.println("Suma de impares: " + sumaImpares);
	}
}