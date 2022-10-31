package com;

public class Ejercicio21UGS {
	public static void main(String[] args) {
		double inversion=700;
		int mes=0;
		while (inversion<1500) {
			inversion = inversion + (inversion*0.02);
			mes++;
		}
		System.out.println("En "+mes+" meses tendra $"+(double)Math.round(inversion*100d)/100);
	}
}
