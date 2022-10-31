package com;

import java.util.Scanner;

public class Ejercicio24DSL {
public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	int contador=0;
	int num=0;
	int sumP=0;
	int sumImpar=0;
	
	while(contador<20) {
		System.out.println("Ingresa un numero");
		num=s.nextInt();
		
		if(num<0) {
			System.out.println("Negativo");
			
		}else {
			System.out.println("Positivo");
			sumP=sumP+num;
		}
		if(num%2==0) {
			System.out.println("es par");
		}else {
			System.out.println("no es par");
			sumImpar=sumImpar + num;
		}
		contador++;
		}
	}
}

