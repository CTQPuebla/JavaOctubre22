package com;

import java.util.Scanner;

public class Ejercicio11_BMNA {

	public static void main(String[] args) {
	
		int destino;
		float peso;
		
		Scanner Dato = new Scanner (System.in);
		
		System.out.println("Digite el peso de su paquete en kg: ");
		peso = Dato.nextFloat();
		
		if (peso > 5) {
			
			System.out.println("Su paquete es demasiado pesado, no se puede transportar");
			
		} else if (peso > 0 && peso <= 5) {
			
			System.out.println("Seleccione su destino:\n"
					+ "1.- America del Norte \n"
					+ "2.- America Central \n"
					+ "3.- America del Sur \n"
					+ "4.- Europa \n"
					+ "5.- Asia");
			
			destino = Dato.nextInt();
			
			switch(destino) {
			
			case 1:
				System.out.println("El precio es " + (peso * 24) + " euros");	
				break;
			case 2:
				System.out.println("El precio es " + (peso * 20) + " euros");	
				break;
			case 3:
				System.out.println("El precio es " + (peso * 21) + " euros");	
				break;
			case 4:
				System.out.println("El precio es " + (peso * 10) + " euros");	
				break;
			case 5:
				System.out.println("El precio es " + (peso * 18) + " euros");	
				break;
			default:
				System.out.println("ERROR: Destino incorrecto");
			}
			
		}

	}

}
