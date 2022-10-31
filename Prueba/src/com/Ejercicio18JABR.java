package com;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio18JABR {

	public static void main(String[] args) {
		
		String texto;
		char letra = 0;
		int numVeces=0;
		
		Scanner lector=new Scanner(System.in);
		do {
		System.out.println("Introduce una frase");
		texto=lector.nextLine();
		}while (texto.isEmpty());
		System.out.println("Introduce una letra");
		try {
			letra=(char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		numVeces=texto.indexOf(letra);
		System.out.println("La letra se repite " + numVeces);

			
			}
		
	}

	
	

