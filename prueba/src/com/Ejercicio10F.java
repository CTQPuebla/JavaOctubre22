package com;

import java.util.Scanner;

public class Ejercicio10F {

	public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
		
		int mes;
		System.out.print("ingresa un numero del 1 al 12 indicando los MESES deL AÑO:");
		mes=entrada.nextInt();
		entrada.nextLine();
		
		if(mes>=1 && mes<=12) {
			
			switch(mes) {
			case 1:
				System.out.println("Enero tiene 31 dias");
				break;
			case 2:
				System.out.println("Febrero tine 28 dias");
				break;
			case 3:
				System.out.println("Marzo tinen 31 dias");
				break;
			case 4:
				System.out.println("Abril tine 30 dias");
				break;
			case 5:
				System.out.println("Mayo tiene 31 dias");
				break;
			case 6:
				System.out.println("Junio tiene 30 dias");
				break;
			case 7:
				System.out.println("Julio tinen 31 dias");
				break;
			case 8:
				System.out.println("Agosto tinen 31 dias");
				break;
			case 9:
				System.out.println("Septiembre tine 30 dias");
				break;
			case 10:
				System.out.println("Octubre tiene 31 dias");
				break;
			case 11:
				System.out.println("Noviembre tiene 30 dias");
				break;
			case 12:
				System.out.println("Diciembre tiene 31 dias");
				break;
			
			default:
				
			
			}
			
		}else {
			System.out.println("ERROR");
		}
			
		



	}

}
