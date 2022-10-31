package com;

import java.util.Scanner;

public class Ejercicio8_BMNA {

	public static void main(String[] args) {
		int numero;
		
		Scanner NumeroCara = new Scanner (System.in);
		
		System.out.println("Digite el numero de la cara del dado: ");
		numero = NumeroCara.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("La cara contraria es seis");
			break;
		case 2:
			System.out.println("La cara contraria es cinco");
			break;
		case 3: 
			System.out.println("La cara contraria es cuatro");
			break;
		case 4:
			System.out.println("La cara contraria es tres");
			break;
		case 5:
			System.out.println("La cara contraria es dos");
			break;
		case 6:
			System.out.println("La cara contraria es uno");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
		
		
		}
	}

}
