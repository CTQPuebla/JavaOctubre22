package com;

import java.util.Scanner;

public class Ejercicio8_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que numero cayo en el dado");
		dado = entrada.nextInt();
		
		if (dado == 1) {
			System.out.println("la cara opuesta es el seis");
		}else if(dado == 2) {
			System.out.println("la cara opuesta es cinco");
		}else if(dado == 3) {
			System.out.println("la cara opuesta es cuatro");
		}else if(dado == 4) {
			System.out.println("la cara opuesta es tres");
		}else if(dado == 5) {
			System.out.println("la cara opuesta es dos");
		}else if(dado == 5) {
			System.out.println("la cara opuesta es uno");
		}else {
			System.out.println("ERROR: numero incorrecto");
		}

	}

}
