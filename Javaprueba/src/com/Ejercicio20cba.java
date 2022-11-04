package com;

import java.util.Scanner;

public class Ejercicio20cba {
	public static void main(String[] args) {

		//Una persona desea invertir $1,000.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. Cual será la cantidad 
		//de dinero que esta persona tendrá al cabo de un año si 
		//todo el dinero lo reinvierte?	
		
		int inversioni;
		double interes;
		int periodo;
		double dinerototal=1;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar inversion inicial");
		inversioni=lector.nextInt();
		System.out.println("ingresar periodo de invercion");
		periodo=lector.nextInt();
		System.out.println("ingresat interes");
		interes = lector.nextDouble();
		
		for (int i = 1; i <= periodo; i++) {
			
			dinerototal= dinerototal * (1+interes);
			
		}
		System.out.println(dinerototal * inversioni + " $");
		

		
		
	}//fin main

}//fin
