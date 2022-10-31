package com;

import java.util.Scanner;

public class Ejercicio12_BMNA {

	public static void main(String[] args) {
		
		float peso, estatura, IMC;
		
		Scanner Datos = new Scanner (System.in);
		
		System.out.println("Indique su estatura: ");
		estatura = Datos.nextFloat();
		System.out.println("Indique su peso: ");
		peso = Datos.nextFloat();
		
		IMC=(peso/(estatura*estatura));
		
		if (IMC <16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if (IMC >= 16 && IMC < 17) {
			System.out.println("Infrapeso");
		} else if (IMC >= 17 && IMC < 18) {
			System.out.println("Bajo peso ");
		} else if (IMC >= 18 && IMC < 25) {
			System.out.println("Peso normal");
		}else if (IMC >= 25 && IMC < 30) {
			System.out.println("Sobrepeso ");
		}else if (IMC >= 30 && IMC < 35) {
			System.out.println("Sobrepeso cronico");
		}else if (IMC >= 35 && IMC < 40) {
			System.out.println("Obesidad premorbida");
		}else if (IMC >= 40) {
			System.out.println("Obesidad morbida");
		}
		

	}

}
