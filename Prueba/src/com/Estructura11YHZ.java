package com;

import java.util.Scanner;

public class Estructura11YHZ {

	public static void main(String[] args) {
		
		int ancho=0;
		int alto=0;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el ancho: ");
		ancho = lector.nextInt();
		System.out.println("Ingresa lo alto: ");
		alto = lector.nextInt();
		
		for(int y=1;y<=alto;y++) {
			for(int i=1;i<=ancho;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		}
		

	}
