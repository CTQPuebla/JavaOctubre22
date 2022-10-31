package com;

import java.util.Scanner;

public class Ejercicio3JABR {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		 Scanner lector=new Scanner(System.in);
		 System.out.println("Ingresa un valor");
		 numero1=lector.nextInt();
		 System.out.println("Ingresa otro valor");
		 numero2=lector.nextInt();
		 if (numero2==0) {
			 System.out.println("Error de división");
		 }else
		 System.out.println("El resultado de la división del primero entre el segundo es " + numero1/numero2);

	}

}
