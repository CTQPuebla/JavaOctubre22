package com;

public class Matriz_Ejercicio {

	public static void main(String[] args) {

		String numeros = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
		
		
		String [][] matriz1 = {
				
				{"5","x","9","4","t"},
				{"3","z","p","c","6"},
				{"8","3","f","i","7"},
				
		} ;
		
		String [][] matriz2 = {
				
				{"7","p","4","g","8"},
				{"5","w","y","10","2"},
				{"4","7","v","0","6"},
				
		} ;
		
		String [][] matriz3 = new String [3][5];
		
		
		for (int f = 0; f < matriz1.length; f++) {
			for (int c = 0; c < matriz1[f].length; c++) {
				
				if (numeros.indexOf(matriz1[f][c])>=0 && numeros.indexOf(matriz2[f][c])>=0) {
					
				matriz3 [f][c] = Integer.toString(Integer.parseInt(matriz1[f][c])+Integer.parseInt(matriz2[f][c]));
					
					
					
				}else {
					
					matriz3 [f][c] = "0";
				}
				
			}
			System.out.println();
		}
		
		
		
		for (int f = 0; f < matriz3.length; f++) {
			for (int c = 0; c < matriz3[f].length; c++) {
				System.out.print(matriz3[f][c] + " ");
				
			}
			System.out.println();
		}
		

}

}