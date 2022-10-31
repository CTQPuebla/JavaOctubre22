package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//Valores numericos
		byte b = 30;
		short s = 1000;
		int i = 242314;
		long l = 999999999999999999l;
		
		float f = 45.98f;
		double d = 45.98;
		 
		char c = '$';
		boolean bo = true;
			
		//Tipos objeto
		
		Integer x = 23423567;
		String ss = "sdfhg";
		Byte by = 127;
		Short sh = 32767;
		Long lg = 114789l;
		Boolean bn = true;
		Character ch = '?';
		Float ft = 35.28f;
		Double be = 33.99;
		
		System.out.println(x.doubleValue());
		System.out.println(by.floatValue());
		System.out.println(sh.longValue());
		System.out.println(lg.byteValue());
		System.out.println(bn.getClass());
		System.out.println(ch.hashCode());
		System.out.println(ft.isInfinite());
		System.out.println(be.longValue());
		System.out.println(ss.length());
		
	}//cierre del main
}//cierre de la clase
