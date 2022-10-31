package com;

import java.util.Scanner;

public class Ejercicio6F {

	public static void main(String[] args) {
		int precioInicial,respuesta;
		String tipo, tamaño;
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("ingrese el preio inicial: ");
		precioInicial=entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("ingresa el tipo A o B: ");
		tipo=entrada.nextLine();
		
		
		switch(tipo) {
		case "A":
			System.out.println("elige tipo de tamaño 1 o 2");
			tamaño=entrada.nextLine();
			
			if(tamaño.equals("1")) {
			respuesta=precioInicial+20;
			System.out.print("precio total es: "+respuesta);
			}else if(tamaño.equals("2")) {
				respuesta=precioInicial+30;	
				System.out.print("precio total es: "+respuesta);
			}
			break;
		case "B":
			System.out.print("elige tipo de tamaño 1 o 2: ");
			tamaño=entrada.nextLine();
			if(tamaño.equals("1")) {
			respuesta=precioInicial-30;
			System.out.print("precio total es: "+respuesta);
			}else if(tamaño.equals("2")) {
				respuesta=precioInicial-50;	
				System.out.print("precio total es: "+respuesta);
			}
			
			break;
			
		}
		
		
		
		
		
		

	}

}
