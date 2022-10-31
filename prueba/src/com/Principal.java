package com;

public class Principal {
	public static void main(String [] args) {
		
		//Tipos de datos primitivos
		//Valores numericos
		//Numeros enteros 
		byte    b =   30;
		short   s =  100;
		int     i = 12321;
		long    l = 317361383776l;
		//Numeros decimales
		float   f = 45.98f;
		double  d = 45.98;
		
		//Caracteres y cadena de caracteres
		
		char    c =  '#';
		boolean bo= true;
		
		//tipos de datos objetos
		
		Integer       x= 131213;
		String       ss= "hola";
		Byte         by= 123;
		Short        sh= 3512;
		Long        lo = 131311312l;
		Boolean     boo= true;
		Character  cha = 'a';
		Double     dou = 131.131;
		
		
		//Salida de datos
		
		System.out.println("El largo del ss es: "+ ss.length() );
		System.out.println("El valor del integer en double es: "+ x.doubleValue());
		System.out.println("El valor del byte en int es: "+ by.intValue());
		System.out.println("El valor del short es " + sh.shortValue());
		System.out.println("El valor del booleano es "+ boo.booleanValue());
		System.out.println("El valor de comparacion entre caracteres es: (0= iguales) "+ cha.compareTo('a'));
		System.out.println("El valor hash del double es "+ dou.hashCode());
		System.out.println("El valor del long en int es "+ lo.intValue());
	
	
		
		
	}// cierre del main

}// cierre de la clase
