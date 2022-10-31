package com;

public class Arrayejercicio2 {
	  public static void main(String[] args) {
		
//		  Array de 2 ciclos
		  String [][] fila = new String[3][7];
		
		for(int f=0;f<fila.length;f++) {
			for(int c=0;c<fila[f].length;c++) {
				System.out.println(fila[f][c]);
			}
		}
	}

}
