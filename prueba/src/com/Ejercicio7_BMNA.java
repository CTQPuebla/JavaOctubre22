package com;

import java.util.Scanner;

public class Ejercicio7_BMNA {

	public static void main(String[] args) {
	
		float cobro, pago;
		int alumnos;
		
		Scanner CantidadAlum = new Scanner (System.in);

		System.out.println("Digite la cantidad de alumnos que iran al viaje: ");
		alumnos= CantidadAlum.nextInt();
		
	
		if (alumnos >= 100) {
			pago = alumnos * 65;
			System.out.println("A los alumnos se le cobraran 65 euros");
			System.out.println("A la compañia se le pagaran " + pago + " euros");
		} else if ( 99 >= alumnos && alumnos >= 50 ) {
			pago = alumnos * 70;
			System.out.println("A los alumnos se le cobraran 70 euros");
			System.out.println("A la compañia se le pagaran " + pago + " euros");
			
		} else if ( 49 >= alumnos && alumnos >= 30 ) {
			pago = alumnos * 90;
			System.out.println("A los alumnos se le cobraran 90 euros");
			System.out.println("A la compañia se le pagaran " + pago + " euros");
			
		} else if ( alumnos <= 29 && alumnos > 0 ) {
			cobro = 4000 / alumnos;
			System.out.println("A los alumnos se le cobraran " + cobro + " euros");
			System.out.println("A la compañia se le pagaran 4000 euros");
			
		}

}
}
