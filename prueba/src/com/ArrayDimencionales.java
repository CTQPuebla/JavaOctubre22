package com;

import java.util.Scanner;

public class ArrayDimencionales {

	public static void main(String[] args) {
		//como puedo declarar varios tipos de datos 
		
		Scanner entrada=new Scanner(System.in);
		
		String[][ ]arreglo=new String[3][7];
		
		for(int filas=0; filas<arreglo.length;filas++) {
			
			for(int columnas=0; columnas<arreglo[filas].length;columnas++) {
				System.out.println("ingresa datos: ");
				arreglo[filas][columnas]=entrada.nextLine();
				
				
				
			}
			
		}
		System.out.println("arreglo lleno"+arreglo+entrada);
		
		
		
	}

}
