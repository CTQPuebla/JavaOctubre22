/* Hernandez Falcon Jorge Ivan
 * Construir un programa que calcule el índice de masa corporal 
 * de una persona (IMC = peso [kg] / altura2 [m]) e indique el 
 * en el que se encuentra esa persona en función del valor de IMC:
 */

package com;

import java.util.Scanner;

public class Ejercicio12HFJI {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double imc, peso, altura;
		System.out.println("Ingrese peso: \n");
		peso = sc.nextDouble();
		
		System.out.println("Ingrese altura: \n");
		altura = sc.nextDouble();
		
		imc = peso/altura;
		
		if(imc<16){
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: Criterio de ingreso al hospital");
		}else if(imc >=16 && imc <= 17) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: infrapeso");
		}else if(imc >=17 && imc <= 18) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: bajo peso");
		}else if(imc >=18 && imc <= 25) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: peso normal");
		}else if(imc >=25 && imc <= 30) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: sobrepeso");
		}else if(imc >=30 && imc <= 35) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: sobrepeso crónico");
		}else if(imc >=35 && imc <= 40) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: obesidad premórbida");
		}else if(imc > 40) {
			System.out.println("Índice de masa corporal: "+ imc + "\n diagnóstico: obesidad mórbida");
		}
		
	}

}
