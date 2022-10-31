package com;

import java.util.Scanner;

public class Estructuracontrol {
public static void main(String[]args) {
	
	//Leer valores desde el teclado
	
	int p = 20;
	String x;
	Scanner lector = new Scanner(System.in);
	System.out.println("ingresa un valor");
	p = p + lector.nextInt();
	lector.nextLine();
	System.out.println("Ingresa un texto");
	x = lector.nextLine();
	System.out.println("Valor: " + p);
	System.out.println("valor: " + x);

	}
}