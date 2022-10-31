package com;

import java.util.Scanner;

public class Ejercicio8DSL {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	    int dado;
		
		System.out.print("Resultado de la cara obtenida: ");
	    dado = scanner.nextInt();
	// Realizamos comparaciones de los resultados obtenidos por el usuario
	    switch (dado) {
	    case 1:
	       System.out.println("En la cara opuesta está el \"seis\".");
	     break;
	    case 2:
	      System.out.println("En la cara opuesta está el \"cinco\".");
	       break;
	      case 3:
	       System.out.println("En la cara opuesta está el \"cuatro\".");
	      break;
	    case 4:
	      System.out.println("En la cara opuesta está el \"tres\".");
	      break;
	      case 5:
	    System.out.println("En la cara opuesta está el \"dos\".");
	     break;
	    case 6:
	        System.out.println("En la cara opuesta está el \"uno\".");
	      break;
	    default:
	    	//Si el dato ingresado por el usuario es menor de 1 o mayor a 6 
	          System.out.println("ERROR: número incorrecto.");
	    }
	}

}
