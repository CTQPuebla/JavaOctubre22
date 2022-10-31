package com;

import java.util.Scanner;

public class Ejercicio4_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame una letra");
		letra = entrada.next().charAt(0);
		
		if(Character.isUpperCase(letra)) {
			
			System.out.println("Es una mayuscula la letra ingresada");
			
		} else {
			
			System.out.println("Es una minuscula la letra ingresada");
		}

	}

}
