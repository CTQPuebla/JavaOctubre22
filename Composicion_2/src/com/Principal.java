package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Destornillador dest=new Destornillador("Cruz", "Acero", 4);
		Navaja nav=new Navaja("De sierra", "Acero", 5);
		Tijeras tije= new Tijeras("Lisa", "Titanio", 3);
		
		Navaja_Suiza Suiza=new Navaja_Suiza("Roja", "Victorinox", 999.99, nav, dest, tije);
		
		System.out.println(Suiza);
		
	}

}
