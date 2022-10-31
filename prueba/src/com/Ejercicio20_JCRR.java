package com;

public class Ejercicio20_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total= 1000;
		
		for (int i = 0; i <= 12; i++) {
			total = total+ total*0.02;
		}
		
		System.out.println("El total invertido es de "+ total);

	}

}
