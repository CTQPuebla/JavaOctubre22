package com;

import java.util.Scanner;

public class Ejercicio2F {
	public static void main(String[] args) {
		int valor;
		Scanner entrada=new  Scanner(System.in);
		System.out.print("ingrese  valor: ");
		valor=entrada.nextInt();
		
		
		if(valor %2==0) {
			System.out.println("EL VALORES PAR");
			
		}else {
			System.out.println("el valor es inpar");
		}
	
	}

}
