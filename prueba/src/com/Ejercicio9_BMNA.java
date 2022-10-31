package com;

import java.util.Scanner;

public class Ejercicio9_BMNA {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner NumeroDia = new Scanner (System.in);
		
		System.out.println("Digite el numero de día de la semana: ");
		numero = NumeroDia.nextInt();
		
		switch (numero) {
		
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
			System.out.println("ERROR: número incorrecto");
		
		
		}

	}

}
