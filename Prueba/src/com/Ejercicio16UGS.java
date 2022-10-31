package com;

import java.util.Scanner;

public class Ejercicio16UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x,y,z;
		boolean error=false;
		System.out.print("Inserte el numero del que quiere la tabla: ");
		x = Integer.parseInt(entrada.next());
		do {
			if (error==true) {
				System.out.println("Error al capturar los datos, inserte numeros mayores a 0");
			}
			System.out.print("¿Hasta que numero lo quiere multiplicar?: ");
			y = Integer.parseInt(entrada.next());
			if (y<1) {
				error=true;
			} else {
				error=false;
			}
		} while (error==true);
		for (int i = 1; i <= y; i++) {
			z = x*i;
			System.out.println(x+" x "+i+" = "+z);
		}
	}
}
