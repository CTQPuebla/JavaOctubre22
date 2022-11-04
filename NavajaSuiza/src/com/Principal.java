package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Navaja nav = new Navaja("Suiza", 5, "Acero", "Redonda");
		Destapador dest = new Destapador("Acero", 5, "Punta redonda");
		Desarmador desa = new Desarmador("Redonda", "Acero", 5, "Si");
		Tijeras tij = new Tijeras("Acero", 5, "Deslgada", "Redonda");
		
		NavajaSuiza ns = new NavajaSuiza("Roja", 500, 10, "Si", nav, dest, desa, tij);
		System.out.println(ns);
		
		
	}

}
