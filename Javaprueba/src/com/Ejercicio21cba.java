package com;

import java.util.Scanner;

public class Ejercicio21cba {
	public static void main(String[] args) {
		
		//Una persona desea invertir $700.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. En cuantos meses tendrá 
		//mas de $1500, si reinvierte cada mes todo su dinero?
		
		double inversioni;
		double interes;
		int target;
		int meses=1;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar inversion inicial");
		inversioni=lector.nextInt();
		System.out.println("ingresar target");
		target=lector.nextInt();
		System.out.println("ingresat interes");
		interes = lector.nextDouble();
		
		for (int i = 1; i <= meses; i++) {
			inversioni = inversioni * (1+interes);
			if (inversioni >= target) break;
				meses++;	
			}
			
			
			
		
		System.out.println(meses +" meses");
		
		
		
		
	}//fin main

}//fin
