package com;

import java.util.Scanner;

public class Ejercicio26_BMNA {

	public static void main(String[] args) {
		
		float promedio =0;
		int edad;
		int cantidad = 1;
		
		Scanner Edades = new Scanner (System.in);
		
		do {
			
			System.out.println("Ingrese una edad: ");
			edad = Edades.nextInt();
			promedio = (promedio + edad)/cantidad;
			
			cantidad++;
			
			System.out.println("El promedio es: " + promedio);
			
		}while(promedio < 25);
		
		System.out.println("Se terminó el programa");
		
	}

}
