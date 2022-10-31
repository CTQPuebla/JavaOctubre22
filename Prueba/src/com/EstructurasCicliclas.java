package com;

public class EstructurasCicliclas {
	public static void main(String[] args) {
		int x = 0;
		// Primero pregunta por las condiciones y luego
		// ejecuta el codigo
//		while (x<10) {
//			System.out.println((x+1)+". holi");
//			x++;
//		}
		// Realiza la ejecucion del codigo una vez y luego
		// pregunta sobre las condiciones
		do {
			System.out.println((x+1)+". Hola we");
			x++;
		} while (x<10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+". se va a hacer la carne asada?");
		}
	} //CIERRE DE MAIN
} // CIERRE DE CLASE
