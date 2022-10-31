package com;

import java.util.Scanner;

public class Ejercicio2DSL {
	public static void main(String[]args) {
	Scanner scanner = new Scanner (System.in);
    int numero;
// Solicitud de datos al usuario
    
    System.out.print("Introduce el número: ");
    numero = scanner.nextInt();
    
// Valor ingresador del usuario que pueda ser dividido entre 2 y que sea diferente de 0
    if (numero % 2 == 0){
        System.out.println("El número, " +numero + " es par.");
        //En dado caso de no cumplir con la condiciones el numero es impar
    }else {
        System.out.println("El número " +numero + " es impar.");
    }  
  }
}
	


