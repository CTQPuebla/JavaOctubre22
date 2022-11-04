package com;

import java.util.Scanner;

public class EjercicioCiclico2MARB {
	public static void main(String[] args) {
		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración
		//deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???;
		
		Scanner lector = new Scanner(System.in);
		
		int numero;
		int tope;
		int contador = 1;
		
		System.out.println("Introduce el numero que deseas sacar su tabla: ");
		numero= lector.nextInt();
		
		System.out.println("introduce hasta que numero deseas saber su multiplicacion: ");
		tope= lector.nextInt();
		
		while (contador<=tope) {
			System.out.println(numero+"x"+contador+"="+numero*contador);
			contador++;
			
		}
		
		
	}

}
