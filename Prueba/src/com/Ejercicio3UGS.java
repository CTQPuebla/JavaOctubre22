package com;

import java.util.Scanner;

public class Ejercicio3UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float x, y, r;
		System.out.println("Escriba dos numeros");
		x = Float.parseFloat(entrada.next());
		y = Float.parseFloat(entrada.next());
		
		if (y==0) {
			System.out.println("Escriba otros numeros con el segundo distinto de 0");
			x = Float.parseFloat(entrada.next());
			y = Float.parseFloat(entrada.next());
		}
		r = x/y;
		System.out.println("Su división es: "+r);
		
	}
}
