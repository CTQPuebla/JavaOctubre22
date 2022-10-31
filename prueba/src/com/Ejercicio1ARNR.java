package com;

import java.util.Scanner;

public class Ejercicio1ARNR {
	public static void main(String[] args) {
     
	int q;
	int w;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("ingrese un numero 1: ");
	q = sc.nextInt();
	
	System.out.print("ingrese un numero 2:");
	w = sc.nextInt();
	
	if(q==w) {
		System.out.println("son iguales");
		} else if(q>w) {
			System.out.println("numero 1 es mayor");}
		else {
			System.out.println("numero 2 es mayor");
		}
	}
		
	}

