package com;

import java.util.Scanner;

public class Ejercicio1YHZ {
	
	public static void main(String[] args) {
	
	int x;
	int y;
	String z;
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Ingresa el primer numero");
	x = lector.nextInt();
	System.out.println("Ingresa el segundo numero");
	y = lector.nextInt();
	
	if (x>y) {
		System.out.println(x +" Es mayor");
		
	}else if(x<y) {
		System.out.println(y +" Es mayor");
	}
	else {
		System.out.println("Son iguales");
	}
	
	}
}
