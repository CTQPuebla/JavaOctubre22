package com;

import java.util.Scanner;

public class Ejercicio4F {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);

		String letra="";
		System.out.println("ingresa una letra: ");
		letra= entrada.nextLine();
		if(letra.equals(letra.toUpperCase())) {//convierte de minuscula a mayuscula 
			System.out.println("la letra ingresada es MAYUSCULA");
		}else {
			System.out.println("la letra ingresada es MINUSCULA");
			
		}
		
		
	}
}
