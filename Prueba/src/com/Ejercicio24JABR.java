package com;

import java.util.Scanner;

public class Ejercicio24JABR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int contador=0;
				int num=0;
				int sumP=0;
				int sumImpar=0;
				
			while (contador<20) {
				System.out.println("Ingresa un número");
				num=s.nextInt();
			if (num<0) {
				System.out.println("Negativo");
			}else {
				System.out.println("Positivo");
				sumP=sumP+num;
			}
			if (num%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
				sumImpar=sumImpar+num;
			}
			contador++;
			}
			System.out.println("La sumatoria de los positivos es:" + sumP);
			System.out.println("La sumatoria de los impares es: " + sumImpar);
		

	}

}
