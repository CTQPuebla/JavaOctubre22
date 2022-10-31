package com;

import java.util.Scanner;

public class Ejercicio17_JCRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa la frase");
		String original = entrada.nextLine();
		String reversa= "";
		
		for(int i=original.length()-1; i>=0; i--) {
			reversa = reversa+Character.toString(original.charAt(i));
		}
		
		reversa= reversa.replace(" ","");
		original= original.replace(" ","");
		
		if(original.equals(reversa)) {
			System.out.println(" La frase es palindroma");
		}else {
			System.out.println(" La frase es palindroma");
		}
		

	}

}
