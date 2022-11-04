package com;

import java.util.Scanner;

public class Ejercicio23cba {
	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números pares entre ellos
		
		int no1; 
        int no2; 
        
        Scanner lector = new Scanner(System.in);
		System.out.println("ingresar un numero");
		no1 = lector.nextInt();
		System.out.println("ingresar segundo numero");
		no2=lector.nextInt();
		
		while (no1 >= no2);

        System.out.println("Números pares desde " + no1 + " hasta " + no2 + " : ");
        for (int i = no1; i <= no2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
		
	}//fin main

}//fin
