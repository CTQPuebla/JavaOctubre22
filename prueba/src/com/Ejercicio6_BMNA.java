package com;

import java.util.Scanner;

public class Ejercicio6_BMNA {

	public static void main(String[] args) {
		char tipo;
		int tama�o;
		float precio;
		
		Scanner Dato = new Scanner (System.in);
		
		System.out.println("Indique el precio inicial: ");
		precio = Dato.nextFloat();
		System.out.println("Indique el tipo: ");
		tipo = Dato.next().charAt(0);
	
	
		
		switch (tipo) {
		
		case 'A':
			System.out.println("Indique el tama�o: ");
			tama�o = Dato.nextInt();
			switch (tama�o) {
				
				case 1 :
					precio += .20;
					System.out.println("El precio de las uvas es: " + precio);
					break;
				case 2 :
					precio += .30;
					System.out.println("El precio de las uvas es: " + precio);
					break;
				default :
					System.out.println("Digite correctamente el tama�o");
				
			}
				break;
			
			
		case 'a':
			System.out.println("Indique el tama�o: ");
			tama�o = Dato.nextInt();
			switch (tama�o) {
			
			case 1 :
				precio += .20;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			case 2 :
				precio += .30;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			default :
				System.out.println("Digite correctamente el tama�o");
			
		}
			break;
			
		case 'B':
			System.out.println("Indique el tama�o: ");
			tama�o = Dato.nextInt();
			switch (tama�o) {
			
			case 1 :
				precio -= .30;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			case 2 :
				precio += -.50;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			default :
				System.out.println("Digite correctamente el tama�o");
			
		}
		break;
		
		case 'b':
			System.out.println("Indique el tama�o: ");
			tama�o = Dato.nextInt();
			switch (tama�o) {
			
			case 1 :
				precio -= .30;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			case 2 :
				precio += -.50;
				System.out.println("El precio de las uvas es: " + precio);
				break;
			default :
				System.out.println("Digite correctamente el tama�o");
			
		}
			break;
		default:
			System.out.println("Digite correctamente el tipo");
			
			
			
			
		}
			
		
		
		
		
	}

}
