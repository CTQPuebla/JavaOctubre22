package com;

import java.util.Scanner;

public class Ejercicio9DSL {
public static void main(String[]args) {
	
	Scanner scanner = new Scanner(System.in);
    int dia;
// Solicitud de datos al usuario
    System.out.println("El programa te devuelve el d�a de la semana, seleccionando el numero del dia:");
    System.out.println("1.-LUNES");
    System.out.println("2.- MARTES");
    System.out.println("3.- MIERCOLES");
    System.out.println("4.- JUEVES");
    System.out.println("5.- VIERNES");
    
    dia = scanner.nextInt();
// Ingresamos el numero del dia
    switch (dia) {
    case 1:
        System.out.println("El d�a seleccionado es LUNES");
     break;
   case 2:
      System.out.println("El d�a seleccionado es MARTES");
       break;
     case 3:
       System.out.println("El d�a seleccionado es MI�RCOLES");
     break;
     case 4:
       System.out.println("El d�a seleccionado es JUEVES");
     break;
    case 5:
      System.out.println("El d�a seleccionado es VIERNES");
       break;
   case 6:
      System.out.println("El d�a seleccionado es S�BADO");
     break;
       case 7:
     System.out.println("El d�a seleccionado es DOMINGO");
        break;
    default:
    	//En caso de ingresar un numero mayor a 7 o menor a 1 se mostrara un error
      System.out.println("ERROR: n�mero incorrecto.");
	
    }
}
}

