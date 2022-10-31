package com;

import java.util.Scanner;

public class Ejercicio3MARB {
	//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
	
	public static void main(String[] args) {
		int numerador;
		int denominador;
		Scanner lector = new Scanner (System.in);
		//solicitud de datos al usuario
		System.out.println("introduce el primer numero");
		numerador = lector.nextInt();
		System.out.println("introduce el denominador");
		denominador = lector.nextInt();
		
		//realizamos calculos y mostramos en pantalla
		if(denominador !=0) {
			System.out.println((double) numerador/(double) denominador);
		}else {
			System.out.println("el segundo numero introducido es 0 hay error");
			
		}
		
	}

}
