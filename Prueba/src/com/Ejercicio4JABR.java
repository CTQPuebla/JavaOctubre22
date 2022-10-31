package com;

import java.util.Scanner;

public class Ejercicio4JABR {

	public static void main(String[] args) {
		
		String letra="";
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingresa una letra");
		letra=lector.nextLine();
		if (letra.equals(letra.toUpperCase())) {
			System.out.println("Es mayúscula");
		}else {
			System.out.println("Es minúscula");
		}

	}

}
