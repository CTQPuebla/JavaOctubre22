package com;

public class Estructura6YHZ {

	public static void main(String[] args) {
		
		
		double capital = 1000.00;
		double interes = 0.2;
		double total=0.0;
		
		for (int i = 0;i<=12;i++) {
			total = total +(capital*interes);
		}
		System.out.println("El capitalfinal es de: "+total);

	}

}
