package com;

import java.util.Scanner;

public class Ejercicio6JABR {

	public static void main(String[] args) {
		
		String uva="";
		int t;
		int pr;
		int A1=20;
		int A2=30;
		int B1=-30;
		int B2=-50;
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce un tipo A/B");
		uva=lector.nextLine();
		System.out.println("Introduce un tamaño 1/2");
		t=lector.nextInt();
		System.out.println("Introduce precio inicial");
		pr=lector.nextInt();
		if (uva.equals("A")&&t==1) {
			System.out.println("El precio final es " + (pr+A1));
		}else if (uva.equals("A")&&t==2) {
			System.out.println("El precio final es " + (pr+A2));
		}else if (uva.equals("B")&&t==1) {
			System.out.println("El precio final es " + (pr+B1));
		}else if (uva.equals("B")&&t==2) {
			System.out.println("El precio final es " + (pr+B2));
		}
		
		}

	} 


