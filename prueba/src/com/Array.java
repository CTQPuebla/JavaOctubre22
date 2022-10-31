package com;

public class Array {

public static void main(String[]args) {
	String []letras= {"5","x","3","t","q","7","3","p","x","15"};
	String numeros =("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
	String[] texto= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","disiocho","diecinueve","veinte"};
	int sumatoria=0;
	
	for(int i=0; i<letras.length; i++) {
		
		if(numeros.indexOf(letras[i]) >=0) {
			//se encarga de convertir valores string a enteros
			sumatoria= sumatoria + Integer.parseInt(letras[i]);
			
			System.out.println(texto[Integer.parseInt(letras[i])-1]);
			
		}
	}
	
	System.out.println(sumatoria);
		
	}
}
