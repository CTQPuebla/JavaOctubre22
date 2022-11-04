package com;

import java.util.Scanner;

public class Arryejercicio2 {
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		String curp = ("caba960521hdf");
		String[] numeros = {"0", "1","2","3","4","5","6","7","8","9"};
		String[] letras = {"a","b","c","d","e","f","g","h","i","j","k",
				"l","m","n","o","p","q","r","s","t","u","v","w","x","y",
				"z"};
		String caracter = "";
		String cifrado = "";
		int num = 0;		
		
		for (int x = 0; x < curp.length(); x++) {
			caracter = Character.toString(curp.charAt(x));
			for (int i = 0; i < numeros.length; i++) {
				if (caracter.contentEquals(numeros[i])) {
					if (num==8) {
						num=0;
					}else {if (num==9) {
						num=1;
					}else {
						num = Integer.parseInt(caracter)+2;
					}
					cifrado=cifrado + num;
					}
				}
			}
			for (int w = 0; w < letras.length; w++) {
				if (cifrado.contentEquals("y")) {
					cifrado=cifrado+"a";
				}else if (caracter.contentEquals("z")) {
					cifrado=cifrado+"b";
				}else if (caracter.contentEquals(letras[w])) {
					cifrado=cifrado+letras[w+2];
				}
			}
		}
		
		System.out.println(cifrado);
		
	}//fin main

}//fin
