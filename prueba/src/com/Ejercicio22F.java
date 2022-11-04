package com;

import java.util.Scanner;

public class Ejercicio22F {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int inicio, fin;
		
		System.out.print("ingrere valor inicial: ");
		inicio=entrada.nextInt();
		entrada.nextLine();
		System.out.print("Introduce otro número entero mayor que el anterior: ");
		fin=entrada.nextInt();
		
		if (inicio>= fin) {
            System.out.println("El segundo número debe ser mayor que el primero");                  
		}
		for(int i=inicio;i<=fin;i++) {
					System.out.println(i);
					 
				
					
		}			
			}
}