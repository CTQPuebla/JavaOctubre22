package com;

public class Principal {

	public static void main(String[] args) {


		Calculadora_cientifica cal = new Calculadora_cientifica("Casio", "led", "14", "Si", "Si", "No", 7);
		
		cal.sumar(45, 22);
		cal.raizc(20);
		
		System.out.println(cal);
		
	}

}
