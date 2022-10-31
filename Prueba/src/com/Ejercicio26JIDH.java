package com;

import java.util.Scanner;

public class Ejercicio26JIDH {
	
	public static void main(String[] args) {
		
		
	    float promedio = 0;
	    int edad;
	    int cantidad = 1;
	    
	    Scanner lector = new Scanner(System.in);

	        
	        do {
		        System.out.println("Ingrese una edad: ");
		        edad = lector.nextInt();
		    	promedio = (promedio + edad)/cantidad;
		    	
		    	cantidad++;
		    	
		    	System.out.println("El promedio es de: " + promedio);
		    	
			} while (promedio < 25);
	        
	        System.out.println("Se termina el programa");
	    }
	    
	}