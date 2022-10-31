package com;

import java.util.Scanner;

public class Ejercicio1JIDH {
	
	public static void main(String[] args) {
		
		int p;
		int x;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa primer valor: ");
		p = lector.nextInt(); //30\n
		lector.nextLine();
		System.out.println("Ingresa segundo valor: ");
		x = lector.nextInt();   //hola\n
		
		if(p > x) {
			System.out.println("El primer valor es mayor");
		} else if(x > p){
			System.out.println("El segundo valor es mayor");
		} else {
			System.out.println("Los valores son iguales");
		}
	
		
	}

}
