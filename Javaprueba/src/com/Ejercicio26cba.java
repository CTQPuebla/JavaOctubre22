package com;

import java.text.BreakIterator;
import java.util.Scanner;

public class Ejercicio26cba {
	public static void main(String[] args) {
		
		//Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea 
		//superior a 25.
		
		 int Edad;
		 int Suma = 0;
		 int Contador = 0;
		 int Promedio=0;
		  
		 Scanner lector=new Scanner(System.in);
		  do {
		   System.out.println("Ingrese edad");
		   Edad=lector.nextInt();
		   Suma=Suma+Edad;
		   Contador=Contador+1;
		   Promedio=Suma/Contador;
		  System.out.println("El promedio es " +Promedio);
		   if (Promedio>25) {
		   break;
		  }
		   
		  } while (Edad>0);
		  System.out.println("LA suma de edades = " + Suma    + " Edades ingresadas: "+ Contador);
		  System.out.println("Promedio = "+Promedio);
		  if (Promedio>25) {
		   System.out.println("El promedio ha superado 25");
		  }
		
	}//fin main
}//fin
