package com;

import java.util.Scanner;

public class Ejercicio14DYMM {

	public static void main(String[] args) {
		
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas 
		//y $20 por cada hora extra.
		
		int horas;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresar horas trabajadas");
		horas = lector.nextInt();
		
		if (horas <= 40) { 
			System.out.println("Salario calculado: " + horas * 16);
		} else if (horas>40) {
			System.out.println("Salario calculado: " + ((40 * 16) + ((horas - 40) * 20)));
		}
	}
}
