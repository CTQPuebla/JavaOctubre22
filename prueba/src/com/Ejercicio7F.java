package com;

import java.util.Scanner;

public class Ejercicio7F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int alumnos, PagoCompañia;
		 
		System.out.print("ingrese la cantidad de alumnos: ");
		alumnos=entrada.nextInt();
		entrada.nextLine();
		
		if(alumnos >=100 ) {
			PagoCompañia=alumnos*65;
			System.out.println("pago de la compañia de autobuses es de : "+ PagoCompañia);
			System.out.print("pago por alumno es de: 65 ");
			
		}else if(alumnos>=50 && alumnos <=99) {
			PagoCompañia=alumnos*70;
			System.out.println("pago de la compañia de autobuses es de : "+ PagoCompañia);
			System.out.print("pago por alumno es de: 70 ");
			
		}else if(alumnos >=30 && alumnos <=49) {
			PagoCompañia=alumnos*95;
			System.out.println("pago de la compañia de autobuses es de : "+ PagoCompañia);
			System.out.print("pago por alumno es de: 95 ");
			
		}else {
			System.out.println("pago de la compañia de autobuses es de : 4000");
			System.out.print("pago por alumno : "+4000/alumnos);
		}
	
		
		
		

	}

}
