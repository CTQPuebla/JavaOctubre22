package com;

import java.util.Scanner;

public class Ejercicio25F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int ancho,alto;
		
		System.out.print("ingrese un numro a lo largo: ");
		ancho=entrada.nextInt();
		entrada.nextLine();
		System.out.print("ingresa un numero a lo ancho:");
		alto=entrada.nextInt();
		
		
		for(int i=1; i<ancho+1;i++) {
			System.out.print(" * ");
            for(int k=0;k<alto-1; k++){
                System.out.print(" * ");
            }
  		
		}
		
		
	}

}
