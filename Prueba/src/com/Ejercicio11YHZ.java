package com;

import java.util.Scanner;

public class Ejercicio11YHZ {

	public static void main(String[] args) {
		
		int peso;
		int ubicacion;
		int total;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("1. AMERICA DEL NORTE");
		System.out.println("2. AMERICA CENTRAL");
		System.out.println("3. AMERICA DEL SUR");
		System.out.println("4. EUROPA");
		System.out.println("5. ASIA");
		System.out.println("Ingresa el numero de la zona que corresponde: ");
		ubicacion = lector.nextInt();
		System.out.println("Ingresa el peso del paquete: ");
		peso = lector.nextInt();
		
		if (peso > 5) {
			System.out.println("Paquete rechazado");
		}
		else {
			switch(ubicacion) {
			case 1: 
				total = peso *24000;
				System.out.println("El costo de transporte es de "+total);
				break;
			case 2:
				total = peso *20000;
				System.out.println("El costo de transporte es de "+total);
				break;
			case 3:
				total = peso *21000;
				System.out.println("El costo de transporte es de "+total);
				break;
			case 4:
				total = peso *10000;
				System.out.println("El costo de transporte es de "+total);
				break;
			case 5:
				total = peso *18000;
				System.out.println("El costo de transporte es de "+total);
				break;
			
			default:
				System.out.println("La ubicacion no esta en el catalogo");
		}

	}
	}

}
