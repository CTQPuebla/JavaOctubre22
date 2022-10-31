package com;

import java.util.Scanner;

public class Ejercicio16ARNR {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("tope");
	System.out.println("numero");
	
	int tope = sc.nextLine();
	int numero = sc.nextLine();
	int contador = 1;
	
	while(contador<=tope) {
		System.out.println(numero+ "x"+ contador "=" );
	}
}
}
