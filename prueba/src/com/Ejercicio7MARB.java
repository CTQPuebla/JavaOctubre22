package com;

import java.util.Scanner;

public class Ejercicio7MARB {
	public static void main(String[] args) {
		//El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

	
	int alumnos; 
	  int precio; 
	  int costoTotal; 
	  Scanner lector = new Scanner(System.in); 
	  System.out.println("Ingresa el total de alumnos"); 
	  
	  //120 
	  alumnos = lector.nextInt(); 
	  if(alumnos>=100) { 
	   costoTotal = alumnos * 65; 
	   precio = 65; 
	  }else if(alumnos>=50 && alumnos<=99) {    
	   costoTotal = alumnos * 70; 
	   precio = 70; 
	  }else if(alumnos>=30 && alumnos<=49) { 
	   costoTotal = alumnos * 95; 
	   precio = 95; 
	  }else { 
	   //4000 
	   costoTotal = 4000; 
	   precio = 4000 / alumnos;    
	  } 
	  System.out.println("Costo total: "+costoTotal); 
	  System.out.println("Precio por alumno: "+precio);
	}
	
}
