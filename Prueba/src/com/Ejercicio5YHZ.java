package com;

import java.util.Scanner;

public class Ejercicio5YHZ {

	public static void main(String[] args) {
		int nota;
		int edad;
		String sexo;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa la nota");
		nota = lector.nextInt();
		System.out.println("Ingresa la edad");
		edad = lector.nextInt();
		lector.nextLine();
		System.out.println("Ingresa el sexo:");
		sexo = lector.nextLine();
		System.out.println(sexo);
		
		if (nota >=5 && edad >= 18 && sexo.equals("M"))
		{
			System.out.println("POSIBLE");
		}
		else if(nota >=5 && edad >= 18 && sexo.equals("F")){
			System.out.println("ACEPTADA");
			
		}else {
			System.out.println("NO ACEPTADA");
		}

	}

}
