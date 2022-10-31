package com;

import java.util.Scanner;

public class Ejercicio16_BMNA {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner Numeros = new Scanner (System.in);
		
		System.out.println("Indique el numero que quiere multiplicar: ");
		numero1= Numeros.nextInt();
		System.out.println("Indique hasta que numero lo quiere multiplicar: ");
		numero2= Numeros.nextInt();
	

		for (int i = 0; i <= numero2 ; i++) {
			
			System.out.println( numero1 + " x " + i + " = " + (numero1 * i));
			
		}
		
	}

}
