package com;

import java.util.Scanner;

public class Ejercicio16_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite el numero para saber que tabla de multiplicar haremos");
		numero1 = entrada.nextInt();
		System.out.println("Digite hasta que iteracion");
		numero2 = entrada.nextInt();
		
		for (int i = 0; i < numero2+1; i++) {
			System.out.println(numero1 +" x "+ i + " = " + numero1*i);
			
		}
		

	}

}
