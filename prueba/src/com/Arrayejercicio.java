package com;

public class Arrayejercicio {
	public static void main(String[] args) {
		
//		Array de 1 ciclo
		String numeros = ("1234567890");
		String[] texto = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte" };
		String[] letras = { "5", "x", "3", "t", "q", "7", "3", "p", "x", "i" };

		int sumatoria = 0;
		for (int i = 0; i < letras.length; i++) {
			if (numeros.indexOf(letras[i]) > 0) {
				sumatoria = sumatoria + Integer.parseInt(letras[i]);
				System.out.println(texto[Integer.parseInt(letras[i]) - 1]);
			}
		}
		System.out.println("Sumatoria: "+sumatoria);
	}

}
