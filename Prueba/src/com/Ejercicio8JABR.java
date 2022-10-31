package com;

import java.util.Scanner;

public class Ejercicio8JABR {

	public static void main(String[] args) {
		
		int cara;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número que muestra la cara del dado");
		cara=lector.nextInt();
		switch (cara) {
		case 1:
			System.out.println("La cara opuesta es Seis");
			break;
		case 2:
			System.out.println("La cara opuesta es Cinco");
			break;
		case 3:
			System.out.println("La cara opuesta es Cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta es Tres");
			break;
		case 5:
			System.out.println("La cara opuesta es Dos");
			break;
		case 6:
			System.out.println("La cara opuesta es Uno");
			break;
		}if (cara<1) {
			System.out.println("Error: número incorrecto");
		}else if (cara>6) {
			System.out.println("Error: número incorrecto");
		}
			
		}
			
		}