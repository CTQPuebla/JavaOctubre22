package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tijeras tij = new Tijeras("Acero", 12, "derecha", 12);
		Desarmador des= new Desarmador("Acero", 121,"plana", 34, 727, "Si");
		Navaja na = new Navaja("Acero", 23, "fina");
		
		Navaja_Suiza nz = new Navaja_Suiza("Azul", 123.12, "SWSA","Suiza", 12231.12,na,tij,des);
		
		System.out.println(nz);

	}

}
