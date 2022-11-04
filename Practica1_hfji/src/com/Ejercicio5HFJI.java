/*  Jorge Ivan Hernandez Falcon
*Realiza un programa que calcule la aceptaci�n de una 
*solicitud en base a los siguientes par�metros: edad, nota y sexo
* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA
*/
package com;

import java.util.Scanner;

public class Ejercicio5HFJI {
	public static void main (String[] args) {
		
		// Inicio del programa y declaraci�n de variables:
		
		    Scanner scanner = new Scanner(System.in);
		    int nota;
		    int edad;
		    String sexo;
		// Solicitud de datos al usuario
		    System.out.println("Este programa nos calcula la aceptaci�n de una solicitud"
		        + " en base a los siguientes par�metros:");
		    System.out.print("Edad: ");
		    edad = scanner.nextInt();
		    System.out.print("Nota: ");
		    nota = scanner.nextInt(); scanner.nextLine();
		    System.out.print("Sexo (M o F): ");
		    sexo = scanner.nextLine();
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("El valor de sexo introducido es incorrecto.\n"
		          + "por favor, reenv�e el formulario.");
		    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		    }else {
		        System.out.println("NO ACEPTADA");
		    }
		}
		  
	}
