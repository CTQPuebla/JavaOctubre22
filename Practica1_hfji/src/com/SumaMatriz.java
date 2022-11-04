/* Hernandez Falcon Jorge Ivan
 * Suma Matriz
 */
package com;

import java.util.Scanner;

public class SumaMatriz {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
	    String numeros = "1234567890";
	   
		String[][] mA ={{"a","a","3","8"},
						{"a","a","3","6"},
						{"a","a","3","7"}};
				
		String[][] mB = new String[3][4];
		int [][] mC = new int[3][7];
		for(int i=0;i<mB.length;i++) {
			for(int j=0;j<mB.length;j++) {
				System.out.println("Ingrese un valor, posición: " +i+","+j);
				mB[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("La suma de matrices es: ");
		//Realiza la suma de matrices
		for(int i=0;i<mB.length;i++) { //Filas
			for(int j=0;j<mB.length;j++) { //Columnas
				if(numeros.indexOf(mA[i][j])>=0 && numeros.indexOf(mB[i][j])>=0) { //indexOf 
				int n1 = Integer.valueOf(mA[i][j]);
				int n2 = Integer.valueOf(mB[i][j]);
				
				mC[i][j] = n1+n2;

				}else {
					mC[i][j] = 0;
					//Segunda forma try&catch
					
//					try { //Intenta hacer..
//						//Conversión de los valores directo
//						int n1 = Integer.parseInt(mA[i][j]);
//						int n2 = Integer.parseInt(mB[i][j]);
//						mC[i][j] = n1+n2;
//					}catch(Exception ex) { //Si no puedes, atrapa el valor
//						ex.printStackTrace();
//						mC[i][j] = 0;		
				}System.out.print(mC[i][j]);
			}System.out.println();
		}
	}
  }
//}
