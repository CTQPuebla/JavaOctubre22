package com;

import java.util.Scanner;

public class Ejercicio10YHZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de mes: ");
		mes = lector.nextInt();
		
		switch(mes) {
		case 1: 
			System.out.println("31 DIAS");
			break;
		case 2:
			System.out.println("28 DIAS");
			break;
		case 3:
			System.out.println("31 DIAS");
			break;
		case 4:
			System.out.println("30 DIAS");
			break;
		case 5:
			System.out.println("31 DIAS");
			break;
		case 6:
			System.out.println("30 DIAS");
			break;
		case 7:
			System.out.println("31 DIAS");
			break;
		case 8:
			System.out.println("31 DIAS");
			break;
		case 9:
			System.out.println("30 DIAS");
			break;
		case 10:
			System.out.println("31 DIAS");
			break;
		case 11:
			System.out.println("30 DIAS");
			break;
		case 12:
			System.out.println("31 DIAS");
			break;
		default:
			System.out.println("ERROR");
		}

	}

}
