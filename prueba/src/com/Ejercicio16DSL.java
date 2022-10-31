package com;

import java.util.Scanner;

public class Ejercicio16DSL {
	public static void main(String[]args) {
		 Scanner valor1=new Scanner(System.in);
		 System.out.println("Ingrese el primer valor");
		 int fijo= valor1.nextInt();
		 System.out.println("Ingrese segundo valor");
		 int numero= valor1.nextInt();
		 int contador=1;
		 
		 while(contador<=fijo) {
			 System.out.println(numero+"x"+ contador+ "=" + numero* contador);

			 contador++;
		 }
		 
		 
	}
}
