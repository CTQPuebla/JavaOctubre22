package com;

import java.util.Scanner;

public class Ejercicio6DYMM {

	public static void main(String[] args) {
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		//y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar 
		//cuanto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
			//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
			//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
			//Precio inicial se recibe desde teclado

			
			int pinicial; 
			String tipo = " ";
			int tama�o;
			Scanner lector = new Scanner (System.in);
			
			System.out.println("Ingresa el precio inicial");
			pinicial = lector.nextInt();
			lector.nextLine();
			System.out.println("Ingresa el tipo de uva 'A' o 'B'");
			tipo = lector.nextLine();		
			System.out.println("Ingresa el tama�o de la uva '1' o '2'");
			tama�o = lector.nextInt();
			
			if (tipo.equals("A") && tama�o == 1) {
				System.out.println("El precio de la uva es " + (pinicial + .20) );
			} else if (tipo.equals("A") && tama�o == 2) {
				System.out.println("El precio de la uva es " + (pinicial + .30) );
			} else if (tipo.equals("B") && tama�o == 1) {
				System.out.println("El precio de la uva es " + (pinicial + .30) );
			} else if (tipo.equals("B") && tama�o == 2) {
				System.out.println("El precio de la uva es " + (pinicial + .50) );
			} else {
				System.out.println("ERROR");
			}
 
	}
	
}
