package com;

import java.util.Scanner;

public class Ejercicio04cba {
	public static void main(String[] args) {
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		String x;
	    Scanner lector = new Scanner (System.in);
	    
	    System.out.println("Ingresa un texto");
	    x = lector.nextLine();
	    
	    if (x.equals(x.toUpperCase())) {
	      System.out.println("May�scula");
	    } else if (x.equals(x.toLowerCase())){
	      System.out.println("Minusculas");
	    }else { 
	      System.out.println("May�scula");
	    }
	}



}//fin