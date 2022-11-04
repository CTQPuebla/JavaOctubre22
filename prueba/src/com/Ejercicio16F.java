package com;

import java.util.Scanner;

public class Ejercicio16F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int tabla=1, rango=1, res;
		
		
		System.out.print("introduce el numero de la tabla de multiplicar que desea:");
		tabla=entrada.nextInt();
	    entrada.nextLine();
	
		System.out.print("introucel a que numero desea llegra: ");
		rango=entrada.nextInt();
		entrada.nextLine();
		
		for(int i=1; i<=rango;i++) {
			
			res=tabla*i;
			System.out.println(tabla+"x"+i+"="+res);
			res++;
			
		}
			

	}

}
