package com;

import java.util.Scanner;

public class Ejercicio2_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite un numero para saber si es par o impar");
		numero= entrada.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("El numero "+ numero+ " es par");
		}else {
			System.out.println("El numero "+ numero+ " es impar");
		}

	}

}
