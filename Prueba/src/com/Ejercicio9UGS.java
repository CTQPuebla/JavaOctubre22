package com;

import java.util.Scanner;

public class Ejercicio9UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int d;
		System.out.print("Insertar un numero: ");
		d = Integer.parseInt(entrada.next());
		switch (d) {
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
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
	}
}
