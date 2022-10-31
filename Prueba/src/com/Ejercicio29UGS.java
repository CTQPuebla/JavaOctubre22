package com;

import java.util.Scanner;

public class Ejercicio29UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
//		String[][] A = new String[3][5]; 
//		String[][] B = new String[3][5];
		String[][] C = new String[3][5];
		String[][] A = {{"5","x","9","4","t"},{"3","z","p","c","6"},{"8","3","f","i","7"}}; 
		String[][] B = {{"7","p","4","g","8"},{"5","w","y","10","2"},{"4","7","v","o","6"}};
//		String numeros = "01234567891011121314151617181920";
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				System.out.print("Escriba lo que agregará en el espacio A["+i+"]["+j+"]: ");
//				A[i][j]=entrada.next();
//			}
//		}
//		for (int i = 0; i < B.length; i++) {
//			for (int j = 0; j < B[i].length; j++) {
//				System.out.print("Escriba lo que agregará en el espacio B["+i+"]["+j+"]: ");
//				B[i][j]=entrada.next();
//			}
//		}
//		for (int i = 0; i < C.length; i++) {
//			for (int j = 0; j < C[i].length; j++) {
//				if ((numeros.indexOf(A[i][j])>=0) && (numeros.indexOf(B[i][j])>=0)) {
//					C[i][j]=Integer.toString(Integer.parseInt(A[i][j])+Integer.parseInt(B[i][j]));
//				} else {
//					C[i][j]="0";
//				}
//			}
//		}
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				try {
					C[i][j]=Integer.toString(Integer.parseInt(A[i][j])+Integer.parseInt(B[i][j]));
				} catch (Exception ex) {
					C[i][j]="0";
				}
			}
		}
		
		System.out.println("La matriz A es:");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("La matriz B es:");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("La matriz C es:");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}//CIEERRE DEL MAIN
}
