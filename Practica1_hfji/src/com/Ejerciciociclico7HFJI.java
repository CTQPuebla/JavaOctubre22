/* Hernandez Fsalcon Jorge Ivan
7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá 
mas de $1500, si reinvierte cada mes todo su dinero?.
*/

package com;

public class Ejerciciociclico7HFJI {
	public static void main (String[] args) {
	
	        double inversion = 700.00;
	        double intereses;
	        int meses = 12;
	        while (inversion <= 1500.00) {
	            meses++;
	            intereses = inversion * 0.02;
	            System.out.println(" Total de meses en tener mas de 1500: " + meses + "\n"
	                    + "intereses: " + String.format("%.2f", intereses) + "\n"
	                    + "inversion: " + String.format("%.2f", inversion) + "\n"
	                    + "inversión al mes: " + String.format("%.2f", (inversion + intereses)) + "\n");
	     inversion += intereses;
	        }
	    }
	}
