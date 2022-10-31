package com;

import java.util.Scanner;

public class Ejercicio9F {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int dia;
		System.out.print("ingresa un numero del 1 al 7 indicando los dias de la cemana:");
		dia=entrada.nextInt();
		entrada.nextLine();
		
		if(dia>=1 && dia<=7) {
			
			switch(dia) {
			case 1:
				System.out.println("DOMINGO");
				break;
			case 2:
				System.out.println("LUNES");
				break;
			case 3:
				System.out.println("MARTES");
				break;
			case 4:
				System.out.println("MIERCOLES");
				break;
			case 5:
				System.out.println("JUEVES");
				break;
			case 6:
				System.out.println("VIERNES");
				break;
			case 7:
				System.out.println("SABADO");
				break;
			default:
				
			
			}
			
		}else {
			System.out.println("ERROR");
		}
			
		

	}

}
