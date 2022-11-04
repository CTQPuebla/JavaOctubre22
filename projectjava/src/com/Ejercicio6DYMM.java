package com;

import java.util.Scanner;

public class Ejercicio6DYMM {

	public static void main(String[] args) {
		//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		//y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar 
		//cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
			//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
			//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
			//Precio inicial se recibe desde teclado

			
			int pinicial; 
			String tipo = " ";
			int tamaño;
			Scanner lector = new Scanner (System.in);
			
			System.out.println("Ingresa el precio inicial");
			pinicial = lector.nextInt();
			lector.nextLine();
			System.out.println("Ingresa el tipo de uva 'A' o 'B'");
			tipo = lector.nextLine();		
			System.out.println("Ingresa el tamaño de la uva '1' o '2'");
			tamaño = lector.nextInt();
			
			if (tipo.equals("A") && tamaño == 1) {
				System.out.println("El precio de la uva es " + (pinicial + .20) );
			} else if (tipo.equals("A") && tamaño == 2) {
				System.out.println("El precio de la uva es " + (pinicial + .30) );
			} else if (tipo.equals("B") && tamaño == 1) {
				System.out.println("El precio de la uva es " + (pinicial + .30) );
			} else if (tipo.equals("B") && tamaño == 2) {
				System.out.println("El precio de la uva es " + (pinicial + .50) );
			} else {
				System.out.println("ERROR");
			}
 
	}
	
}
