package com;

import java.util.Scanner;

public class Ejercicio4DYMM {

	public static void main(String[] args) {
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		String a;
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresa un texto");
		a = lector.nextLine();
		
		if (a.equals(a.toUpperCase())) {
			System.out.println("Hay una letra may�scula");
		} else if (a.equals(a.toLowerCase())){
			System.out.println("Sin letras may�sculas");
		}else { 
			System.out.println("Hay una letra may�scula");
		}
		
		
	}
	
}
