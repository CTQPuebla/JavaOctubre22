/* Hernandez Falcon Jorge Ivan
10. Programa que lea 20 números e indique si son 
positivos o negativos y pares o impares y ademas muestre la 
sumatoria de los positivos y sumatoria de los impares.
*/

package com;

import java.util.Scanner;

public class Ejerciciociclico_10HFJI {
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int contador=0;
			int num=0;
			int sumP=0;
			int sumImpar=0;
			
			while(contador<20) {
				System.out.println("Ingresa un numero");
				num=s.nextInt();
				
				if(num<0) {
					System.out.println("Negativo");
					
				}else {
					System.out.println("Positivo");
					sumP=sumP+num;
				}
				if(num%2==0) {
					System.out.println("es par");
				}else {
					System.out.println("no es par");
					sumImpar=sumImpar + num;
				}
				contador++;
				}
			}
		}