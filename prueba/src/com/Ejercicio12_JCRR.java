package com;

import java.util.Scanner;

public class Ejercicio12_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, IMC;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el peso en kg");
		peso = entrada.nextDouble();
		System.out.println("Digite la altura en metros");
		altura = entrada.nextDouble();
		
		IMC = peso/(altura*altura);
		
		if (IMC> 40) {
			System.out.println("Obesidad morbida CUIDADO");
		}else if (IMC<=40 && IMC>=35) {
			System.out.println("Obesidad premorbida AGUAS");
		}else if (IMC<35 && IMC>=30) {
			System.out.println("Sobrepeso cronico");
		}else if (IMC<30 && IMC>=25) {
			System.out.println("Sobrepeso");
		}else if (IMC<25 && IMC>=18) {
			System.out.println("peso normal");
		}else if (IMC<18 && IMC>=17) {
			System.out.println("bajo peso");
		}else if (IMC<17 && IMC>=16) {
			System.out.println("infrapeso");
		}else {
			System.out.println("Criterio de ingreso en hospital");
		}

	}

}
