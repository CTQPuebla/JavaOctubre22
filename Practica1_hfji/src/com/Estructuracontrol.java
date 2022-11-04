package com;

import java.util.Scanner;

public class Estructuracontrol {

	public static void main (String[] args) {
		//leer valores desde teclado
		int p=20;
		Scanner lector = new Scanner(System.in);
        p = p + lector.nextInt();
        		
        System.out.println("Valor: "+ p);	
	}
}
