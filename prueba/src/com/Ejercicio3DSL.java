package com;

import java.util.Scanner;


public class Ejercicio3DSL {
	public static void main(String[]args) {

		    Scanner scanner = new Scanner (System.in);
		    int numerador;
		    int denominador;
		// Solicitud de datos al usuario
		    
		    System.out.print("Introduce el primer n�mero: ");
		    numerador = scanner.nextInt();
		    System.out.print("Introduce el segundo n�mero: ");
		    denominador = scanner.nextInt();
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (denominador != 0){
		        System.out.println((double)numerador/(double)denominador);
		    }else {
		        System.out.println("El segundo n�mero introducido es 0. ");
		    }  
			
		}
	}
		
	


