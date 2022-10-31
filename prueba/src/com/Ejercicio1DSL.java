package com;

import java.util.Scanner;

public class Ejercicio1DSL {
	public static void main(String[]args) {
	//Declaracion de varibles
	int p ;
	int x;
	//Ingreso de valor a las variables por el usuario
	Scanner lector = new Scanner(System.in);
	System.out.println("ingresa un valor");
	p = lector.nextInt();
	lector.nextLine();
	System.out.println("Ingresa un valor");
	x = lector.nextInt();
	//Condicion de p mayor que x
	if(p>x) {
		System.out.println( p + " Es mayor que "+ x);
	}
	//Condicion de x mayor que p
	else if(x>p) {
	System.out.println(x + " Es mayor que " + p);
	}
	//Condicion de p igual que x
	else if (p == x) {
	System.out.println ("Los numeros ingresados son iguales");
}
}
}