package com;

public class ejeciclico6 {
	
		public static void main(String[] args) {
		double dinero = 700;
		int mes = 1;
		for (;;) {
		dinero = dinero * 0.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println(mes);
		System.out.println(dinero);
		}
		}

