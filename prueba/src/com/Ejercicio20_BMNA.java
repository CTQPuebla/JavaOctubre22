package com;

public class Ejercicio20_BMNA {

	public static void main(String[] args) {
	
		double inversion=1000;
		
		for (int i = 0; i <= 12; i++) {
			
			inversion= inversion + (inversion*0.02);
		}
		
		System.out.println("El dinero total al fue: " + inversion);
		
		

	}

}
