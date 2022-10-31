package com;

public class Ejercicio20UGS {
	public static void main(String[] args) {
		double inversion=1000;
		for (int i = 0; i < 12; i++) {
			inversion = inversion + (inversion*0.02); 
		}
		System.out.println("La ganacia de un año es: "+inversion);
		System.out.println("La ganacia de un año es: "+ (double)Math.round(inversion * 100d)/100);
	}
}
