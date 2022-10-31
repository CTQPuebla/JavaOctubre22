package com;

import java.util.Scanner;

public class Ejercicio2UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y;
		System.out.println("Escriba un número");
		x = Integer.parseInt(entrada.next());
		y = x%2;
		if (y==0) {
			System.out.println(x+" es par");
		} else {
			System.out.println(x+" es impar");
		}
		
	}
}
