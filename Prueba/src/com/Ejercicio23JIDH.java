package com;

import java.util.Scanner;

public class Ejercicio23JIDH {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int numero1;
		int numero2;
		int menor;
		int mayor;
	   
	    	
	    	
	    do {
	    	 
	     	 System.out.println("Introduce un n�mero entero: ");
	         numero1 = lector.nextInt();
	         System.out.println("Introduce otro n�mero entero distinto: ");                   
	         numero2 = lector.nextInt();
	        if(numero1 == numero2){
	            System.out.println("Debes introducir dos n�meros distintos");
	        }
	    } while (numero1 == numero2);
	   

	    System.out.println("\nN�meros pares entre " + numero1 + " y " + numero2 + " : ");
	    for (int i = numero1; i <= numero2; i++) {
	    	
	    	if(i%2 == 0) {
	        System.out.println(i);
	    	}
	    }
		
	}
	
}
