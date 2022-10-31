package com;

public class ArrayCURPMARB {
	
	public static void main(String[] args) {
		//REALIZA UN PROGRAMA DONDE INGRESES TU CURP Y EL PROGRAMA CONTINUE CON DOS POSICIONES DE LA LETRA O NUMERO 
		
	String curp = "REBM981217HMCYNG08";
	String [] num = {"1","2","3","4","5","6","7","8","9","0"};
	String [] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String caracter = "";
	String cifrado = "";
	int numero = 0;

	    for (int x = 0; x < curp.length(); x++) {
	      caracter = Character.toString(curp.charAt(x));

	      for (int i = 0; i < num.length; i++) {

	        if (caracter.equals(num[i])) {

	          numero = Integer.parseInt(caracter);

	          if (numero == 8) {
	            numero = 0;
	          } else if (numero == 9) {
	            numero = 1;
	          } else if (numero == 0) {
	            numero = 2;
	          } else {
	            numero = Integer.parseInt(caracter) + 2;
	          }
	          cifrado = cifrado + numero;
	        }
	      }

	      for (int w = 0; w < letras.length; w++) {
	        // System.out.println(caracter);
	        if (caracter.equals("Y")) {
	          cifrado = cifrado + "A";
	        } else if (caracter.equals("Z")) {
	          cifrado = cifrado + "B";
	        } else if (caracter.equals(letras[w])) {
	          cifrado = cifrado + letras[w + 2];
	        }
	      }

	    }

	    System.out.println(cifrado);

	  }// fin main

	}// fin