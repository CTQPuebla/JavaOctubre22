package com;

import java.util.Scanner;

public class Ejercicio13JABR {

	public static void main(String[] args) {
		
		int dona;
		
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduce el monto de la donación");
		dona=lector.nextInt();
		if (dona>=10000) {
			System.out.println("Centro de salud: " + (dona*.3) + "Comedor: " + (dona*.5) + "Bolsa: " + (dona*.2) );
		}else if (dona<10000) {
			System.out.println("Centro de salud: " + (dona*.25) + "Comedor: " + (dona*.6) + "Bolsa: " + (dona*.15));
		}
			

	}

}
