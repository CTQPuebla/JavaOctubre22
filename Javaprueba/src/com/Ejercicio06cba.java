package com;

import java.util.Scanner;

public class Ejercicio06cba {
	public static void main(String[] args) {
		
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
			//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
			//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
			//Precio inicial se recibe desde teclado

		int tama�o;
		int pi;
		String tipo;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar precio inicial");
		pi = lector.nextInt();
		lector.nextLine();
		System.out.println("ingresar tipo A o B");
		tipo = lector.next();
		lector.nextLine();
		System.out.println("ingresar tama�o 1 o 2");
		tama�o = lector.nextInt();
		
		
		if (tipo.equals("A") && tama�o == 1) {
			System.out.println(pi + .20);
		}else if (tipo.equals("A") && tama�o == 2) {
			System.out.println(pi + .30);
		}else if (tipo.equals("B") && tama�o == 1) {
			System.out.println(pi - .30);
		}else if (tipo.equals("B") && tama�o == 2) {
			System.out.println(pi - .50);
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}//fin main

}//fin
