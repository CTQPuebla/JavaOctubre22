package com;

import java.util.Scanner;

public class Estructura10YHZ {

	public static void main(String[] args) {
		int pos=0;
		int impar=0;
		int captura;
		
		Scanner lector = new Scanner(System.in);
		
		for (int i=1;i<=20;i++)
		{
			System.out.println("Ingresa el numero "+i);
			captura = lector.nextInt();
			if(captura %2==0) {
				System.out.println("PAR");
			}else {
				System.out.println("IMPAR");
				impar= impar +captura;
			}
			
			if (captura >=0) {
				System.out.println("POSITIVO");
				pos = pos +captura;
			}else {
				System.out.println("NEGATIVO");
			}
			
	
		}
		
		System.out.println("La suma de positivos es "+pos);
		System.out.println("La suma de impares es "+impar);
		
	
		

	}

}
