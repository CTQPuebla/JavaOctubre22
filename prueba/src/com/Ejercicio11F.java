package com;

import java.util.Scanner;

public class Ejercicio11F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in); 
		int lugar, peso;
		float costo,total;
		
		System.out.println("1. America del norte\n"+"2. America central\n"+"3. America del sur\n"+"4. Europa\n"+"5. Asia");
		System.out.print("selecciona la zona para enviar su paquete: ");
		lugar=entrada.nextInt();
		entrada.nextLine();
		
		if(lugar>=1 && lugar<=5) {
			switch(lugar) {
			case 1:
				System.out.println("su paquete se enviara a America del norte, ingresa el peso del paquete:");
				System.out.print("ingresa el peso del paquete ");
				peso=entrada.nextInt();
				if(peso >=1 && peso<=5) {
					total=peso*24;
					System.out.println("el total a pagar es : "+ total+" Euros");
				}else {
					System.out.println("Rechazada por exceso de peso");
				}
				break;
			case 2:
				System.out.print("su paquete se enviara a America central, ingresa el peso del paquete:");
				peso=entrada.nextInt();
				if(peso >=1 && peso<=5) {
					total=peso*20;
					System.out.println("el total a pagar es : "+ total+" Euros");
				}else {
					System.out.println("Rechazada por exceso de peso");
				}
				break;
			case 3:
				System.out.print("su paquete se enviara a America del sur, ingresa el peso del paquete:");
				peso=entrada.nextInt();
				if(peso >=1 && peso<=5) {
					total=peso*21;
					System.out.println("el total a pagar es : "+ total+" Euros");
				}else {
					System.out.println("Rechazada por exceso de peso");
				}
				break;
			case 4:
				System.out.print("su paquete se enviara a Europa, ingresa el peso del paquete:");
				peso=entrada.nextInt();
				if(peso >=1 && peso<=5) {
					total=peso*10;
					System.out.println("el total a pagar es : "+ total+" Euros");
				}else {
					System.out.println("Rechazada por exceso de peso");
				}
				break;
			case 5:
				System.out.print("su paquete se enviara a Asia, ingresa el peso del paquete:");
				peso=entrada.nextInt();
				if(peso >=1 && peso<=5) {
					total=peso*18;
					System.out.println("el total a pagar es : "+ total+" Euros");
				}else {
					System.out.println("Rechazada por exceso de peso");
				}
				break;
			
			}
			
			
		}else {
			System.out.println("opcion no valida");
		}
	
	

	}

}
