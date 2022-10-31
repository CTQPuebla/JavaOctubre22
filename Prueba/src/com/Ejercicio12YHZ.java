package com;

import java.util.Scanner;

public class Ejercicio12YHZ {

	public static void main(String[] args) {
		float peso;
		float altura;
		float imc;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Intrudusca su peso (KG): ");
		peso = lector.nextFloat();
		System.out.println("Intrudusca su altura (M): ");
		altura = lector.nextFloat();
		
		imc = peso / altura;
		System.out.println(imc);
		
		if (imc <16) {
			System.out.println("El diagnostico es Criterio de ingreso al hospital");
		}else if(imc <17 && imc >16) {
			System.out.println("El diagnostico es Criterio infrapeso");
		}else if(imc <18 && imc >17) {
			System.out.println("El diagnostico es Criterio bajo peso");
		}else if(imc <25 && imc >18) {
			System.out.println("El diagnostico es Criterio peso normal (saludable)");
		}else if(imc <30 && imc >25) {
			System.out.println("El diagnostico es Criterio sobrepeso");
		}else if(imc <40 && imc >35) {
			System.out.println("El diagnostico es Criterio obesidad premorbida");
		}else if(imc >40) {
			System.out.println("El diagnostico es Criterio obesidad morbida");
		}else {
			System.out.println("Error");
		}
		
		
		
		

	}

}
