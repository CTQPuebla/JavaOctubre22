/* Hernandez Falcon Jorge Ivan
Realiza un programa que pida un n�mero entero entre uno 
y doce e imprima el n�mero de d�as que tiene el mes correspondiente.
*/
package com;

import java.util.Scanner;

public class Ejercicio10HFJI {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	int mes;
	String bisiesto;
	System.out.println("Digite el n�mero del mes: ");
	mes = sc.nextInt();
	sc.nextLine();
	switch(mes) {
	
	case 1:
		mes = 31;
		System.out.println("Enero tiene: "+mes +" d�as");
		break;
	case 2:
		System.out.println("Es a�o bisiesto en Febrero? (y/n)");
		bisiesto = sc.nextLine();
		if (bisiesto.equals("y")) {
			mes = 29;
			System.out.println("Febrero tiene: "+mes +" d�as");	
		} else if (bisiesto.equals("n")) {
			mes = 28;
			System.out.println("Febrero tiene: "+mes +" d�as");	
		}
		else {
			System.out.println("Error, ingresa 'y' o 'n'");	
		}
		
		break;
	case 3:
		mes = 31;
		System.out.println("Marzo tiene: "+mes +" d�as");
		
		break;
	case 4:
		mes = 30;
		System.out.println("Abril tiene: "+mes +" d�as");
		break;
	case 5:
		mes = 31;
		System.out.println("Mayo tiene: "+mes +" d�as");
		break;
	case 6:
		mes = 30;
		System.out.println("Junio tiene: "+mes +" d�as");
		break;
	case 7:
		mes = 31;
		System.out.println("Julio tiene: "+mes +" d�as");
		break;
	case 8:
		mes = 31;
		System.out.println("Agosto tiene: "+mes +" d�as");
		break;
	case 9:
		mes = 30;
		System.out.println("Septiembre tiene: "+mes +" d�as");
		break;
	case 10:
		mes = 31;
		System.out.println("Octubre tiene: "+mes +" d�as");
		break;
	case 11:
		mes = 30;
		System.out.println("Noviembre tiene: "+mes +" d�as");
		break;
	case 12:
		mes = 31;
		System.out.println("Diciembre tiene: "+mes +" d�as");
		break;
		
		default: System.out.println("Error!! Intente de nuevo");
	    }
     }
}
