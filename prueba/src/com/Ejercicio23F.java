package com;

import java.util.Scanner;

public class Ejercicio23F {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int num1, num2;

       
        
            System.out.print("Introduce un n�mero : ");
            num1 =entrada.nextInt();
            System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
            num2 =entrada.nextInt();
            if (num1>= num2) {
                System.out.println("El segundo n�mero debe ser mayor que el primero"); 
                
            }while (num1 >= num2);
             System.out.println("\nN�meros pares desde " +num1+ " hasta " +num2+ " : ");
             for (int i = num1; i <= num2; i++) {
             if (i % 2 == 0) {
                System.out.println(i);
             }
        }

	}

}
