package com;

import java.util.Scanner;

public class Ejercicio8YHZ {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el resultado del dato: ");
		numero = lector.nextInt();
		
		if(numero == 1) {
			System.out.println("SEIS");
		}else if (numero ==2) {
			System.out.println("CINCO");
		}else if (numero == 3) {
			System.out.println("CUATRO");
		}else if (numero == 4) {
			System.out.println("TRES");
		}else if(numero == 5) {
			System.out.println("DOS");
		}else if (numero == 6) {
			System.out.println("UNO");
		}else {
			System.out.println("ERROR NUMERO INCORRECTO");
		}
		
	}

}
