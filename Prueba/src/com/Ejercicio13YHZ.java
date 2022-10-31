package com;

import java.util.Scanner;

public class Ejercicio13YHZ {

	public static void main(String[] args) {
		float donacion;
		float centro;
		float niños;
		float bolsa;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el importe de donacion: ");
		donacion = lector.nextFloat();
		
		if (donacion >10000) {
			centro = donacion * 30/100;
			niños = donacion * 50/100;
			bolsa = donacion *20/100;
			System.out.println("El centro de salud destinara: "+centro);
			System.out.println("El comedor de niños destinara: "+niños);
			System.out.println("En la bolsa se invierte: "+bolsa);
		}else {
			centro = donacion * 25/100;
			niños = donacion * 60/100;
			bolsa = donacion *15/100;
			System.out.println("El centro de salud destinara: "+centro);
			System.out.println("El comedor de niños destinara: "+niños);
			System.out.println("En la bolsa se invierte: "+bolsa);
	}
	}
}
