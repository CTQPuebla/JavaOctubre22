package com;

import java.util.Scanner;

public class Ejercicio4ARNR {
	public static void main(String[] args) {
		
		String letra = "s";
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresa una letra");
		letra = lector.nextLine();
		
	if(letra.equals(letra.toUpperCase())) {
		System.out.println("si");
	}else {
		System.out.println("no");
	}

		
	}

}
