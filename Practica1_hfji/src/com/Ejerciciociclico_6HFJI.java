/* Hernandez Falcon Jorge Ivan
 6.- Una persona desea invertir $1000.00 en un banco, 
 el cual le otorga un 2% de inter�s mensual. Cual ser� la cantidad 
 de dinero que esta persona tendr� al cabo de un a�o si todo 
 el dinero lo reinvierte?.
 */

package com;

public class Ejerciciociclico_6HFJI {
		public static void main(String[] args) {
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 0.02;
		mes++;
		}
		System.out.println("El total de dinero al a�o es de: "+dinero);
		}
	}

