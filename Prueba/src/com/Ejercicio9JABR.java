package com;

import java.util.Scanner;

public class Ejercicio9JABR {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número de día de la semana 1 a 7");
		dia=lector.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;	
		}
		if (dia<1) {
			System.out.println("Error de día");
		}else if (dia>7) {
			System.out.println("Error de día");
		}

	}

}
