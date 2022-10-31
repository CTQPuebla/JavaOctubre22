package com;

import java.util.Scanner;

public class Ejercicio2JABR {

	public static void main(String[] args) {
		
		int numero;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingresa un valor");
		numero=lector.nextInt();
		if (numero%2==0) {
			System.out.println("Sí es par");
		}else {
			System.out.println("No es par");
		}
		
	}

}
