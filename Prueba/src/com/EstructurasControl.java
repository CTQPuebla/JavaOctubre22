package com;

import java.util.Scanner;

public class EstructurasControl {
	
	public static void main(String[] args) {
		
		//Estructuras de desicion - valores boolean
		
		int x = 4;
		int xx =30;
		
		if(x<10) {
			System.out.println("Es menor");
		}
		
			else {
				System.out.println("Es mayor");
			}
		
		String m = "25 de octubre de 2022";
		
		System.out.println(m.length());
		if(m.length()<15) {
			System.out.println("si");
		}
		else {
			System.out.println("No");
		}
		
		// and
		if(m.length()<30 && xx>10 && m.equals("25 de octubre de 2022")) {
			System.out.println("si");
		}
		else {
			System.out.println("No");
		}
		
		
		// or y not
				if(!(m.length()<5 || xx>35 || m.equals("25 de octubre de 2022"))) {
					System.out.println("si");
				}
				else {
					System.out.println("No");
				}
				
				// compacaion de objetos  
				if("yiram".equals(m)) {
					System.out.println("si");
				}
				else {
					System.out.println("No");
				}
				
				// if anidado
				int d =7;
				if(d == 1) {
					System.out.println("Lunes");
				}
				else if( d ==2) {
					System.out.println("Martes");
				}
				else if( d ==3) {
					System.out.println("Miercoles");
				}
				else if( d ==4) {
					System.out.println("Jueves");
				}
				else if( d ==5) {
					System.out.println("Viernes");
				}
				else if( d ==6) {
					System.out.println("Sabado");
				}
			
				
		// switch
				int di = 5;
				
				switch(di) {
				case 1: 
					System.out.println("Lunes");
					break;
				case 2:
					System.out.println("Martes");
					break;
				case 3:
					System.out.println("Miercoles");
					break;
				case 4:
					System.out.println("Jueves");
					break;
				case 5:
					System.out.println("Viernes");
					break;
				default:
					System.out.println("Desconocido");
				}
				
				
				//Leer valores desde teclado
				
				int p = 20;
				String y;
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Ingresa un valor:");
				p = p + lector.nextInt();
				lector.nextLine();
				System.out.println("Ingresa el texto: ");
				y = lector.nextLine();
				
				System.out.println("Valor: "+p);
				System.out.println("valor: "+y);

		
	}

}
