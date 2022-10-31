package com;

import java.util.Scanner;

public class Ejercicio3ARNR {
	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.-ingrese numero: ");
		x = sc.nextInt();
		
		System.out.print("2.-ingrese numero: ");
		y = sc.nextInt();
		
		z = x/y;
		System.out.print("resultado: " + z);
		
		if(y==0) {
			System.out.println("error");
			
		}
			
		
		
		
		
	}

}
