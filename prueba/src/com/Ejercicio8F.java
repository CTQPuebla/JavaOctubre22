package com;

import java.util.Scanner;

public class Ejercicio8F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int dado;
		System.out.print("indica el lado de la cara del dado: ");
		dado=entrada.nextInt();
		entrada.nextLine();
		
		if(dado >=1 && dado<=6 ) {
			switch(dado) {
			case 1:
				System.out.println("en la cara opuesta esta el --> seis");
				break;
			case 2:
				System.out.println("en la cara opuesta esta el --> cinco");
				break;
			case 3:
				System.out.println("en la cara opuesta esta el -->  cuatro");
				break;
			case 4:
				System.out.println("en la cara opuesta esta e l-->  tres");
				break;
			case 5:
				System.out.println("en la cara opuesta esta el --> dos");
				break;
			case 6:
				System.out.println("en la cara opuesta esta el --> uno");
				break;
			default:
				
			}	
			
		}else {
		System.out.println("error");
		}
		
	}

}
