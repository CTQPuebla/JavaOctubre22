package com;

import java.util.Scanner;

public class Ejercicio24UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[20];
		int sumapos=0, sumaimp=0;
		for (int i = 0; i < 20; i++) {
			System.out.print((i+1)+". Escriba un numero: ");
			numeros[i]= Integer.parseInt(entrada.next());
		}
		System.out.print("\nLos positivos son: ");
		for (int i = 0; i < 20; i++) {
			if (numeros[i]>=0) {
				sumapos+=numeros[i];
				System.out.print(numeros[i]+" ");
			}
		}
		System.out.print("\nLos negativos son: ");
		for (int i = 0; i < 20; i++) {
			if (numeros[i]<0) {
				System.out.print(numeros[i]+" ");
			}
		}
		System.out.print("\nLos pares son: ");
		for (int i = 0; i < 20; i++) {
			if ((numeros[i]%2)==0) {
				System.out.print(numeros[i]+" ");
			}
		}
		System.out.print("\nLos impares son: ");
		for (int i = 0; i < 20; i++) {
			if ((numeros[i]%2)!=0) {
				sumaimp+=numeros[i];
				System.out.print(numeros[i]+" ");
			}
		}
		
		System.out.println("\nLa suma de los positivos es: "+sumapos);
		System.out.println("La suma de los impares es: "+sumaimp);
	}
}
