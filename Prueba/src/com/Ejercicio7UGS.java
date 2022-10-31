package com;

import java.util.Scanner;

public class Ejercicio7UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, pc;
		float pa;
		System.out.print("Cuantos alumnos van a ir al viaje: ");
		x = Integer.parseInt(entrada.next());
		if (x>=100) {
			System.out.println("Se le cobra a cada alumno: 65 euros");
			pc = x*65;
			System.out.println("Se le paga a la compañia: "+pc+" euros");
		} else if (x>=50 && x<100) {
			System.out.println("Se le cobra a cada alumno: 70 euros");
			pc = x*70;
			System.out.println("Se le paga a la compañia: "+pc+" euros");
		} else if (x>=30 && x<50) {
			System.out.println("Se le cobra a cada alumno: 95 euros");
			pc = x*95;
			System.out.println("Se le paga a la compañia: "+pc+" euros");	
		} else if (x>0 && x<30) {
			pa = (float) (4000/x);
			System.out.println("Se le cobra a cada alumno: "+pa+" euros");
			System.out.println("Se le paga a la compañia: 4000 euros");
		} else {
			System.out.println("No se puede calcular las cifras");
		}
	}
}
