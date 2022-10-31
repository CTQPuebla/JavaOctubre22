package com;

import java.util.Scanner;

public class EjercicioArrayCurp {
public static void main(String[]args) {
	
	int numero = 0;
	String caracter ="";
	String curp = "";
	String cifrado = "" ;
	String [] num = {"1","2","3","4","5","6","7","8","9","0"};
	String [] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","V","X","Y","Z"};
	Scanner s= new Scanner(System.in);
	System.out.println("intruduce tu curp: ");
	curp=s.nextLine();
	 for(int x = 0; x <curp.length(); x++) {
	caracter= Character.toString(curp.charAt(x));
	  for(int i =0; i < num.length; i++) {
	if(caracter.equals(num[i])) {
		
		if(numero==8) {
			numero=0;
		}else if(numero==9) {
			numero=1;
		}else if(numero==0) {
			numero=2;
		}else {
			numero=Integer.parseInt(caracter)+2;
		}
		 cifrado= cifrado + numero;
	}
	}
		
	for( int w=0; w < letras.length; w++) {
		if(caracter.equals("y")) {
			cifrado = cifrado + "A";
		}else if(caracter.equals("Z")) {
		cifrado = cifrado + "B";	
		}else if (caracter.equals(letras[w])) {
			cifrado= cifrado + letras[w+2];
		}
	}
	}

	System.out.println(cifrado);

}
}
