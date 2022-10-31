package com;

import java.util.Scanner;

public class Ejercicio22_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, bandera;
		
		System.out.println("Dame el primer numero");
		numero1 = entrada.nextInt();
		System.out.println("Dame el segundo numero");
		numero2 = entrada.nextInt();
		
		while(numero1>numero2) {
			
			bandera = numero1;
			numero1 = numero2;
			numero2 = bandera;
		
		}
		
		for (int i = numero1+1; i < numero2; i++) {
			
			System.out.println(i);
			
		}
		
		

	}

}
