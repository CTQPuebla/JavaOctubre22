package com;

import java.util.Scanner;

public class Ejercicio5_JCRR {
	public static void main(String[] args) {
		
		int nota, edad;
		String sexo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la nota obtenida de 0 a 10");
		nota = entrada.nextInt();
		System.out.println("Digite su edad");
		edad = entrada.nextInt();
		System.out.println("Digite la letra de acuerdo a su sexo 'F' femenino y 'M' Masculino");
		entrada.nextLine();
		sexo = entrada.nextLine();
		if (nota>=5 && edad>=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Aceptada");
		} else if(nota>=5 && edad>=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Posible");
		}else {
			System.out.println("No Aceptada");
		}
	}

}
