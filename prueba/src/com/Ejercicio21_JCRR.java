package com;

public class Ejercicio21_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inversion = 700;
		int meses=0;
		do {
			
			inversion = inversion + inversion*0.02;
			meses++;
			
		}while(inversion<1500);
		
		System.out.println(meses);

	}

}
