package com;

public class Principal {

	public static void main(String[] args){
		
		//valores numericos
		byte b =30;
		short s = 1000;
		int i = 2312314;
		long l = 99999999l;
		
		float f = 45.98f;
		double d = 45.98;
		
		char c = '$';
		boolean bo = true;
		
		//tipos objeto - Wrappers
		Integer x = 12345678; 
		String ss = "Joto";
		Byte by= 123;
		Short sh =12345;
		Long Lo = 123456l;
		Boolean Bo = true;
		Character Ch = 'P';
		Double Do = 123.4569;
		
		

		
		System.out.println("El valor del entero es: " + x.longValue());
		System.out.println("El largo de la cadena es: " + ss.length());
		System.out.println("El valor del byte es: " + by.byteValue());
		System.out.println("Convierte el valor del numero a string es: " + sh.toString());
		System.out.println("Convierte el valor de long a un byte: " + Lo.byteValue());
		System.out.println("Convierte el valor de verdad a un string: " + Bo.toString());
		System.out.println("El caracter es: " + Ch.charValue());
		System.out.println("Obtiene la parte entera del double: " + Do.intValue());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
