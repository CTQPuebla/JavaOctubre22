/* Hernandez Falcon Jorge Ivan
2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración 
deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???;
*/

package com;

import java.util.Scanner;

public class Ejerciciociclico2HFJI {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el tope");
		int tope = scanner.nextInt();
		int contador = 1;
		
		//Solicitar datos al usuario
		while (contador <=tope) {
			System.out.println(23+"x"+contador+"="+23*
					contador);
			contador ++;
			
		}
/*
      	Se puede realizar de esta manera tambien	    
		        for (int x = 1; x <= 95; x++) {
		            String formato = "%d x %d = %d";
		            String linea = String.format(formato, numerotabla, x, numerotabla * x);
		            System.out.println(linea);
*/		            
		}
    }
	
