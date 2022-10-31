package com;

public class Arrays_Bidimensionales_Ejercicio_Manual {

	public static void main(String[] args) {
		
		String[][] matrizA=new String[3][5];
		String[][] matrizB=new String[3][5];
		String[][] matrizC=new String[3][5];
		
		matrizA[0][0]="5";
		matrizA[0][1]="x";
		matrizA[0][2]="9";
		matrizA[0][3]="4";
		matrizA[0][4]="t";
		matrizA[1][0]="3";
		matrizA[1][1]="z";
		matrizA[1][2]="p";
		matrizA[1][3]="c";
		matrizA[1][4]="6";
		matrizA[2][0]="8";
		matrizA[2][1]="3";
		matrizA[2][2]="f";
		matrizA[2][3]="i";
		matrizA[2][4]="7";
		
		System.out.println("La matriz A es: ");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			
			}
	}
		
		matrizB[0][0]="7";
		matrizB[0][1]="p";
		matrizB[0][2]="4";
		matrizB[0][3]="g";
		matrizB[0][4]="8";
		matrizB[1][0]="5";
		matrizB[1][1]="w";
		matrizB[1][2]="y";
		matrizB[1][3]="10";
		matrizB[1][4]="2";
		matrizB[2][0]="4";
		matrizB[2][1]="7";
		matrizB[2][2]="v";
		matrizB[2][3]="o";
		matrizB[2][4]="6";
		
		System.out.println("\n\nLa matriz B es: ");
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
							
			}
		}
		System.out.println("\n\nLa matriz C es:");
		for (int i = 0; i < matrizC.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizC[i].length; j++) {
				try {
					matrizC[i][j]=Integer.toString(Integer.parseInt(matrizA[i][j])+Integer.parseInt(matrizB[i][j]));
					
				}catch (Exception ex) {
					matrizC[i][j]="0";
				}
				System.out.print(matrizC[i][j] + " ");
			
		}
	}
}
}
