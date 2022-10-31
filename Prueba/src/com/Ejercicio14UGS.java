package com;

import java.util.Scanner;

public class Ejercicio14UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int h,s=0;
		System.out.print("Horas trabajadas: ");
		h = Integer.parseInt(entrada.next());
		if (h<=0) {
			System.out.println("No recibe paga");
		} else if (h>0 && h<=40) {
			s = h*16;
		} else {
			s = (40*16) + ((h-40)*20);
		}
		System.out.println("El salario es de: "+s+" euros");
	}
}
