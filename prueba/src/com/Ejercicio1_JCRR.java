package com;

import java.util.Scanner;

public class Ejercicio1_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dos numeros para decirte el resultado");
		numero1= entrada.nextInt();
		numero2=entrada.nextInt();
		
		if (numero1> numero2) {
			
			System.out.println("El numero "+ numero1 + " es mayor que "+ numero2);
			
		}else if(numero1==numero2){
			
			System.out.println("los numeros que digitaste son iguales");
			
		}else{
			
			System.out.println("El numero "+ numero2 + " es mayor que "+ numero1);
		}
		

	}

}
