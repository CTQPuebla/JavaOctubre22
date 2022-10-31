package com;

public class Principal {

	public static void main(String[]args) {		

		//Valores numericos 
		byte b = 30;
		short s = 1000;
		int i = 2342314;
		long l = 99999999999999999l;
		
		float f = 45.98f;
		double d = 45.98;
		
		char c = '$';
		boolean bo = true;
		
		//Tipos objeto
		
		Integer x = 2356623;
		String ss = "asdfg";
		Byte by = 123;
		Short sh = 32355;
		Long lo = 2456756743l;
		Boolean boo = false;
		Character ch= 'P';
		Double dou = 34.453454;
		
		System.out.println(ss.length());
		
		System.out.println(x.hashCode());
		
		System.out.println(ss.concat(ss));
		
		System.out.println(by.doubleValue());
		
		System.out.println(sh.floatValue());
		
		System.out.println(lo.compareTo(lo));
		
		System.out.println(boo.compareTo(boo));
		
		System.out.println(ch.compareTo(ch));
		
		System.out.println(dou.isInfinite());
		
		
		
		
		
		
	}//cierre de main
	
}//cierre de la clase