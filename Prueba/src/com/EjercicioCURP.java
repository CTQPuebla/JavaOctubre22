package com;

public class EjercicioCURP {

	public static void main(String[] args) {

		int numero = 0;
		String caracter = "";
		String cifrado = "";
		String curp = "BARJ851124HVZRMR05";
		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		
		for (int i = 0; i < curp.length(); i++) {
			caracter = Character.toString(curp.charAt(i));
			for (int j = 0; j < num.length; j++) {
				if (caracter.equals(num[j])) {
					numero = Integer.parseInt(caracter);
					if (numero == 8) {
						numero = 0;
					} else if (numero == 9) {
						numero = 1;
					} else if (numero == 0) {
						numero = 2;
					} else {
						numero = Integer.parseInt(caracter) + 2;
					}
					cifrado = cifrado + numero;
				}
			}
			for (int j2 = 0; j2 < letras.length; j2++) {
				if (caracter.equals("Y")) {
					cifrado = cifrado + "A";
				} else if	(caracter.equals("Z")) {
					cifrado=cifrado + "B";
				} else if (caracter.equals(letras[j2])) {
					cifrado = cifrado + letras[j2 + 2];
				
			}
		}
		
	}
		System.out.println(cifrado);
}
}


