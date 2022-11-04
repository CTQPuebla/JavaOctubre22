/*
* Jorge Ivan Hernandez Falcon
*Crea un programa que pida al usuario dos números 
*y muestre el resultado de su división. 
*Si el segundo número es 0, debe mostrar un mensaje de error.
*/
package com;

import java.util.Scanner;

public class Ejercicio3HFJI {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numerador;
		int denominador;
	//Solicitud de datos al usuario
		
		System.out.print("Introduce el primer numero");
		numerador = scanner.nextInt();
		System.out.print("Introduce el segundo numero");
		denominador = scanner.nextInt();
		
	//Realizamos calculos y mostramos en pantalla
		if (denominador !=0) {
			System.out.println((double)numerador/(double)denominador);
		}else {
			System.out.println("El segundo numero introducido es 0 es un ERROR.");
			
		}
		
	}

}
