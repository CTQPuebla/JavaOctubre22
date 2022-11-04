package com;

import java.util.Scanner;

public class Ejercicio5F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int edad,nota;
		String sexo;
		System.out.print("ingresar Nota: ");
		nota=entrada.nextInt();
		entrada.nextLine();
		System.out.print("ingresa la edad: ");
		edad=entrada.nextInt();
		entrada.nextLine();
		System.out.print("ingresa el sexo con letra mayuscula: ");
		sexo=entrada.nextLine();
		entrada.nextLine();
		
		if(nota>=5  && edad>=18 && sexo.equals("M")) {
			System.out.print("su solicitud es POSIBLE");
		}else if(nota>=5 && edad>=18 && sexo.equals("F")) {
			System.out.print("su solicitud es ACEPTADA");
		}else {
			System.out.print("su solicitud es NO ACEPTADA");
		
		}	
	}

}
