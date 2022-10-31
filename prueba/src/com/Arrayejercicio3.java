package com;

public class Arrayejercicio3 {
	public static void main(String[] args) {
		
		String [][] fila1 = new String [3][5];
		String [][] fila2 = new String [3][5];
		String [][] fila3 = new String [3][5];
		
		fila1[0][0] = "5";
		fila1[0][1] = "x";
		fila1[0][2] = "9";
		fila1[0][3] = "4";
		fila1[0][4] = "t";
		fila1[1][0] = "3";
		fila1[1][1] = "z";
		fila1[1][2] = "p";
		fila1[1][3] = "c";
		fila1[1][4] = "6";
		fila1[2][0] = "8";
		fila1[2][1] = "3";
		fila1[2][2] = "f";
		fila1[2][3] = "i";
		fila1[2][4] = "7";
		
		//B
		fila2[0][0] ="7";
		fila2[0][1] ="p";
		fila2[0][2] ="4";
		fila2[0][3] ="g";
		fila2[0][4] ="8";
		fila2[1][0] ="5";
		fila2[1][1] ="w";
		fila2[1][2] ="y";
		fila2[1][3] ="10";
		fila2[1][4] ="2";
		fila2[2][0] ="1";
		fila2[2][1] ="7";
		fila2[2][2] ="v";
		fila2[2][3] ="o";
		fila2[2][4] ="6";
		
		
		//Lectura dinamica
	
//		for (int i = 0; i < fila2.length; i++) { //Iterar sobre las filas
//			for (int j = 0; j < fila2[i].length; j++) {
//				System.out.println(fila2[i][j]);
//			}
		
		
		
		try {
			int n1 = Integer.parseInt(fila1[i][j]);
			int n2 = Integer.parseInt(fila2[i][j]);
			fila3[i][j] = Integer.toString(n1+n2);
		}catch(Exception ex) {
			fila3[i][j] = 0;
		}
	}
}
	
		




