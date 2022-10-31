package com;

public class Ejercicio19UGS {
	public static void main(String[] args) {
		int hrs, min, seg;
		for (int i = 0; i < 24; i++) {
			hrs=i;
			for (int j = 0; j < 60; j++) {
				min=j;
				for (int j2 = 0; j2 < 60; j2++) {
					seg=j2;
					System.out.println(hrs+":"+min+":"+seg);
				}
			}
		}
	}
}
