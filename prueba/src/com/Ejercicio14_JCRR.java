package com;

import java.util.Scanner;

public class Ejercicio14_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas;
		int pago;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite las horas que trabajo esta semana");
		horas = entrada.nextInt();
		
		if (horas <= 40) {
			System.out.println("Ya que trabajo menos o igual a 40 horas su sueldo es de $" + horas*16);
			
		}else {
			pago = 640 +((horas-40)*20); 
			System.out.println("Sus total por trabajar mas horas es de $" + pago);
		}
		
				

	}

}
