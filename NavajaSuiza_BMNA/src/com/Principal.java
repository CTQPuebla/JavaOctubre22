package com;

public class Principal {

	public static void main(String[] args) {
		
		Navaja nav = new Navaja(8, "Acero", true);
		Destornillador des = new Destornillador("Cruz", 6, "Titanio", false);
		Lima lim = new Lima(2, 7, "Acero", 4);
		
		Suiza navsui = new Suiza("Ferrari", 1500.75, "Negra", nav, des, lim);
		
		System.out.println(navsui);

	}

}
