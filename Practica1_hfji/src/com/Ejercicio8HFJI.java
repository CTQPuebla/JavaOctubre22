/* Hernandez Falcon Jorge Ivan
Realiza un programa que pida por teclado el resultado (dato entero)
obtenido al lanzar un dado de seis caras y muestre por 
pantalla el número en letras (dato cadena) de la cara opuesta 
al resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están 
los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
se mostrará el mensaje: “ERROR: número incorrecto”.
*/

package com;

import java.util.Scanner;

public class Ejercicio8HFJI {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numdado, caraopuesta;
		System.out.println("Digite el número de la cara del dado: ");
		numdado = sc.nextInt();
		switch(numdado) {
		
		case 1:
			caraopuesta = 6;
			System.out.println("La cara opuesta a la cara 1 es: " + caraopuesta);
			break;
		case 2:
			caraopuesta = 5;
			System.out.println("La cara opuesta a la cara 2 es: " + caraopuesta);
			break;
		case 3:
			caraopuesta = 4;
			System.out.println("La cara opuesta a la cara 3 es: " + caraopuesta);
			break;
		case 4:
			caraopuesta = 3;
			System.out.println("La cara opuesta a la cara 4 es: " + caraopuesta);
			break;
		case 5:
			caraopuesta = 2;
			System.out.println("La cara opuesta a la cara 5 es: " + caraopuesta);
			break;
		case 6:
			caraopuesta = 1;
			System.out.println("La cara opuesta a la cara 6 es: " + caraopuesta);
			break;
			
			default: System.out.println("“ERROR: número incorrecto”");
		}
		
	}

}
