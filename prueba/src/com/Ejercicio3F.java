package com;

import java.util.Scanner;

public class Ejercicio3F {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float valor1, valor2,resultado;
		System.out.print("INGRESE UN VALOR: ");
		valor1=entrada.nextFloat();
		System.out.print("INGRESE UN VALOR: ");
		valor2=entrada.nextFloat();
		if(valor2 == 0) {
			System.out.println("ERROR");
				
		}else {
			resultado=valor1/valor2;
			System.out.println("la divicion es: "+ resultado);
			
		}
	}

}
