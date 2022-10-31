package com;

import java.util.Scanner;

public class Ejercicio12JIDH {
	
	public static void main(String[] args) {
		
		double kg;
		double m;
		double imc;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu peso en kg: ");
		kg = lector.nextDouble();
		System.out.println("Introduce tu altura en m: ");
		m = lector.nextDouble();
		
		imc = kg/(m*m);
		
		if(imc < 16) {
			System.out.println("Criterio de ingreso a hospital");
		} else if(16 >= imc && imc < 17) {
			System.out.println("Infrapeso");
		} else if(17 >= imc && imc < 18) {
			System.out.println("Bajo peso");
		} else if(18 >= imc && imc < 25) {
			System.out.println("Peso Normal (Saludable)");
		} else if(25 >= imc && imc < 30) {
			System.out.println("Sobrepeso (Obesidad de grado I)");
		} else if(30 >= imc && imc < 35) {
			System.out.println("Sobrepeso Crónico (Obesidad de grado II)");
		} else if(35 >= imc && imc < 40) {
			System.out.println("Obesidad Premórbida (Obesidad de grado III)");
		} else if(imc > 40) {
			System.out.println("Obesidad Mórbida (Obesidad de grado IV)");
		}
	
	}

}
