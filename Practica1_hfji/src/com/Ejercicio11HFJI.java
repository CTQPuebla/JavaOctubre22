/* Hernandez Falcon Jorge Ivan
Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
ZONA UBICACIÓN	COSTO/KILOGRAMO
1 América del Norte	24,00 euros
2 América Central	20, 00 euros
3 América del Sur	21,00 euros
4 Europa	10,00 euros
5 Asia	18,00 euros
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

 */

package com;

import java.util.Scanner;

public class Ejercicio11HFJI {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	int zona;
	double peso, costo;
	
	System.out.println("Digite un número de acuerdo con la zona a la que se dirige: \n"
			+ "Seleccione 1 para America del Norte 		24 euros/kg \n"
			+ "Seleccione 2 para America del Central		20 euros/kg \n"
			+ "Seleccione 3 para America del Sur 		21 euros/kg \n"
			+ "Seleccione 4 para Europa 			10 euros/kg \n"
			+ "Seleccione 5 para Asia 				18 euros/kg \n");
	zona = sc.nextInt();
	sc.nextLine();//Salvación de errores con nextInt
	if (zona >=1 && zona<=5) {
	System.out.println("Cuál es el peso máximo (kg) a transportar?: \n");
	peso = sc.nextDouble();

	if (peso >= 5) {
		
		System.out.println("Lo siento, no puede transportar un peso superior a 5kg ");
		
	}else if (peso <= 0) {
		System.out.println("No puedes ingresar 0 kg o menos");
		
	} else {
		switch (zona) {
		case 1:
		costo = 24;
		costo = costo*peso;
		System.out.println("El costo es: "+ costo +" euros");
			break;
			
		case 2:
			costo = 20;
			costo = costo*peso;
			System.out.println("El costo es: "+ costo +" euros");
			break;	
			
		case 3:
			costo = 21;
			costo = costo*peso;
			System.out.println("El costo es: "+ costo +" euros");
			break;	
			
		case 4:
			costo = 10;
			costo = costo*peso;
			System.out.println("El costo es: "+ costo +" euros");
			break;
			
		case 5:
			costo = 18;
			costo = costo*peso;
			System.out.println("El costo es: "+ costo +" euros");
	        break;
		}
		}
	} else {
		System.out.println("Error");
	}
  }
}
