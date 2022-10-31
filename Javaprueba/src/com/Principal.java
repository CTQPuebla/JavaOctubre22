package com;

public class Principal {

	public static void main(String[] ags) {
		//Valores numericos
		byte b = 30;
		short s = 1000;
		int i = 2341234;
		long l = 99900090909090909l;
		
		float f= 45.98f;
		double d = 45.98;
		
		char c = '$';
		boolean bo = true;
		
		
		// Tipos de objetos
		
		Integer x = 1234567;
		String ss = "asdf";
		Byte by = 127;
		Short sh = 32767;
		Long lo = 3582287l;
		Boolean boo = false;
		Character ca = '#';
		Double du = 45.11;
		
		System.out.println(x.equals(sh));
		System.out.println(ss.length());
		System.out.println( by.getClass());
		System.out.println(sh.byteValue());
		System.out.println(lo.getClass());
		System.out.println(boo.TRUE);
		System.out.println(ca.lowSurrogate(s));
		System.out.println(du.equals(lo));
		
		
		
		
	}//cierre del main
	
	
	
}//cierre de la clase 
