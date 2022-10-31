package com;

import java.util.Scanner;

public class Ejercicio12JABR {

	public static void main(String[] args) {
		
		double imc;
		double peso;
		double altura;
		String estado="";
		
		Scanner lector=new Scanner (System.in);
		System.out.println("Introduzca su peso en Kg");
		peso=lector.nextDouble();
		System.out.println("Introduzca su altura en m");
		altura=lector.nextDouble();
		imc=peso/(altura*altura);
		System.out.println("Su IMC es " + imc);
		if (imc<16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc>15 && imc<18) {
			System.out.println("Infrapeso");
		}else if (imc>16 && imc<19) {
			System.out.println("Bajo peso");
		}else if (imc>17 && imc<26) {
			System.out.println("Peso normal o saludable");
		}else if (imc>24 && imc<31) {
			System.out.println("Obesidad grado I");
		}else if (imc>29 && imc<36) {
			System.out.println("Obesidad grado II");
		}else if (imc>34 && imc<41) {
			System.out.println("Obesidad grado III");
		}else if (imc>40) {
			System.out.println("Obesidad Mórbida grado IV");
		}
		}
		
	}

