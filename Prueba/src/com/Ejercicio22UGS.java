package com;

import java.util.Scanner;

public class Ejercicio22UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int l1, l2, max, min;
		System.out.print("Limite 1: ");
		l1 = Integer.parseInt(entrada.next());
		System.out.print("Limite 2: ");
		l2 = Integer.parseInt(entrada.next());
		
		if (l1>l2) {
			max=l1;
			min=l2;
		} else {
			max=l2;
			min=l1;
		}
		 for (int i = min; i <= max; i++) {
			System.out.print(i+" ");
		}
	}
}
