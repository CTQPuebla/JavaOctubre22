package com;

import java.util.Scanner;

public class Ejercicio12cba {
	public static void main(String[] args) {
		
		//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e 
		//indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		Double peso;
		Double altura;
		Scanner lector = new Scanner(System.in);
		System.out.println("introdusca peso");
		peso = lector.nextDouble();
		lector.nextLine();
		System.out.println("ingresar altura");
		altura = lector.nextDouble();
		
		
		if ((peso / (altura*altura)) < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if ((peso / (altura*altura)) <= 17 && (peso / (altura*altura)) >= 16) {
			System.out.println("infrapeso");
		}else if ((peso / (altura*altura)) <= 18 && (peso / (altura*altura)) >= 17) {
			System.out.println("bajo peso");
		}else if ((peso / (altura*altura)) <= 25 && (peso / (altura*altura)) >= 18) {
			System.out.println("peso normal");
		}else if ((peso / (altura*altura)) <= 30 && (peso / (altura*altura)) >= 25) {
			System.out.println("sobrepeso");
		}else if ((peso / (altura*altura)) <= 35 && (peso / (altura*altura)) >= 30) {
			System.out.println("sobrepeso cronico");
		}else if ((peso / (altura*altura)) <= 40 && (peso / (altura*altura)) >= 35) {
			System.out.println("obesidad premorbida");
		}else {
			System.out.println("obesidad morbida");
		}
		
		
		
	}//fin main
	
}//fin
