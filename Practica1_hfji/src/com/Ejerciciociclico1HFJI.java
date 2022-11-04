/* Hernandez Falcon Jorge Ivan
 * 1.-Ejercicio ciclico 1 tabla del 12
 */

package com;
 
	class Main {
	    public static void main(String[] args) {
	        int numeroTabla = 12; // La tabla del doce
	        imprimirTabla(numeroTabla);
	    }

	    public static void imprimirTabla(int numeroDeTabla) {
	        for (int x = 1; x <= 10; x++) {
	            String formato = "%d x %d = %d";
	            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
	            System.out.println(linea);
	        }
	    }
	}