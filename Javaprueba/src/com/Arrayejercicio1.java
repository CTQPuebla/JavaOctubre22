package com;

import java.util.Scanner;

public class Arrayejercicio1 {
	public static void main(String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		String [][] tablaa = new String [3][5];
		System.out.println("ingresar valores tabla A");
		
		for (int f = 0; f < tablaa.length; f++) {
			for (int c = 0; c < tablaa[f].length; c++) {
				tablaa[f][c]=lector.nextLine();	
			}
		}
		
		System.out.println("ingresar valores tabla B");
		String [][] tablab = new String [3][5];
		
		for (int f = 0; f < tablab.length; f++) {
			for (int c = 0; c < tablab[f].length; c++) {
				tablab[f][c]=lector.nextLine();
			}	
		}
		
		System.out.println("Tabla C");
		String [][] tablac = new String [3][5];
		
		for (int f = 0; f < tablac.length; f++) {
			for (int c = 0; c < tablac[f].length; c++) {
				try {int n1=Integer.parseInt(tablaa[f][c]);
					int n2=Integer.parseInt(tablab[f][c]);
					tablac[f][c] = Integer.toString(n1+n2);
					
				} catch (Exception e) {
					tablac[f][c]="0";
						
					// TODO: handle exception
				}System.out.print(tablac[f][c]+" ");					
			}System.out.println(" ");
		}
		
	}//fin main

}//fin
