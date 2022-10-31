package com;

import java.util.Scanner;

public class Ejercicio1F {
	public static void main(String[] args) {
		int valor1, valor2;
		Scanner entrada=new  Scanner(System.in);
		System.out.print("ingrese  valor: ");
		valor1=entrada.nextInt();
		System.out.print("ingresse valor:");
		valor2=entrada.nextInt();
		
		if(valor1 >valor2) {
			System.out.println("el numero mayor es: "+ valor1);
		}else if(valor2 > valor1) {
			System.out.println("el numero mayor es: "+ valor2);
			
		}else {
			System.out.println("los numeros son iguales");
			
		}
	
		
		
	}

}
