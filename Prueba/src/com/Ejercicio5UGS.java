package com;

import java.util.Scanner;

public class Ejercicio5UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char s;
		int n, e;
		System.out.println("Escriba el sexo del candidato: f(femenino) o m(masculino)");
		s = entrada.next().charAt(0);
		System.out.print("Escriba la edad del candidato: ");
		e = Integer.parseInt(entrada.next());
		System.out.print("Escriba la nota del candidato: ");
		n = Integer.parseInt(entrada.next());
		if ((s=='F'|| s=='f')&& e>=18 && n>=5) {
			System.out.println("Aceptado");
		} else if ((s=='M'|| s=='m')&& e>=18 && n>=5)  {
			System.out.println("Posible");
		} else {
			System.out.println("Rechazado");
		}
	}
}
