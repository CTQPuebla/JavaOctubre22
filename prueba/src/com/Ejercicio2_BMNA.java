package com;

import java.util.Scanner;

public class Ejercicio2_BMNA {

	public static void main(String[] args) {
	
		int x;
		
		Scanner Numero = new Scanner (System.in);
		System.out.println("Ingrese el numero: ");
		x = Numero.nextInt();
		
		if(x%2 == 0) {
			
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	}

}
