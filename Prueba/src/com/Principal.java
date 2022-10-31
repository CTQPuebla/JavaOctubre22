package com;

public class Principal {

	public static void main(String[] args) {
		//primitivos
		byte b=30;
		short s=1000;
		int i=190009;
		long l=999999999999999999l;
		
		float f=3.1416f;
		double d=3.1416;
		
		char c='&';
		boolean bo=true;
		
		//Objetos
		
		Integer x = 12902;
		String ss="Utzmac";
		Byte by=123;
		Short sh=1234;
		Long lo=99999999l;
		Boolean bool=false;
		Character ch='$';
		Double dou=100.99;
		Float fl=12.7f;
		
		
		System.out.println(ss.length());
		System.out.println(x.toString());
		System.out.println(by.doubleValue());
		System.out.println(lo.toString());
		System.out.println(bool.booleanValue());
		System.out.println(ch.charValue());
		System.out.println(dou.floatValue());
		System.out.println(fl.intValue());
		
		
	} //cierre de main
}// cierre de la clase
