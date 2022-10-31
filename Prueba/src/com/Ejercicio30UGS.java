package com;

import java.util.Scanner;

public class Ejercicio30UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Object [] objetos = new Object[3];
		String curp, curpcod="";
		Character ch, charcod;
		int x;
		System.out.print("Ingrese su CURP: ");
		curp=entrada.next();
		curp=curp.toUpperCase();
		for (int i = 0; i < curp.length(); i++) {
			try {
				x = Integer.parseInt(Character.toString(curp.charAt(i)));
				if (x==8) {
					charcod = '0';
				} else if (x==9) {
					charcod = '1';
				} else {
					charcod = Integer.toString(x+2).charAt(0);
				}
				
			} catch (Exception ex) {
				ch = curp.charAt(i);
				if (ch.equals('Y')) {
					charcod = 'A';
				} else if (ch.equals('Z')) {
					charcod = 'B';
				} else {
					charcod = (char)(ch.charValue()+2);
				}
				
			}
			curpcod+=charcod;
//			System.out.print(charcod);
		}
		System.out.print(" El CURP codificado es: "+curpcod);
//		gasu980505hplrnt07
//		GASU980505HPLRNT07
	}
}
