package com;

import java.util.Scanner;

public class Ejercicio18UGS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		char letra;
		int posicion, contador=0;
		System.out.println("Escriba una frase:");
		frase=entrada.nextLine();
		System.out.println("Escriba el caracter a buscar: ");
		letra = entrada.next().charAt(0);
		posicion = frase.indexOf(letra);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada                                 
            posicion = frase.indexOf(letra, posicion + 1);
        }
        if (contador>0) {
			System.out.println("Hay "+contador+" caracteres "+letra+" repetidos en la frase");
		} else {
			System.out.println("El caracter "+letra+" no se encuentra en la frase");
		}
	}
}
