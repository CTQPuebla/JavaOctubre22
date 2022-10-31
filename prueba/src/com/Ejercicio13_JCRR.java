package com;

import java.util.Scanner;

public class Ejercicio13_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double donacion;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cual sera el monton de la donacion este año?");
		donacion = entrada.nextDouble();
		
		if (donacion>= 10000) {
			System.out.println("Se destina " + (donacion*0.30) +" al centro de salud "+ (donacion*0.50) +" al comedor de niños y "+ (donacion*0.20) +" se invierte en la bolsa anualmente.");
		}else {
			System.out.println("Se destina " + (donacion*0.25) +" al centro de salud "+ (donacion*0.60) +" al comedor de niños y "+ (donacion*0.15) +" se invierte en la bolsa.");
		}

	}

}
