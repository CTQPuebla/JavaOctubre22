package com;

import java.util.Scanner;

public class Ejercicio11_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zona;
		double peso;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el peso de su paquete en kg");
		peso = entrada.nextDouble();
		System.out.println("Digite la zona de envio\n 1.-America del norte\n 2.-America central \n 3.-America del sur \n 4.- Europa \n 5.-Asia");
		zona = entrada.nextInt();
		
		if (peso > 5) {
			System.out.println("Lo sentimos nuestra política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad. ");
		} else if(zona==1) {
			System.out.println("Por el peso de su paquete y la zona el costo de su servicio es "+ (peso*24) + " euros" );
		}
		else if(zona==2) {
			System.out.println("Por el peso de su paquete y la zona el costo de su servicio es "+ (peso*20) + " euros" );
		}
		else if(zona==3) {
			System.out.println("Por el peso de su paquete y la zona el costo de su servicio es "+ (peso*21) + " euros" );
		}else if(zona==4) {
			System.out.println("Por el peso de su paquete y la zona el costo de su servicio es "+ (peso*10) + " euros" );
		}else if(zona==5) {
			System.out.println("Por el peso de su paquete y la zona el costo de su servicio es "+ (peso*18) + " euros" );
		}

	}

}
