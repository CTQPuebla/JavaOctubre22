package com;

import java.util.Scanner;

public class Ejercicio6DSL {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
		    int kilos;
		    double precioInicial;
		    String tipo;
		    int tamano;
		// Pedir ingresar datos al usuario
		    
		     System.out.print("Introduce los Kg. de uva entregada: ");
		    kilos = scanner.nextInt();
		     System.out.print("Precio por Kg. inicial: ");
		    precioInicial = scanner.nextDouble();
		     System.out.print("Uva de valor \"A\" � \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		     System.out.print("Tipo de uva \"1\" � \"2\": ");
		    tamano = scanner.nextInt();
		// Se realizan calculos mediante las condiciones pedidas
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamano == 1 || tamano == 2))) {
		      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
		    } else {
		    	
		      if (tipo.toUpperCase().equals("A") && tamano == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } 
		      else if (tipo.toUpperCase().equals("A") && tamano == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } 
		      
		       else if (tipo.toUpperCase().equals("B") && tamano == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } 
		       else if (tipo.toUpperCase().equals("B") && tamano == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		  }
		
	}
