package com;

import java.util.Scanner;

public class Ejercicio16DYMM {

	public static void main(String[] args) {
		
		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???;
		
		int a, b, c=0;
		
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresar primer valor");
		a = lector.nextInt();
		
		System.out.println("Ingresar segundo valor");
		b = lector.nextInt();
		
		 while (c<=b) {
			System.out.println(a + " * " + c + " = " + (a*c));
			c++;		

		}
		
		
	}
	
}
