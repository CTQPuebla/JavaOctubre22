package com;

import java.util.Scanner;

public class EstructuraControl {
	public static void main(String[] args) {
		//leer valores desde el teclado
		
		int p = 20;
		String x;
		Scanner lector = new Scanner (System.in);
		System.out.println("ingresa un valor");
		p = p + lector.nextInt();
		lector.nextLine();
		System.out.println("ingresa un texto");
		x = lector.nextLine();
		System.out.println("valor" + p);
		System.out.println("valor" + x);
		
	}

}
