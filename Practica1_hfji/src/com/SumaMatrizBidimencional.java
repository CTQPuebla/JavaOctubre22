/* Hernandez Falcon Jorge Ivan
 * Suma Matriz Bidimencional
 */
package com;

public class SumaMatrizBidimencional {
	public static void main (String[] args) {

	    String [][] matriz1 = new String [3][7];	
		String [][] matriz2 = new String [3][7];
		int [][] matrizR = new int [3][7];
		String valorMatriz1;
		String valorMatriz2;
		int numeroMatriz1;
		int numeroMatriz2;
		int suma;
		
		int f = 0;
		int c = 0;
		
		
		//Matriz 1 
		matriz1 [0][0] = "rhjjriiddd";
		matriz1 [0][1] = "f";
		matriz1 [0][2] = "a";
		matriz1 [0][3] = "qwfg";
		matriz1 [0][4] = "hdgerz";
		matriz1 [0][5] = "l";
		matriz1 [0][6] = "j";
				
		matriz1 [1][0] = "8";
		matriz1 [1][1] = "kksdos";
		matriz1 [1][2] = "kjhh";
		matriz1 [1][3] = "8";
		matriz1 [1][4] = "5";
		matriz1 [1][5] = "6";
		matriz1 [1][6] = "3";
		
		matriz1 [2][0] = "1";
		matriz1 [2][1] = "kk";
		matriz1 [2][2] = "5";
		matriz1 [2][3] = "hgb";
		matriz1 [2][4] = "5368";
		matriz1 [2][5] = "gvbt";
		matriz1 [2][6] = "njhty";
		
		//Matriz 2
		matriz1 [0][0] = "rhjjriiddd";
		matriz1 [0][1] = "f";
		matriz1 [0][2] = "a";
		matriz1 [0][3] = "qwfg";
		matriz1 [0][4] = "hdgerz";
		matriz1 [0][5] = "l";
		matriz1 [0][6] = "j";
				
		matriz1 [1][0] = "8";
		matriz1 [1][1] = "kksdos";
		matriz1 [1][2] = "kjhh";
		matriz1 [1][3] = "8";
		matriz1 [1][4] = "5";
		matriz1 [1][5] = "6";
		matriz1 [1][6] = "3";
		
		matriz1 [2][0] = "1";
		matriz1 [2][1] = "2";
		matriz1 [2][2] = "9";
		matriz1 [2][3] = "0";
		matriz1 [2][4] = "7";
		matriz1 [2][5] = "4";
		matriz1 [2][6] = "2";
		
	    System.out.println("La suma de la matriz A y la matriz B es: ");
		for (f=0;f<matriz1.length;f++) {
			for (c=0;c<matriz1[f].length;c++) {
				valorMatriz1 = matriz1[f][c];
				valorMatriz2 = matriz2[f][c];
				if(valorMatriz1.matches(".*[a-z].*") == false && valorMatriz2.matches(".*[a-z].*")== false) {
					numeroMatriz1 = Integer.parseInt(valorMatriz1);
					numeroMatriz2 = Integer.parseInt(valorMatriz2);
					suma = numeroMatriz1 + numeroMatriz2;
					matrizR[f][c] = suma;
					
		//puede funcionar  tambien con este else 
					
//				}else {
//					
//					matrizR[f][c] = 0;
//				
//				}System.out.print(" "+matrizR[f][c]+" ");
//				//System.out.println("Valor del array: " + matriz1[f][c] +"Estado: "+ valorMatriz1.matches("[a-z]"));
//			}System.out.println();
//		}
				}
			}
		}
	}
}
