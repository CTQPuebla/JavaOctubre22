package com;

import java.util.Scanner;

public class Ejercicio24JIDH {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int [] num = new int [20]; 
		
	    for (int i = 1; i <= num.length-1; i++){
	        System.out.println("Ingrese un numero: ");
	        num [i] = lector.nextInt();
	    }
    	int numf = 0;
    	int numfi = 0;
	    for (int i = 0; i < num.length; i++) {

	    	
	    	if(num[i]%2 == 0) {
	    		System.out.println(num[i] + " número par");
	    	} else {
	    		System.out.println(num[i] + " número impar");
	    		numfi = numfi + num[i];
	    	} 
	    	
	    	if(num[i] < 0) {
	    		System.out.println(num[i] + " número negativo");
	    	} else {
	    		System.out.println(num[i] + " número positivo");
	    		numf = numf + num[i];
	    	}		
		}
	    
	    System.out.println("La suma de los números impares es: " + numfi);
	    System.out.println("La suma de los números impares es: " + numf);
	    }
	    
	    
		
	}

