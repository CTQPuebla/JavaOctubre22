package com;

import java.util.Scanner;

public class Ejercicio06cba {
	public static void main(String[] args) {
		
		//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
			//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
			//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
			//Precio inicial se recibe desde teclado

		int tamaño;
		int pi;
		String tipo;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar precio inicial");
		pi = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar tipo A o B");
		tipo = lector.next();
		lector.nextLine();
		System.out.println("ingresar tamaño 1 o 2");
		tamaño = lector.nextInt();
		
		
		if (tipo.equals("A") && tamaño == 1) {
			System.out.println(pi + .20);
		}else if (tipo.equals("A") && tamaño == 2) {
			System.out.println(pi + .30);
		}else if (tipo.equals("B") && tamaño == 1) {
			System.out.println(pi - .30);
		}else if (tipo.equals("B") && tamaño == 2) {
			System.out.println(pi - .50);
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}//fin main

}//fin
