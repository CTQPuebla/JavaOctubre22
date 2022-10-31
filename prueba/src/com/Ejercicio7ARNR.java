package com;

import java.util.Scanner;

public class Ejercicio7ARNR {
public static void main(String[] args) {
	
	int alumnos;
	double costo;
	double pago;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Numero de alumnos");
	alumnos = sc.nextInt();
	sc.nextLine();
	
	if(alumnos>=100) {
		costo = 65;
		
	}else if(alumnos>=50 && alumnos<=99) {
		costo = 70;
	}else if(alumnos>=30 && alumnos<=49) {
		costo = 95;
	}
	pago= 4000;
	costo = pago/alumnos;
	System.out.println("valor de costo por alumno " +costo);
		
	}
	
	
}

