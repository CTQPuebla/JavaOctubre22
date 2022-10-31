package com;

import java.util.Scanner;

public class Ejercicio24cba {
	public static void main(String[] args) {
		
		//Programa que lea 20 números e indique si son positivos o 
		//negativos y pares o impares y ademas muestre la sumatoria 
		//de los positivos y sumatoria de los impares.
		
		int contador =0;
		int num =0;
		int sump =0;
		int sumi =0;
		
		Scanner lector = new Scanner(System.in);
		while (contador <20) {
			System.out.println("ingresar numero");
			num=lector.nextInt();
			
			if (num<0) {
				System.out.println("Negativo");
			}else {
				System.out.println("Positivo");
				sump=sump+num;
			}
			if (num%2 ==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es inpar");
				sumi=sumi+num;
			}
			contador++;
		}
		System.out.println(sump);
		System.out.println(sumi);
		
	}//fin main

}//fin
