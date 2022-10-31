package com;

import java.util.Scanner;

public class Ejercicio26UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double suma=0, prom=0;
		int c=0, edad;
		while (prom<=25) {
			System.out.print("Inserte una edad: ");
			edad = Integer.parseInt(entrada.next());
			c++;
			suma+=edad;
			prom=suma/c;
			
		}
		System.out.println("El promedio de las edades es: "+prom);
	}
}
