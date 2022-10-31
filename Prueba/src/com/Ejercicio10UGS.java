package com;

import java.util.Scanner;

public class Ejercicio10UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int m;
		System.out.println("Digite un numero de mes: ");
		m = Integer.parseInt(entrada.next());
		if (m == 2) {
			System.out.println("Este mes tiene 28 dias");
		} else if (m==1 || m==3 || m==5|| m==7 || m==8 || m==10 || m==12) {
			System.out.println("Este mes tiene 31 dias");
		} else if (m==4 || m==6 || m==9 || m==11) {
			System.out.println("Este mes tiene 30 dias");
		} else {
			System.out.println("No existe este mes");
		}
	}
}
