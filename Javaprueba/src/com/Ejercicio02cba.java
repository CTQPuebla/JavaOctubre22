package com;

import java.util.Scanner;

public class Ejercicio02cba {
	public static void main(String[] args) {
		
		int x;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar valor");
		x = lector.nextInt();
		
		if(x % 2 == 0) {
            System.out.println(x+" es n�mero par.");
        }else {
            System.out.println(x+" es n�mero inpar.");
        }
		
		
		
		
	}//main

}//fin
