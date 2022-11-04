package com;

import java.util.Scanner;

public class EjercicioCiclico11MARB {
//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
	//Ejemplo: 8 x 8
public static void main(String[] args) {
	
		int largo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el tamaño que dese su tabla: ");
		largo= teclado.nextInt();
		for(int j=0; j<largo; j++) {
			
			for(int i=0; i<largo; i++) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		}
	}
}