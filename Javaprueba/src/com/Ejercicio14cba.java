package com;

import java.util.Scanner;

public class Ejercicio14cba {
	
	public static void main(String[] args) {
		
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga $16 por hora. 
		//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas 
		//y $20 por cada hora extra.
		
		int horas;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar horas trabajada");
		horas = lector.nextInt();
		
		
		
		if (horas <= 40) {
			System.out.println(horas * 16 + " $");
		}else {
			System.out.println((horas - 40) * 20 + (40 * 16));
		}
		
		
	}//fin main

}//fin
