package com;

import java.util.HashMap;
import java.util.Scanner;

public class Localizaci�n {

	public static void main(String[] args) {
		
		String localizaci�n;
		int saldo;
		Scanner lector = new Scanner (System.in);
		
		HashMap<String, Productos> loc = new HashMap<String, Productos>();
		
		loc.put("A1", new Productos("Donas", "Bimbo", 25));
		loc.put("A2", new Productos("Runners", "Barcel", 15));
		loc.put("A3", new Productos("Papas", "Sabritas", 20));
		loc.put("B1", new Productos("Refresco", "Coca-Cola", 19));
		loc.put("B2", new Productos("Papas", "Ruffles", 16));
		loc.put("B3", new Productos("Yogurt", "Lala", 25));
	


		
		
		M�quina maq1 = new M�quina(loc);
		
		
		System.out.println("Ingrese localizaci�n del producto");
		localizaci�n = lector.nextLine();
		
		System.out.println("Ingrese efectivo");
		saldo = lector.nextInt();
		
		
		System.out.println(maq1.despachar(localizaci�n, saldo));
		
		
	}


}
