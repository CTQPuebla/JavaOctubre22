package com;

public class Ejercicio21_BMNA {

	public static void main(String[] args) {


		double inversion=700;
		int meses = 0;
		
		while (inversion < 1500) {
			
			inversion= inversion + (inversion*0.02);
			meses ++;
		
			
		}

		System.out.println("Alcanzó la meta en " + meses + " meses");
		
	}

}
