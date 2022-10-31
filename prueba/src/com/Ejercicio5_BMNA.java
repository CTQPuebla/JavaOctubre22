package com;

import java.util.Scanner;

public class Ejercicio5_BMNA {

	public static void main(String[] args) {
		int nota, edad;
		char sexo;
		
		Scanner Dato = new Scanner (System.in);
		
		System.out.println("Ingrese la nota (0-10): ");
		nota = Dato.nextInt();
		System.out.println("Ingrese la edad: ");
		edad = Dato.nextInt();
		System.out.println("Ingrese el sexo: ");
		sexo = Dato.next().charAt(0);
		
		if(nota >= 5 && edad >= 18 && (sexo == 'M' || sexo == 'm')){
			System.out.println("Su solicitud posiblemente sea aceptada");
		} else if (nota >= 5 && edad >= 18 && (sexo == 'F' || sexo == 'f')) {
		
		System.out.println("Su solicitud esta aceptada");

	} else {
		System.out.println("Su solicitud fue rechazada");
	}

}
}
