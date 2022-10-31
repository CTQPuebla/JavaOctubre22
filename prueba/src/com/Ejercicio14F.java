package com;

import java.util.Scanner;

public class Ejercicio14F {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int horasex, horasTrab,pago;
		System.out.print("ingresa las horas trabajadas cemanalmente: ");
		horasTrab=entrada.nextInt();
		entrada.nextLine();
		
		if(horasTrab<=40) {
			pago=16*horasTrab;
			System.out.print("sueldo cemanal: "+pago);
		}else {
			horasex=horasTrab-40;
			pago=(horasex*20)+(40*16);
			System.out.print("sueldo cemanal: "+pago);
		}
		
	}

}
