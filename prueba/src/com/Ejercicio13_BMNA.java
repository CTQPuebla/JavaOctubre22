package com;

import java.util.Scanner;

public class Ejercicio13_BMNA {

	public static void main(String[] args) {
		float donacion;
		
		Scanner Dinero = new Scanner (System.in);
		
		System.out.println("Indique la cantidad de dinero que se donó: ");
		donacion = Dinero.nextFloat();
		
		if (donacion >= 10000) {
		System.out.println("Se dedicaran: \n"
				+ (donacion*.3)+" al centro de salud\n"
				+ (donacion*.5)+" al comer del niños\n"
				+ (donacion*.2)+" a la bolsa");
		}else if (donacion < 10000 && donacion > 0) {
			System.out.println("Se dedicaran: \n"
					+ (donacion*.25)+" al centro de salud\n"
					+ (donacion*.6)+" al comer del niños\n"
					+ (donacion*.15)+" a la bolsa");
		}

	}

}
