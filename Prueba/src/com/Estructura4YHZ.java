package com;

import java.util.Scanner;

public class Estructura4YHZ {

	public static void main(String[] args) {
		String cadena;
		String letra;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa una frase: ");
		cadena = lector.nextLine();
		
		System.out.println("Ingresa la letra a buscar: ");
		letra = lector.nextLine();
		
		int ini=0;
		int fin = cadena.length()-1;
		int r=0;
		
		while (ini<=fin) {
				if (cadena.charAt(ini)==letra.charAt(0)) {
					r =r +1;
				}
				ini ++;
				

		}
		
		if (r>0) {
			System.out.println(r+" veces encontrado");
		}else{
			System.out.println("Caracter no enconrado");
		}


	}
	

}
