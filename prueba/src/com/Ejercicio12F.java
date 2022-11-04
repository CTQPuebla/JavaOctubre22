package com;

import java.util.Scanner;

public class Ejercicio12F {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float peso, altura, persona;

		System.out.print("ingrese su peso: ");
		peso = entrada.nextFloat();
		entrada.nextLine();
		System.out.print("ingerse su altura: ");
		altura = entrada.nextFloat();
		entrada.nextLine();
		persona=peso/(altura*altura);
		
		if (persona < 16) {
			System.out.println("Dianostico: Criterio de ingreso a hospital");
		} else if (persona >= 16 && persona <= 17) {
			System.out.println("Dianostico: Infrapeso");
		} else if (persona >= 17 && persona <= 18) {
			System.out.println("Dianostico: Bajo peso");
		} else if (persona >= 18 && persona <= 25) {
			System.out.println("Dianostico: Peso normal(SALUDABLE)");
		} else if (persona >= 25 && persona <= 30) {
			System.out.println("Dianostico: Sobrepeso(Obesidad de grado I)");
		} else if (persona >= 30 && persona <= 35) {
			System.out.println("Dianostico: Sobrepeso Cronico (Obesidad de grado II)");
		} else if (persona >= 35 && persona <= 40) {
			System.out.println("Dianostico: Sobrepeso Cronico (Obesidad de grado III)");
		} else if (persona >= 40) {
			System.out.println("Dianostico: Obesidad morbida (Obesidad de grado IV)");
		}

	}

}
