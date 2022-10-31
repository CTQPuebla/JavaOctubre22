package com;

import java.util.Scanner;

public class Ejercicio14_JIDH {

	public static void main(String[] args) {
		int horas,salario;
		
		
		Scanner Horas = new Scanner (System.in);
		
		System.out.println("Indique las horas de trabajo: ");
		horas = Horas.nextInt();
		
		if(horas <= 40) {
			salario = horas * 16;
			System.out.println("La paga será de " + (salario));
		} else if (horas > 40) {
			
			System.out.println("La paga será de "+ (640 + ((horas-40))*20));
			
		}

	}

}