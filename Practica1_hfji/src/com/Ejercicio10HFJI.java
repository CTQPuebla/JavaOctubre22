/* Hernandez Falcon Jorge Ivan
Realiza un programa que pida un número entero entre uno 
y doce e imprima el número de días que tiene el mes correspondiente.
*/
package com;

import java.util.Scanner;

public class Ejercicio10HFJI {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	int mes;
	String bisiesto;
	System.out.println("Digite el número del mes: ");
	mes = sc.nextInt();
	sc.nextLine();
	switch(mes) {
	
	case 1:
		mes = 31;
		System.out.println("Enero tiene: "+mes +" días");
		break;
	case 2:
		System.out.println("Es año bisiesto en Febrero? (y/n)");
		bisiesto = sc.nextLine();
		if (bisiesto.equals("y")) {
			mes = 29;
			System.out.println("Febrero tiene: "+mes +" días");	
		} else if (bisiesto.equals("n")) {
			mes = 28;
			System.out.println("Febrero tiene: "+mes +" días");	
		}
		else {
			System.out.println("Error, ingresa 'y' o 'n'");	
		}
		
		break;
	case 3:
		mes = 31;
		System.out.println("Marzo tiene: "+mes +" días");
		
		break;
	case 4:
		mes = 30;
		System.out.println("Abril tiene: "+mes +" días");
		break;
	case 5:
		mes = 31;
		System.out.println("Mayo tiene: "+mes +" días");
		break;
	case 6:
		mes = 30;
		System.out.println("Junio tiene: "+mes +" días");
		break;
	case 7:
		mes = 31;
		System.out.println("Julio tiene: "+mes +" días");
		break;
	case 8:
		mes = 31;
		System.out.println("Agosto tiene: "+mes +" días");
		break;
	case 9:
		mes = 30;
		System.out.println("Septiembre tiene: "+mes +" días");
		break;
	case 10:
		mes = 31;
		System.out.println("Octubre tiene: "+mes +" días");
		break;
	case 11:
		mes = 30;
		System.out.println("Noviembre tiene: "+mes +" días");
		break;
	case 12:
		mes = 31;
		System.out.println("Diciembre tiene: "+mes +" días");
		break;
		
		default: System.out.println("Error!! Intente de nuevo");
	    }
     }
}
