package com;

import java.util.Scanner;

public class Ejercicio10DSL {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	    int mes;
	// Solicitud de datos al usuario
	    System.out.println("El programa te devuelve el mes del año, seleccionando el numero del mes:");
	    System.out.println("1.-ENERO");
	    System.out.println("2.- FEBRERO");
	    System.out.println("3.- MARZO");
	    System.out.println("4.- ABRIL");
	    System.out.println("5.- MAYO");
	    System.out.println("6.- JUNIO");
	    System.out.println("7.- JULIO");
	    System.out.println("8.- AGOSTO");
	    System.out.println("9.- SEPTIEMBRE");
	    System.out.println("10.- OCTUBRE");
	    System.out.println("11.- NOVIEMBRE");
	    System.out.println("12.- DICIEMBRE");
	    mes = scanner.nextInt();
	// Ingresamos el numero del mes
	    switch (mes) {
	    case 1:
	        System.out.println("El día seleccionado es ENERO");
	     break;
	   case 2:
	      System.out.println("El día seleccionado es FEBRERO");
	       break;
	     case 3:
	       System.out.println("El día seleccionado es MARZO");
	     break;
	     case 4:
	       System.out.println("El día seleccionado es ABRIL");
	     break;
	    case 5:
	      System.out.println("El día seleccionado es MAYO");
	       break;
	   case 6:
	      System.out.println("El día seleccionado es JUNIO");
	     break;
	       case 7:
	     System.out.println("El día seleccionado es JULIO");
	     break;
	       case 8:
	 	      System.out.println("El día seleccionado es AGOSTO");
	 	       break;
	 	   case 9:
	 	      System.out.println("El día seleccionado es SEPTIEMBRE");
	 	     break;
	 	       case 10:
	 	     System.out.println("El día seleccionado es OCTUBRE");
	 	     break;
	 	      case 11:
	 		      System.out.println("El día seleccionado es NOVIEMBRE");
	 		       break;
	 		   case 12:
	 		      System.out.println("El día seleccionado es DICIEMBRE");
	 		     break;
	 		       default:
	    	//En caso de ingresar un numero mayor a 12 o menor a 1 se mostrara un error
	      System.out.println("ERROR: número incorrecto.");
		
	    }
	}
	}
	