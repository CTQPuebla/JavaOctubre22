package com;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		
//		int [] numeros = new int[5];
//		
//		numeros[0] = 11;
//		numeros[1] = 22;
//		numeros[2] = 33;
//		numeros[3] = 44;
//		numeros[4] = 55;
//		
//		int[] numero2 = {2, 3, 4, 5, 6}
		
		
		String numeros = ("1,2,3,4,5,6,7,8,9,0");
		String[] letras = {"5", "x", "3", "t", "q", "7", "3", "p", "x", "15"};
		String[] texto = {"uno", "dos", "tres", "cuatro", "cinco", "seis", 
				"siete", "ocho", "nueve" , "diez", "once", "doce", "trece", 
				"catorce", "quince", "dieciseis"};
		int sumatoria =0;
		
		for (int i = 0; i < letras.length; i++) {
			if (numeros.indexOf(letras[i])>=0) {
				sumatoria = sumatoria+ Integer.parseInt(letras[i]);
				
				System.out.println(texto[Integer.parseInt(letras[i])-1]);
				System.out.println(sumatoria);
			}
			
		}
		

		
		
		
		
		
		
		
		
	}//fin main
	

}//fin
