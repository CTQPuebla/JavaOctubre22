package com;

import java.util.Scanner;

public class Ejercicio14YHZ {

	public static void main(String[] args) {
		int horas;
		int salario;
		int horaex;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de horas trabajadas en la semana: ");
		horas = lector.nextInt();
		
		if (horas > 40) {
			horaex = horas -40;
			salario = (horaex *20) + 640;
			System.out.println("El salario es de: $"+salario);
			
		}else {
			salario = horas *16;
			System.out.println("El salario es de: $"+salario);
		}

	}

}
