package com;

import java.util.Scanner;

public class Ejercicio4_BMNA {

	public static void main(String[] args) {

		char x;
		Scanner Caracter = new Scanner (System.in);
		System.out.println("Ingrese el caracter: ");
		x = Caracter.next().charAt(0);
		
		if (Character.isUpperCase(x)) {
			
			System.out.println("La letra es mayuscula");
		}else {
			
			System.out.println("La letra es minuscula");
		}
		
	}

}
