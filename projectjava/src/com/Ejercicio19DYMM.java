package com;

public class Ejercicio19DYMM {
  
	public static void main(String[] args) {
		
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas
		
	
		
		
		for (int hora = 0; hora <= 23; hora++) 
			for (int min = 0; min <60; min++)
				for (int seg = 0; seg <60; seg++){
					System.out.println(hora + " : " + min + " : " + seg  );
		}
		
	}
}
