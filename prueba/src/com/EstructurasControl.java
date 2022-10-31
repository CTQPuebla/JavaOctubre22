package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {

		int alumnos;
		int precio;
		int costoTotal;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el total de alumnos");
		//120
		alumnos = lector.nextInt();
		if(alumnos>=100) {
			costoTotal = alumnos * 65;
			precio = 65;
		}else if(alumnos>=50 && alumnos<=99) {			
			costoTotal = alumnos * 70;
			precio = 70;
		}else if(alumnos>=30 && alumnos<=49) {
			costoTotal = alumnos * 95;
			precio = 95;
		}else {
			//4000
			costoTotal = 4000;
			precio = 4000 / alumnos;			
		}
		System.out.println("Costo total: "+costoTotal);
		System.out.println("Precio por alumno: "+precio);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
