package com;

public class Ejercicio19_BMNA {

	public static void main(String[] args) {

	
		for (int horas = 0; horas <= 23; horas++) {
			
			for (int minutos = 0; minutos <= 59; minutos++) {
				
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas  + " : " + minutos + " : " + segundos);
				}
			}
			
		}
	}

}
