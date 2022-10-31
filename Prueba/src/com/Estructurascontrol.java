package com;

import java.util.Scanner;

public class Estructurascontrol {
	public static void main(String[] args) {
		//estruccturas de decicion - valores booleanos
		Scanner entrada = new Scanner(System.in);
		int x=11, d=6;
		String m="12 de diciembre del 2022";
		
		if (x<10) {
			System.out.println("es menor");
		}
		else {
			System.out.println("es mayor o igual");
		}
		
		if (m.length()<15) {
			System.out.println("es menor que 15");
		} else {
			System.out.println("es mayor o igual a 15");
		}
		
		// AND OR NOT
		// and
		if (m.length()<15 && x>7 && m.equals("12 de dic")) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		// or
		if (m.length()<15 || x>7 || m.equals("12 de dic")) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		// not 
		if (!(m.length()<15 || x>7 || m.equals("12 de dic"))) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		
		// concatenar estructuras if
		if (d==1) {
			System.out.println("Lunes");
		} else if (d==2) {
			System.out.println("Martes");
		} else if (d==3) {
			System.out.println("Miercoles");
		} else if (d==4) {
			System.out.println("Jueves");
		} else if (d==5) {
			System.out.println("Viernes");
		} else if (d==6) {
			System.out.println("Sabado");
		} else if (d==7) {
			System.out.println("Domingo");
		} else {
			System.out.println("No hay más dias de la semana");
		}
		
		// estructura switch case
		 switch (d) {
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
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
		 
		 
	}//cierre main

}//cierre class
