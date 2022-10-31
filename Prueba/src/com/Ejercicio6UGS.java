package com;

import java.util.Scanner;

public class Ejercicio6UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float pi,k,v;
		char ti;
		int ta;
		System.out.print("Precio inicial de la uva: ");
		pi = Float.parseFloat(entrada.next());
		System.out.print("Cuantos kilos entrego: ");
		k = Float.parseFloat(entrada.next());
		System.out.print("Indicar el tipo de uva (A o B): ");
		ti = entrada.next().charAt(0);
		if (!(ti == 'A' || ti == 'a') && !(ti == 'B' || ti == 'b')) {
			System.out.println("Ese tipo de uva no existe");
			System.out.print("Escriba el correcto (A o B): ");
			ti = entrada.next().charAt(0);
		}
		System.out.print("Indicar el tamaño de la uva (1 o 2): ");
		ta = Integer.parseInt(entrada.next());
		
		if (ta < 1 || ta > 2) {
			System.out.println("Ese tamaño de uva no existe");
			System.out.println("Escriba el correcto (1 o 2): ");
			ta = Integer.parseInt(entrada.next());
		}
		
		if (ti=='A'|| ti=='a') {
			if (ta==1) {
				v = (float) (k*(pi+0.20));
			} else {
				v = (float) (k*(pi+0.30));
			}
		} else {
			if (ta==1) {
				v = (float) (k*(pi-0.30));
			} else {
				v = (float) (k*(pi-0.50));
			}
		}
		System.out.println("La ganacia es: "+v);
		
	}
}
