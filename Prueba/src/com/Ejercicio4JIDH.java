package com;

import java.util.Scanner;

public class Ejercicio4JIDH {
	
	public static void main(String[] args) {
		
		char x;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa un texto: ");
		x = lector.next().charAt(0);
		
		
		if(Character.isUpperCase(x)) {
			System.out.println("Es May�scula");
		} else {
			System.out.println("Es min�scula");
		}
		
		
	}

}
