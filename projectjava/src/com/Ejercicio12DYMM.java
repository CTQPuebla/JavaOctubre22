package com;

import java.util.Scanner;

public class Ejercicio12DYMM {

	public static void main(String[] args) {
		
		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] 
		// altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		double peso;
		double altura;
		double ind;
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Introduzca su peso en kg");
		peso = lector.nextDouble();
		System.out.println("Introduzca su altura en m");
		altura = lector.nextDouble();
		ind = peso /(altura*altura);
		
		if(ind<16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if (ind>= 16 && ind <= 17) {
			System.out.println("infrapeso");
		} else if (ind> 17 && ind <= 18) {
			System.out.println("bajo peso");
		} else if (ind> 18 && ind <= 25) {
			System.out.println("peso normal");
		} else if (ind> 25 && ind <= 30) {
			System.out.println("sobrepeso 'obsesidad grado I'");
		} else if (ind> 30 && ind <= 35) {
			System.out.println("sobrepeso crónico 'obsesidad grado II' ");
		} else if (ind> 35 && ind <= 40) {
			System.out.println("obesidad permórbida 'obsesidad grado III' ");
		} else if (ind> 40) {
			System.out.println("obesidad mórbida 'obsesidad grado III' ");
		}		
		
	}
	
}
