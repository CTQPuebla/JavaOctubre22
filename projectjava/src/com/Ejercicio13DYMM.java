package com;

import java.util.Scanner;

public class Ejercicio13DYMM {

	public static void main(String[] args) {
		
		//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, 
		//un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto 
		//se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto 
		//se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

		int don;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Ingresar monto de la donación");
		don = lector.nextInt();
		
		if (don >= 10000) {
			System.out.println("Se destinarán " + (don *0.30) + " para el centro de salud, " + (don * 0.50) 
					+ " al comedor de niños y " + (don - ((don *0.30)+(don * 0.50))) + " en inversiones de la bolsa");
		} else if (don < 10000) {
			System.out.println("Se destinarán " + (don *0.25) + " para el centro de salud, " + (don * 0.60) 
					+ " al comedor de niños y " + (don - ((don *0.25)+(don * 0.60))) + " en inversiones de la bolsa");
		}

	}
	
}
