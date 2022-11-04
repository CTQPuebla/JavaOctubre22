package com;

import java.util.Scanner;

public class Ejercicio1MARB {
	public static void main(String[] args) {
		//declaracion de variables
		
		int p;
		int x;
		//ingreso de valor a las variables por el ususario
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresa un valor");
		p = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresa un valor");
		x = lector.nextInt();
		lector.nextLine();
		// condicion de p mayor que x
		if(p>x) {
			System.out.println(p + "es mayor que" + x);
		}
		//condicion de x mayor que p
		else if (x>p) {
			System.out.println(x + "es mayor que" + p);
		}
		//condicion de p igual que x 
		else if (p==x) {
			System.out.println("los numeros ingresados son iguales");
			
		}
		
	}
	
	

}
