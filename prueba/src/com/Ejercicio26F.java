package com;

import java.util.Scanner;

public class Ejercicio26F {

	public static void main(String[] args) {
		
	        Scanner entrada = new Scanner(System.in);

			 int i=0, edad, suma= 0, promedio;
			 
	        do {
	            
	            System.out.printf((i)+" Ingrese la edad: ");
	            edad = entrada.nextInt();
	            i++; 
	            suma=suma + edad;
	            promedio=suma/i;
	        }while(promedio < 25);
	            System.out.println("En promedio de mayoyes de edad "+promedio);
	
			
	}

}
