package com;

import java.util.Scanner;

public class Ejercicio16JABR {

	public static void main(String[] args) {
		
		int n;
		int e;	
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el número del que deseas la tabla");
		n=lector.nextInt();
		System.out.println("Introduce el número hasta el que deseas la tabla");
		e=lector.nextInt();
			for (int i = 1; i<=e; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
				}
				
			
		}

}
