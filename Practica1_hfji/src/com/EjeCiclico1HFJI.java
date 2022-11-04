/* Hernandez Falcon Jorge Ivan
1.- Programa un algoritmo que 
realice la tabla de multiplicar del 12
*/

package com;

public class EjeCiclico1HFJI {

	public static void main (String[] args) {
	
		int numerotabla = 12;
	
		
		for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numerotabla, x, numerotabla * x);
            System.out.println(linea);
		}
	}
}
	



