/*
 *Jorge Ivan Hernandez Falcon
 *Realiza un programa que pida un número 
 *por teclado y nos indique si es par o impar.
*/
package com;

import java.util.Scanner;

public class Ejercicio2HFJI {
	public static void main (String[] args) {
	
Scanner scanner = new Scanner(System.in);
int numero;
//Solicitud de datos al usuario
System.out.println("Ingresa un numero");
numero = scanner.nextInt();
/*valor ingresador del usuario que pueda ser dividido entre 2 y que sea
diferente de 0*/
if (numero % 2 == 0) {
	System.out.println("El numero, " + numero + "es par.");
	
//En dado caso de no cumplir la condicion el numero es impar
}else {
	System.out.println("El numero " + numero + "es impar,");
      }
		
	}

}
