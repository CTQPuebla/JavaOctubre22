package com;

import java.util.Scanner;

public class ArrayDimensional {
	public static void main(String[] args) {
		
	                              //fila y columna
	Scanner lector = new Scanner(System.in);
		                         //f   c
	String [][] fila = new String [3][7];
	//filas
	for (int f=0; f<fila.length; f++) {
	     //columnas
		for (int c=0; c<fila[f].length; c++) {
			//fila [f][c] = s.nextline();
			System.out.println(fila [f][c]);
			
		}
	 }
	
	
	} //fin main
}//fin
