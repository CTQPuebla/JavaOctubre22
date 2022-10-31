package com;

public class Ejercicio20DSL {
public static void main(String[]args) {
	
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 0.02;
		mes++;
		}
		System.out.println("Dinero reunido a lo largo del año: "+dinero);
		}
	}
