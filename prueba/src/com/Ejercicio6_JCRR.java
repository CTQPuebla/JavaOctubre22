package com;

import java.util.Scanner;

public class Ejercicio6_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo;
		int tama�o;
		double precio;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Cual es el precio inicial del kilo de uva?");
		precio = entrada.nextDouble();
		System.out.println("Cual es el tipo de uva (A o B)");
		entrada.nextLine();
		tipo = entrada.nextLine();
		System.out.println("Cual es el tama�o de la uva (1 o 2)");
		tama�o = entrada.nextInt();
		
		if(tipo.equalsIgnoreCase("a") && tama�o == 1) {
			System.out.println("El precio por kilo de la uva de tipo A y tamana�o 1 seria de "+ (precio+0.20));
		}else if(tipo.equalsIgnoreCase("a") && tama�o == 2) {
			System.out.println("El precio por kilo de la uva de tipo A y tama�o 2 seria de "+ (precio+0.30));
		}else if(tipo.equalsIgnoreCase("b") && tama�o == 1) {
			System.out.println("El precio por kilo de la uva de tipo B y tama�o 1 seria de "+ (precio-0.30));
		}else if(tipo.equalsIgnoreCase("b") && tama�o == 2){
			System.out.println("El precio por kilo de la uva de tipo B y tama�o 2 seria de "+ (precio-0.50));
		}else {
			System.out.println("este tipo de usa o de tama�o no existe");
		}

	}

}
