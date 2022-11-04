package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cientifica c=new Cientifica("100", "Pequeño", "Casio", "Negro", true);
		Cientifica c2=new Cientifica("200", "Grande", "Citizen", "Blanca", false);
		c.raiz();
		System.out.println(c);		

	}

}