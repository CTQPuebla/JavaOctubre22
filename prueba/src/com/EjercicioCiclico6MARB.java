package com;

public class EjercicioCiclico6MARB {
	// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. Cual ser� la cantidad 
	//de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?.
	
	public static void main(String[] args) {
		double dinero = 1000;
		int mes = 1;
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println(mes);
		System.out.println(dinero);
		}
		}