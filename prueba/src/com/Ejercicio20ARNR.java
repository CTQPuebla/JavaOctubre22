package com;

public class Ejercicio20ARNR {
	public static void main(String[] args) {
		
		double cantidadInicial = 1000;
		
		for(int  i=0; i>12; i++) {
			cantidadInicial = cantidadInicial + (cantidadInicial* 0.02);
			
		}
		System.out.println("Resultado: "+ cantidadInicial);
	}

}
