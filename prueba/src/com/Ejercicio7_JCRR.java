package com;

import java.util.Scanner;

public class Ejercicio7_JCRR {
	public static void main(String[] args) {
		
		int n_alumnos; 
		double pago;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos haran el viaje?");
		n_alumnos = entrada.nextInt();
		
		if (n_alumnos>=100) {
			System.out.println("El pago a la compañia es de "+ (n_alumnos*65)+ " y cada alumno deberá de pagar 65 euros");
			
		}else if (n_alumnos<=99 && n_alumnos>=50) {
			System.out.println("El pago a la compañia es de "+ (n_alumnos*70)+ " y cada alumno deberá de pagar 70 euros");
			
		}else if (n_alumnos<=49 && n_alumnos>=30) {
			System.out.println("El pago a la compañia es de "+ (n_alumnos*95)+ " y cada alumno deberá de pagar 95 euros");
			
		}else if(n_alumnos<=29 && n_alumnos>=1){
				pago= 4000/n_alumnos;
				System.out.println("El pago a la compañia es de 4000 y cada alumno deberá de pagar "+ pago);
				
		}else {
			System.out.println("Nadie va a ir al viaje :(");
		}
		
	}

}
