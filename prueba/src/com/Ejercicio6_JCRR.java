package com;

import java.util.Scanner;

public class Ejercicio6_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo;
		int tamaño;
		double precio;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Cual es el precio inicial del kilo de uva?");
		precio = entrada.nextDouble();
		System.out.println("Cual es el tipo de uva (A o B)");
		entrada.nextLine();
		tipo = entrada.nextLine();
		System.out.println("Cual es el tamaño de la uva (1 o 2)");
		tamaño = entrada.nextInt();
		
		if(tipo.equalsIgnoreCase("a") && tamaño == 1) {
			System.out.println("El precio por kilo de la uva de tipo A y tamanaño 1 seria de "+ (precio+0.20));
		}else if(tipo.equalsIgnoreCase("a") && tamaño == 2) {
			System.out.println("El precio por kilo de la uva de tipo A y tamaño 2 seria de "+ (precio+0.30));
		}else if(tipo.equalsIgnoreCase("b") && tamaño == 1) {
			System.out.println("El precio por kilo de la uva de tipo B y tamaño 1 seria de "+ (precio-0.30));
		}else if(tipo.equalsIgnoreCase("b") && tamaño == 2){
			System.out.println("El precio por kilo de la uva de tipo B y tamaño 2 seria de "+ (precio-0.50));
		}else {
			System.out.println("este tipo de usa o de tamaño no existe");
		}

	}

}
