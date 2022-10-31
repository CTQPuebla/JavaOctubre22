package com;

import java.util.Scanner;

public class Ejercicio10JABR {

	public static void main(String[] args) {
		
		int mes;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número del mes 1 a 12");
		mes=lector.nextInt();
		switch (mes) {
		case 1:
			System.out.println("31 días");
			break;
		case 2:
			System.out.println("28 días");
			break;
		case 3:
			System.out.println("31 días");
			break;
		case 4:
			System.out.println("30 días");
			break;
		case 5:
			System.out.println("31 días");
			break;
		case 6:
			System.out.println("30 días");
			break;
		case 7:
			System.out.println("31 días");
			break;
		case 8:
			System.out.println("31 días");
			break;
		case 9:
			System.out.println("30 días");
			break;
		case 10:
			System.out.println("31 días");
			break;
		case 11:
			System.out.println("30 días");
			break;
		case 12:
			System.out.println("31 días");
			break;
		}
		if (mes>12) {
			System.out.println("Error de mes");
		}else if (mes<1) {
			System.out.println("Error de mes");
		}
	
	}

}
