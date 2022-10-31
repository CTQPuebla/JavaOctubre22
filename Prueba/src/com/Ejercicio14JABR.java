package com;

import java.util.Scanner;

public class Ejercicio14JABR {

	public static void main(String[] args) {
		
		int numHora;
		int pHora=16;
		int hExtra=20;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número de horas a calcular");
		numHora=lector.nextInt();
		if (numHora<=40) {
			System.out.println("El total por " + numHora + " es " + (numHora*pHora));
		}else if (numHora>40) {
			System.out.println("El total por " + numHora + " es " + ((40*pHora)+((numHora-40)*hExtra)));
			
		}
			
		

	}

}
