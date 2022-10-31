package com;

import java.util.Scanner;

public class Ejercicio17UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra;
		char aux1, aux2;
		int l, pos1, pos2;
		boolean palindromo=true;
		System.out.println("Escriba una palabra: ");
		palabra=entrada.nextLine();
		l = palabra.length();
		pos1 = 0;
		pos2 = l-1;
		
//		while (pos1!=pos2) {
//			aux1= palabra.charAt(pos1);
//			while (aux1 == ' ') {
//				pos1++;
//				aux1 = palabra.charAt(pos1);
//			}
//			aux2 = palabra.charAt(pos2);
//			while (aux2==' ') {
//				pos2--;
//				aux2 = palabra.charAt(pos2);
//			}
//			if (aux1!=aux2) {
//				palindromo = false;
//			}
//			pos1++;
//			pos2--;
//		}
		while (pos1<pos2) {
			while (palabra.charAt(pos1) == ' ') {
				pos1++;
			}
			while (palabra.charAt(pos2) == ' ') {
				pos2--;
			}
			if (palabra.charAt(pos1) != palabra.charAt(pos2)) {
				palindromo = false;
			}
			pos1++;
			pos2--;
		}
		if (palindromo == true) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}
}
