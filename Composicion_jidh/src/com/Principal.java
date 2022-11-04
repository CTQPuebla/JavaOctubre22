package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Ram ram = new Ram(16, "TXI", 2933, "DDR4");
		Almacenamiento alm = new Almacenamiento("SSD", 1024, "Samsumg");
		Procesador cpu = new Procesador("Intel", "i7", 8, 3.5, true);
		
		
		Laptop lap = new Laptop("ACME", 960, "Al", "Azul", ram, alm, cpu);
		
		System.out.println(lap);
		
	}

}
