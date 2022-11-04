/* Hernandez Falcon Jorge Ivan
 * Array Bidimencional 
 */
package com;

import java.util.Scanner;

public class ArrayBidimencional {
	public static void main (String[] args) {
		
		String [][] fila = new String [3][7];
		Scanner s = new Scanner(System.in);
		//estatico	
		fila [0][0] = "2";
		fila [0][1] = "L";
		fila [0][2] = "2";
		fila [0][3] = "3";
		fila [0][4] = "5";
		fila [0][5] = "6";
		fila [0][6] = "8";
		fila [1][0] = "P";
		fila [1][1] = "Q";
		fila [1][2] = "V";
		fila [1][3] = "A";
		fila [1][4] = "F";
		fila [1][5]	= "K";
		fila [1][6] = "Z";
		fila [2][0] = "G";
	    fila [2][1] = "D";
	    fila [2][2] = "H";
	    fila [2][3] = "W";
        fila [2][4]	= "R";
        fila [2][5] = "J";
        fila [2][6]	= "X";
		
		//dinamico
        for (int f=0;f<fila.length;f++) {
			for (int c=0;c<fila[f].length;c++) {
			      //System.out.println(fila[f][c]); para el dinamico
				System.out.println("ingresa un caracter");
				fila[f][c] = s.nextLine();
			}
		}
		
	}

}
