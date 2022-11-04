/* Hernandez Falcon Jorge Ivan
 * Construir un programa que calcule el �ndice de masa corporal 
 * de una persona (IMC = peso [kg] / altura2 [m]) e indique el 
 * en el que se encuentra esa persona en funci�n del valor de IMC:
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
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: Criterio de ingreso al hospital");
		}else if(imc >=16 && imc <= 17) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: infrapeso");
		}else if(imc >=17 && imc <= 18) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: bajo peso");
		}else if(imc >=18 && imc <= 25) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: peso normal");
		}else if(imc >=25 && imc <= 30) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: sobrepeso");
		}else if(imc >=30 && imc <= 35) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: sobrepeso cr�nico");
		}else if(imc >=35 && imc <= 40) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: obesidad prem�rbida");
		}else if(imc > 40) {
			System.out.println("�ndice de masa corporal: "+ imc + "\n diagn�stico: obesidad m�rbida");
		}
		
	}

}
