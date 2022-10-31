package com;

public class Estructura7YHZ {

	public static void main(String[] args) {
		
		double capital = 700.00;
		double interes = 0.2;
		double total=0.0;
		int mes=0;
		
		while (total<1500.00) {
			total = total +(capital*interes);
			mes = mes +1;
		}
		
		
		System.out.println("El capitalfinal es de: "+total);
		System.out.println("Los meses que se invirtio son: "+mes);

	}

}
