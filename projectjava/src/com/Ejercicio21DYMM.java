package com;

public class Ejercicio21DYMM {

	public static void main(String[] args) {
		
		//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
		//En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?
		
		double inv= 700;
		int meta= 1500, mes = 1;
		double intercomp = 1, inter = 1.02;
		
		for (;;) {
			inv = inv * 1.02;
			if (inv >= 1500) break;
			mes++;
			
		}
		
		System.out.println("Cantidad de meses para lograr el objetivo:  " + mes);
		System.out.println("Su cantidad ahorrada es:  "+ inv);
		
		
	}
	
}
