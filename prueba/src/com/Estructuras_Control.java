package com;

import java.util.Scanner;

public class Estructuras_Control {

	public static void main(String[] args) {
		// Estructuras de desicion - valores boolean 
		
		
		// if
		String m = "Esta cadena es demasiado corta";
		int xx = 30;
		
		if (m.length() < 10) {
			
			System.out.println("Asies");
			
		} else {
			
			System.out.println("Nel");
		}
		
		
		// AND 
		
		if (m.length() < 10 && xx > 10 && m.equals("Esta oracion no es igual a la original")) {
			
			System.out.println("Todo coincide");
			
		} else {
			
			System.out.println("Algo no se cumple");
		}
		
		
	if (m.length() < 50 && xx > 10 && m.equals("Esta cadena es demasiado corta")) {
			
			System.out.println("Todo se cumple");
			
		} else {
			
			System.out.println("Algo no se cumple");
		}
		
		// OR
		
	if (m.length() > 10 || xx > 10 || m.equals("Esta oracion no es igual a la original")) {
		
		System.out.println("Almenos algo cumple");
		
	} else {
		
		System.out.println("Nada cumple");
	}
	
	//NOT
	
if (!(m.length() > 10 || xx > 10 || m.equals("Esta oracion no es igual a la original"))) {
		
		System.out.println("Almenos algo cumple");
		
	} else {
		
		System.out.println("Nada cumple (ah prro, negaste la salida)");
	}


	/*Para el caso de primitivos se usa el DIFERENTE DE e IGUAL A, en el caso de 
	Wrappers se usan funcionces como .equals
	*/

	//DIFERENTE DE
	if (xx != 10 ) {
	
		System.out.println("Si es diferente");
	
	} else {
	
		System.out.println("No es diferente");
	}
	
	//IGUAL A 
	if (xx == 30 ) {
		
		System.out.println("Son iguales como dos gotas de cum");
	
	} else {
	
		System.out.println("No son iguales");
	}
	
	//En el caso de wrappers
	if ("Esta cadena es demasiado corta".equals(m)) {
		
		System.out.println("Son iguales como dos wrappers de cum");
	
	} else {
	
		System.out.println("No son iguales");
	}
	
	//else if

	int d = 5 ;
	
	if (d == 1) {
		System.out.println("Es lunes");
	}else if (d == 2) {
		System.out.println("Es martes");
	}else if (d == 3){
		System.out.println("Es miercoles de ceniza");
	}else if (d == 4){
		System.out.println("Es juevebes");
	}else if (d == 5){
		System.out.println("Es beviernes");
	}else {
		System.out.println("Nomas cuento de lunes a viernes krnal");
	}
	
	// switch
	
	int a = 2;
	
	switch (a) {
	
	case 1:
		System.out.println("Es lunes");	
		break;
	case 2:
		System.out.println("Es martes");	
		break;
	case 3:
		System.out.println("Es miercoles");	
		break;
	case 4:
		System.out.println("Es jueves");	
		break;
	case 5:
		System.out.println("Es viernes");	
		break;
	default:
		System.out.println("Nomas cuento de lunes a viernes krnal");
	}
	
	
	String Dia = "Miercoles";
	
	switch (Dia) {
	
	case "Lunes":
		System.out.println("Es lunes");	
		break;
	case "Martes":
		System.out.println("Es martes");	
		break;
	case "Miercoles":
		System.out.println("Es miercoles");	
		break;
	case "Jueves":
		System.out.println("Es jueves");	
		break;
	case "Viernes":
		System.out.println("Es viernes");	
		break;
	default:
		System.out.println("Nomas cuento de lunes a viernes krnal");
	}
	
	
	// Leer el teclado / Scanner
	
	int y = 20;
	String linea;
	Scanner Entrada = new Scanner (System.in);
	System.out.println("Ingrese un valor para sumarle a 20: 44");
	y = y + Entrada.nextInt();
	Entrada.nextLine(); // Es un salto de linea que evita que se tome el \n como entrada
	System.out.println("Ingrese un texto: ");
	linea = Entrada.nextLine();
	
	System.out.println("Impresion 1: " + y);
	System.out.println("Impresion 2: " + linea);
	
System.out.println();
	
	///////////////////////////////////////////////////////////////////
	}
}


