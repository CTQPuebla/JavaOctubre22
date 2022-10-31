package com;

import java.util.Scanner;

public class Ejercicio7YHZ {

	public static void main(String[] args) {
		
		int alumnos;
		int pago;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de alumnos: ");
		alumnos = lector.nextInt();
		
		if (alumnos>= 100) {
			System.out.println("El costo por alumno es de 65 euros");
			pago = alumnos *65;
			System.out.println("El total a pagar es de: "+pago);
		}else if (alumnos>50 && alumnos<99){
			System.out.println("El costo por alumno es de 70 euros");
			pago = alumnos *70;
			System.out.println("El total a pagar es de: "+pago);
		}
		
		else if (alumnos>30 && alumnos<49){
			System.out.println("El costo por alumno es de 95 euros");
			pago = alumnos *95;
			System.out.println("El total a pagar es de: "+pago);
		}
		else {
			
			System.out.println("El total a par es de 4000");
		}
		

	}

}
