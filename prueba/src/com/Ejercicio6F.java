package com;

import java.util.Scanner;

public class Ejercicio6F {

	public static void main(String[] args) {
		int precioInicial,respuesta;
		String tipo, tama�o;
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("ingrese el preio inicial: ");
		precioInicial=entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("ingresa el tipo A o B: ");
		tipo=entrada.nextLine();
		
		
		switch(tipo) {
		case "A":
			System.out.println("elige tipo de tama�o 1 o 2");
			tama�o=entrada.nextLine();
			
			if(tama�o.equals("1")) {
			respuesta=precioInicial+20;
			System.out.print("precio total es: "+respuesta);
			}else if(tama�o.equals("2")) {
				respuesta=precioInicial+30;	
				System.out.print("precio total es: "+respuesta);
			}
			break;
		case "B":
			System.out.print("elige tipo de tama�o 1 o 2: ");
			tama�o=entrada.nextLine();
			if(tama�o.equals("1")) {
			respuesta=precioInicial-30;
			System.out.print("precio total es: "+respuesta);
			}else if(tama�o.equals("2")) {
				respuesta=precioInicial-50;	
				System.out.print("precio total es: "+respuesta);
			}
			
			break;
			
		}
		
		
		
		
		
		

	}

}
