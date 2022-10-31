package com;

public class Arrays {
	
	public static void main(String[] args) {
		
		//vacio
		int numeros [] = new int [10];
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 4;
		numeros[5] = 5;
		numeros[6] = 6;
		numeros[7] = 7;
		numeros[8] = 8;
		numeros[9] = 9;
	
		
		//Valores
		int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		
	}

}
