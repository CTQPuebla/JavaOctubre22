package com;

import java.util.Scanner;

public class Ejercicio12UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double p,a,imc;
		System.out.print("Indique su peso en kilogramos: ");
		p = Double.parseDouble(entrada.next());
		if (p<=0) {
			System.out.print("Vuelva a indicar su peso en kilogramos: ");
			p = Double.parseDouble(entrada.next());
		}
		System.out.print("Indiqie su altura en metros: ");
		a = Double.parseDouble(entrada.next());
		if (a<=0) {
			System.out.print("Vuelva a indicar su altura en : ");
			a = Double.parseDouble(entrada.next());
		}
		imc = p/(a*a);
		if (imc<16) {
			System.out.println("IMC es de "+imc+" para valorar en un hospital");
		} else if (imc>=16 && imc<17) {
			System.out.println("IMC es de "+imc+" e indica infrapeso");
		} else if (imc>=17 && imc<18) {
			System.out.println("IMC es de "+imc+" e indica bajo peso");
		} else if (imc>=18 && imc<25) {
			System.out.println("IMC es de "+imc+" e indica peso normal(saludable)");
		} else if (imc>=25 && imc<30) {
			System.out.println("IMC es de "+imc+" e indica sobrepeso(obesidad de grado I)");
		} else if (imc>=30 && imc<35) {
			System.out.println("IMC es de "+imc+" e indica sobrepeso crónico(obesidad de grado II)");
		} else if (imc>=35 && imc<40) {
			System.out.println("IMC es de "+imc+" e indica obesidad premórbida(obesidad de grado III)");
		} else {
			System.out.println("IMC es de "+imc+" e indica obesidad mórbida(obesidad de grado IV)");
		}
	}
}
