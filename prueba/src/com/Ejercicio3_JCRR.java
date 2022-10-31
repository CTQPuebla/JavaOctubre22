package com;

import java.util.Scanner;

public class Ejercicio3_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero1, numero2;
		double resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dos numeros para decirte el resultado");
		numero1= entrada.nextDouble();
		numero2=entrada.nextDouble();
		
		
		if (numero2 == 0) {
			System.out.println("Error.- El numerador es de valor 0");
		}else {
			resultado=numero1/numero2;
			System.out.println("El resultado de la division es " + resultado );
		}
	

	}

}
