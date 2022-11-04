package com;

public class array {

	public static void main(String[] args) {
		
//		int[] numeros = new int [8 "longitud"];
//		
//		int[] n2 = {1,2,3,4,5,6,};
//		
//		numeros [7] = 23;
//		
//		para ver lo que hay en determinada posición tenemos que syso("llamar al array" + ["posición"]
//		
//		
//		String [] nume = new String [8];
//				
//		String [] num = {"2", "3", "67", "23"};
//		
//		nume [6 "posición"] = "345";
		
		
		String [] letras = {"5", "x", "3", "t", "q", "7", "3", "p", "x", "9"};
		String numeros = ("0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
		String [] texto = {"uno", "dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		
		int sumatoria = 0 ;
		
		for (int i = 0; i < letras.length; i++) {
			if (numeros.indexOf(letras[i])>=0) { 
				sumatoria = sumatoria + Integer.parseInt(letras [i]);
				
				System.out.println(texto[(Integer.parseInt(letras [i])-1)]);
			}
				
		
		}
		
		System.out.println(sumatoria);
		
		
		
	}//fin main 
		
}