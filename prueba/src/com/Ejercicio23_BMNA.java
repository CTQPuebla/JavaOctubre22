package com;

import java.util.Scanner;

public class Ejercicio23_BMNA {

	public static void main(String[] args) {

		int numero1, numero2;
		Scanner Entradas = new Scanner (System.in);
		
		
		System.out.println("Digite el primer numero: ");
		numero1 = Entradas.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 =  Entradas.nextInt();
		
		
		
		if(numero1 > numero2) {
			
			for (int i = numero2 ; i <= numero1; i++) {
				
				if(i%2==0) {
					System.out.println(i);
				}
				
			}
			
		} else {
			
			for (int i = numero1 ; i <= numero2; i++) {
				
				if(i%2==0) {
					System.out.println(i);
				}		}

	}
		

	}

}
