/* Hernandez Falcon Jorge Ivan
Realiza un programa que pida el d�a de la semana (del 1 al 7) 
y escriba el d�a correspondiente. 
Si introducimos otro n�mero nos da un error.
*/

package com;

import java.util.Scanner;

public class Ejercicio9HFJI {
	public static  void main (String [] args) {

	Scanner sc = new Scanner(System.in);
	int dia;
	System.out.println("Digite el n�mero del d�a de la semana, sea lunes el d�a 1: ");
	dia = sc.nextInt();
	switch(dia) {
	
	case 1:
		System.out.println("El d�a es lunes");
		break;
	case 2:
		System.out.println("El d�a es martes");
		break;
	case 3:
		System.out.println("El d�a es mi�rcoles");
		break;
	case 4:
		System.out.println("El d�a es jueves");
		break;
	case 5:
		System.out.println("El d�a es viernes");
		break;
	case 6:
		System.out.println("El d�a es s�bado");
		break;
	case 7:
		System.out.println("El d�a es domingo");
		break;
		
		default: System.out.println("Error!! Intente de nuevo");
	}
  }
}

