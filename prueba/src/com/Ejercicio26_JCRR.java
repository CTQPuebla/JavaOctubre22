package com;

import java.util.Scanner;

public class Ejercicio26_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int edades, i=0;
		double promedio=0;
		do{
			
			System.out.println("Ingresa la edad");
			edades = entrada.nextInt();
			
			promedio= promedio+edades/(i+1);
			
			i++;
			
		}while (promedio<25);
		

	}

}
