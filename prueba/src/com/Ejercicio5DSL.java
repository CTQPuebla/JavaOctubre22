package com;

import java.util.Scanner;

public class Ejercicio5DSL {
	public static void main(String[]args) {
		
		int nota;
		int edad;
		String sexo;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingresa la nota ");
		nota=scanner.nextInt();
		System.out.println("Ingresa la edad ");
		edad =scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el sexo ");
		sexo=scanner.nextLine();		
		
		if(nota>=5 && edad>=18 && sexo.equals("M")) {
		
		System.out.println("posible");
		
		}
		else if(nota>=5 && edad>=18 && sexo.equals("F")) {
			System.out.println("aceptado");
	}
		else {
			System.out.println("no aceptado");
			
		}
	}
}