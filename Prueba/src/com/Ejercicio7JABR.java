package com;

import java.util.Scanner;

public class Ejercicio7JABR {

	public static void main(String[] args) {
		
		int viaje=4000;
		int vEco=70;
		int vMed=95;
		int alumnos;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingresa el número de alumnos");
		alumnos=lector.nextInt();
		if (alumnos>=50 && alumnos<100) {
			System.out.println("El costo del viaje es " + (alumnos*70) + " y " + vEco + " por alumno");
		}else if (alumnos<50 && alumnos>29) {
			System.out.println("El costo del viaje es " + (alumnos*95) + " y " + vMed + " por alumno");
		}else if (alumnos<30) {
			System.out.println("El costo del viaje es " + viaje + " por ser menos de 30 alumnos");
		}else
			System.out.println("No existe la cotización");
		
	}

}
