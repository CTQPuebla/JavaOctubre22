package com;

import java.util.Scanner;

public class Ejercicio11UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double p,c;
		int z;
		System.out.print("1. America del Norte\n"
				+ "2. America Central\n"
				+ "3. America del Sur\n"
				+ "4. Europa\n"
				+ "5. Asia\n Digite el número del lugar a enviar: ");
		z = Integer.parseInt(entrada.next());
		if (z<1 || z>5) {
			System.out.println("No hay alcance en esa zona");
		} else {
			System.out.print("Indique el peso en kilos del paquete a enviar: ");
			p = Double.parseDouble(entrada.next());
			if (p>5) {
				System.out.println("El paquete excede el peso permitido para envio");
			} else {
				switch (z) {
				case 1:
					c=p*24;
					System.out.println("El costo de envio es: "+c+" euros");
					break;
				case 2:
					c=p*20;
					System.out.println("El costo de envio es: "+c+" euros");
					break;
				case 3:
					c=p*21;
					System.out.println("El costo de envio es: "+c+" euros");
					break;
				case 4:
					c=p*10;
					System.out.println("El costo de envio es: "+c+" euros");
					break;
				case 5:
					c=p*18;
					System.out.println("El costo de envio es: "+c+" euros");
					break;
				}
			}
		}
	}
}
