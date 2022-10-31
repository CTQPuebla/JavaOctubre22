package com;

import java.util.Scanner;

public class Ejercicio25DSL {
public static void main(String[]args) {
	
	int largo;
	Scanner lector = new Scanner(System.in);
	System.out.println("Introducir tamaño de tabla ");
	largo= lector.nextInt();
	for(int j=0; j<largo; j++) {
	
		for(int i=0; i<largo; i++) {
			System.out.print("*" + "");
		}
		System.out.println("");
}
}
}
