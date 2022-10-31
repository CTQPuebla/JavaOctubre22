package com;

import java.util.Scanner;

public class Ejercicio17DSL {
public static void main(String[]args) {
	
	Scanner s =new Scanner(System.in);
	
	System.out.println("Ingresa la frase");
	
//Declarar las varibles
	String original= s.nextLine();
	String reversa="";
	
	//Iterar al revez,para armar la reversa
	
	for(int i=original.length()-1; i>=0; i--) {
		
		System.out.println(original.charAt(i));
		
		reversa= reversa + original.charAt(i);
		
		
		}
	//Limpia la cadena,elimina espacios
	reversa=reversa.replace("", "");
	original=original.replace("","");
	
	if(original.equals(reversa)) {
		System.out.println("es polindromo");
	}
	else {
		System.out.println(" No es");
	}
	
	
}
}
