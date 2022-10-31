package com;

import java.util.Scanner;

public class Ejercicio25cba {
	public static void main(String[] args) {
		
		//Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto.
		
		int largo;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("introducir tamaño de tabla");
		largo =lector.nextInt();
		
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < largo; j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		
	}//fin main

}//fin
