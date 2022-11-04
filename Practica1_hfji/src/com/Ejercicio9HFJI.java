/* Hernandez Falcon Jorge Ivan
Realiza un programa que pida el día de la semana (del 1 al 7) 
y escriba el día correspondiente. 
Si introducimos otro número nos da un error.
*/

package com;

import java.util.Scanner;

public class Ejercicio9HFJI {
	public static  void main (String [] args) {

	Scanner sc = new Scanner(System.in);
	int dia;
	System.out.println("Digite el número del día de la semana, sea lunes el día 1: ");
	dia = sc.nextInt();
	switch(dia) {
	
	case 1:
		System.out.println("El día es lunes");
		break;
	case 2:
		System.out.println("El día es martes");
		break;
	case 3:
		System.out.println("El día es miércoles");
		break;
	case 4:
		System.out.println("El día es jueves");
		break;
	case 5:
		System.out.println("El día es viernes");
		break;
	case 6:
		System.out.println("El día es sábado");
		break;
	case 7:
		System.out.println("El día es domingo");
		break;
		
		default: System.out.println("Error!! Intente de nuevo");
	}
  }
}

