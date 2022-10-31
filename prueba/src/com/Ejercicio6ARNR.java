package com;

import java.util.Scanner;

public class Ejercicio6ARNR {
	public static void main(String[] args) {
		double precioInicial;
		int tipo;
		int tamaño;
		double ganancia;
		double embarque;
		double precioKilo;
		double pago;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor del embarque en kilos");
		embarque = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("precio inicial");
		precioInicial = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Tipo de uva 1 o 2");
		System.out.println("1.-A");
		System.out.println("2.-B");
		tipo = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("tamaño 1 o 2");
		tamaño = sc.nextInt();
		sc.nextLine();
	
		
		precioKilo = precioInicial;
		
	if(tipo==1 && tamaño==1) {
		precioKilo = precioKilo +.20;
		
	}else if(tipo==1 && tamaño==2) {
		precioKilo = precioKilo +.30;
		
	}else if(tipo==2 && tamaño==1) {
		precioKilo = precioKilo -.30;
	}else if (tipo==2 && tamaño==2);{
	    precioKilo = precioKilo -.50;
	}
		
		pago = embarque * precioKilo;
		System.out.println("valor del pago al productor "+pago);
		System.out.println("valor de precio del kilo "+ precioKilo);
		
		
		
		
		
	}
}
