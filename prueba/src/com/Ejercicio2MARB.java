package com;

import java.util.Scanner;

public class Ejercicio2MARB {

	//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
	public static void main(String[] args) {
		int numero;
		Scanner lector = new Scanner (System.in);
		
		//solicitud de datos al usuario
		
		System.out.println("introduce el numero");
		numero = lector.nextInt();
		
		//valor ingresador del usuario que pueda ser dividido entre 2 y que sea diferente de 0
		if(numero % 2 ==0) {
			System.out.println("el numero" + numero + "es par");
			//en dado caso de no cumplir con las condiciones el numero es impar
		}else {
			System.out.println("el numero" + numero + "es impar");
			
		}
	}
}
