package com;

import java.util.Scanner;

public class Ejercicio24_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int [] numeros;
		numeros = new int[20];
		int suma=0, suma2=0;
		for (int i = 0; i < 20; i++) {
			
			System.out.println("digite un numero");
			numeros[i]= entrada.nextInt();
			
		}
		
		
		for (int j = 0; j < 20; j++) {
				
				
			if (numeros[j] >= 0) {
				System.out.println(numeros[j] + " es positivo");
				suma= suma+numeros[j];
			}else {
				System.out.println(numeros[j] + " es negativo");
			}
				
			if (numeros[j]%2 == 0) {
				System.out.println(numeros[j] + " es par");
			}else {
				System.out.println(numeros[j]+ " es impar");
				suma2=suma2+numeros[j];
				}
			}
		
		System.out.println("La suma de los positivos es "+ suma);
		System.out.println("La suma de los impares es "+ suma2);

	}

}
