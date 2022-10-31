package com;

import java.util.Scanner;

public class Ejercicio13UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double d,cs=0,cn=0,b=0;
		System.out.print("Inserte el monto de la donacion: ");
		d = Double.parseDouble(entrada.next());
		if (d<=0) {
			System.out.println("No se puede repartir la donacion");
		} else if (d<10000) {
			cs = d*0.25;
			cn = d*0.60;
			b = d*0.15;
		} else {
			cs = d*0.30;
			cn = d*0.50;
			b = d*0.20;
		}
		System.out.println("La donacion se reparte de la siguiente forma:\n"
				+ "Centro de saluda recibe: "+cs+" euros\n"
				+ "Comedor de niños recibe: "+cn+" euros\n"
				+ "Bolsa recibe: "+b+" euros\n");
		
	}
}
