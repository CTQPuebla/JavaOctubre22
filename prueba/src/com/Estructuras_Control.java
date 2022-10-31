package com;

import java.util.Scanner;

public class Estructuras_Control {
	
	public static void main(String[] args) {
		
		//variables
		/*
		int x=4;
		String m= "25 de octubre de 2022";
		int xx=30;
		int d=3;
		String f="a";
		
		//---------------------------------------------------
		// Estructuras de decision IF - valores booleanos
		
		
		if (x < 10) { //condicion dependiendo del valor de x
			
			System.out.println("es menor");
		}else {
			
			System.out.println("es mayor");
			
		}
		
		
		if (m.length()<15) { //la longitud del String es menor que 15?
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//Condicion compuesta con operadores logicos AND,OR, NOT. DIFERENTE DE 
		//AND
		if(m.length()<30 && xx>10 && m.equals("25 de octubre de 2022")) { //AND te devuelve true cuando todo sea TRUE
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//OR
		
		if(m.length()<5 || xx>35 || m.equals("25 de octubre de 2022")) { //OR te devuelve true cuando al menos una sea TRUE
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//NOT
		if(!(m.length()<5 || xx>35 || m.equals("25 de octubre de 2022"))) { //NOT cambia el valor de TRUE a FALSE y de FALSE a TRUE
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//DIFERENTE DE 
		
		if (xx != 30) { //Revisa si es diferente el valor si es diferente manda TURE
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//comparación 
		
		if (xx == 30) { //Revisa si es igual el valor, si es igual manda TRUE
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//comparacion de objetos String "equals"
		
		if ("skjdsd".equals(m)) { 
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// estructura else if o if concatenado <- computacionalmente caro no se recomienda
		if (d==1) {
			System.out.println("lunes");	
		}else if(d==2){
			System.out.println("martes");
		}else if (d==3) {
			System.out.println("miercoles");
		}else if (d==4) {
			System.out.println("jueves");
		}else if (d==5) {
			System.out.println("viernes");
		}else {
			System.out.println("Desconocido");	
		}
		
		
		
		//-------------------------------------------
		//Estructura de decision SWITCH-CASE, puede ser con tipo
		// tipo de dato cual sea int, string, char, etc.
		switch(f) {
		
		case "a":
			System.out.println("lunes");	
			break;
		case "b":
			System.out.println("martes");	
			break;
		case "c":
			System.out.println("miercoles");	
			break;
		case "d":
			System.out.println("jueves");	
			break;
		case "e":
			System.out.println("viernes");	
			break;
		default:
			System.out.println("Desconocido");	
		} */
		
		
		//Lectura del teclado con Scanner
		int p= 20, n;
		String x;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa un valor: ");
		
		n= lector.nextInt();
		p= 20 + n;//espera a que escribas algo
		lector.nextLine();
		System.out.println("Ingresa un valor: ");
		x= lector.nextLine();
		
		System.out.println("valor: "+ p);
		System.out.println("valor: "+ x);
		
		
		
	}

}
