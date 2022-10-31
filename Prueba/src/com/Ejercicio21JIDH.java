package com;

public class Ejercicio21JIDH {

	public static void main(String[] args) {
		
		double dinero = 1000;
		int mes = 1;
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println("En el mes número " + mes);
		System.out.println("Tendrá " + dinero);
		}
		
	
	
}
