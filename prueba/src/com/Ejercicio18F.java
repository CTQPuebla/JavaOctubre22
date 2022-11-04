package com;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio18F {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		String Texto="";
		String caracter="";
		int iterador=0;

		System.out.print("Ingresa el texto: ");
		Texto = entrada.nextLine();

		System.out.print("que caracter deseas contar: ");
		caracter = entrada.nextLine();
		for (int i = 0; i < Texto.length(); i++) {
		if(Texto.charAt(i)== caracter.charAt(0) ){
		iterador++;
		}
		}

		if (iterador != 0) {
		System.out.println("El caracter "+caracter.charAt(0)+ " se repite " + iterador + " veces");
		}else{
		System.out.println("caracter no encontrado");
		}
	    
	    
	}

}
