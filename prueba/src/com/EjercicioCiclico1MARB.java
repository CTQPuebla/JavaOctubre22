package com;

import java.util.Scanner;

public class EjercicioCiclico1MARB {
	public static void main(String[] args) {
		
		//programa un algoritmo que realize la tabla de multiplicar del 12
		
		Scanner lector = new Scanner(System.in);
		
		int x;
		System.out.println("escribe el numero que deseas sacar su tabla de multiplicar");
		x= lector.nextInt();
		System.out.println("tabla del: "+x);
		for ( int i=1; i<=50;i++) {
			System.out.println(x + "*"+i+"="+x*i);
			
		    }
	}		
	}


