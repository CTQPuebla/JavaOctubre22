/*
Jorge Ivan Hernandez Falcon
1.-Realiza un programa que reciba dos números 
por teclado e indique cuál es mayor o si son iguales.
*/

package com;

import java.util.Scanner;

public class Ejercicio1HFJI {
	public static void main (String[] args) {
		
int u;
int d;
Scanner lector = new Scanner(System.in);
System.out.println("Ingresa un valor");
u = lector.nextInt();
lector.nextLine();
System.out.println("Ingresa  otro valor");
d = lector.nextInt();


if (u>d) {
	System.out.println( u + " Es mayor que: " +  d);
}
else if(d>u) {
	System.out.println( d + " Es mayor que: " +  u);
}
else if (u == d) {
	System.out.println("Los numeros ingresados son iguales");
    }
   }
  }
