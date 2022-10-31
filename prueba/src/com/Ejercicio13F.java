package com;

import java.util.Scanner;

public class Ejercicio13F {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int donacion, total;
		System.out.print("inresa la cantidad de donacion: ");
		donacion = entrada.nextInt();
		entrada.nextLine();

		if (donacion >= 10000) {
			total = (30 * donacion) / 100;
			System.out.println("Dinero donado anual  a centro de salud:" + total);
			total = (50 * donacion) / 100;
			System.out.println("Dinero donado anual a comedor de niños:" + total);
			total = (20 * donacion) / 100;
			System.out.println("lo que se invierte anual en la volsa es :" + total);
		} else {
			total = (25 * donacion) / 100;
			System.out.println("Dinero donado anual a centro de salud:" + total);
			total = (60 * donacion) / 100;
			System.out.println("Dinero donado anual a comedor de niños:" + total);
			total = (15 * donacion) / 100;
			System.out.println("lo que se invierte anual en la volsa es :" + total);

		}

	}

}
