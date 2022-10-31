package com;

import java.util.Scanner;

public class Ejercicio2ARNR {
	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero ");
		x = sc.nextInt();
		
		if(x%2==0){
			System.out.print("par");
		}
			else {
				System.out.print("inpar");
			}
		
		
		
	}

}
