package com;

import java.util.Scanner;

public class Ejercicio27UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] letras = {"5","x","3","t","q","7","3","p","x","15"};
		String[] texto = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
		String numeros = "12345678901112131415";
		int sumatoria=0;
		for (int i = 0; i < letras.length; i++) {
			if (numeros.indexOf(letras[i])>=0) {
				sumatoria+=Integer.parseInt(letras[i]);
				System.out.println(texto[Integer.parseInt(letras[i])-1]);
			}
		}
		System.out.println("La sumatoria es: "+sumatoria);
	}
}
