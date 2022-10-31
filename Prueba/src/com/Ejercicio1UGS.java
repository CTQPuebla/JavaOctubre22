package com;

import java.util.Scanner;

public class Ejercicio1UGS {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int x, y;
		System.out.println("Dijita dos números");
		x = Integer.parseInt(entrada.next());
		y = Integer.parseInt(entrada.next());
		
		if (x<y) {
			System.out.println(x+" es menor que "+y);
		} else if (x>y) {
			System.out.println(x+" es mayor que "+y);
		} else {
			System.out.println(x+" es igual que "+y);
		}
	}
}
