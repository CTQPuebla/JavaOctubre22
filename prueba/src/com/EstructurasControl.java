package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {
		//estructuras de decicion - valores booleanos
		
		//aplicar operadores logicos AND(&&) Or(||) NoT(!)not sirve para evaluar toda la estuctura que ya evaluo, 
		//DIFERENTE DE(!=), = (asignacion), comparacion(==) solo en el caso de primitivos
		//para comprar objetos se usa el "chvjjhvjcjc".equals(variable)
		//if(d==1) {//debuelve el tamaño de cuantas ltras tiene m
		// switch puedeservir para accder a cualquier tabla de la ase de datos por cada caso
		
		int p=20;
		String x;
		Scanner lector =new Scanner(System.in);
		System.out.print("ingrese un valor: ");
		p=p+ lector.nextInt();//convierte numero entero y me permie sumar al valor de p
		lector.nextLine();
		System.out.print("ingresa un texto: ");
		x=lector.nextLine();
		System.out.println("valor: "+p);
		System.out.println("valor: "+x);
	}
	
}
