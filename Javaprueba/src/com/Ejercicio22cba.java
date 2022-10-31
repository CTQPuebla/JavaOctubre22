package com;

import java.util.Scanner;

public class Ejercicio22cba {
	public static void main(String[] args) {
		
		//Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
		
		
        int no1; 
        int no2; 
        int menor; 
        int mayor;
       
        
        Scanner lector = new Scanner(System.in);
		System.out.println("ingresar un numero");
		no1 = lector.nextInt();
		System.out.println("ingresar segundo numero");
		no2=lector.nextInt();
		
        
        if (no1 > no2) {
            mayor = no1;
            menor = no2;
        } else {
            mayor = no2;
            menor = no1;
        }
       
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
		
		
		
		
	}//fin main

}//fin
