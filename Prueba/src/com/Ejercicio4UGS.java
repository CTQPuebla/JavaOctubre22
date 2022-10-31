package com;

import java.util.Scanner;

public class Ejercicio4UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char s;
		System.out.println("Escriba una letra");
		s = entrada.next().charAt(0);
		if (Character.isDigit(s)) {
			System.out.println("Escriba una letra, no un numero");
			s = entrada.next().charAt(0);
		}
		if (Character.isUpperCase(s)) {
			System.out.println(s+" es mayuscula");
		} else {
			System.out.println(s+ " es minuscula");
		}
		
	}
}
