package com;

public class Principal {
	public static void main(String[] args) {
		
		RAM ram = new RAM(16, "TXI", 2933, "DDR4");
		Almacenamiento almc = new Almacenamiento("SSD", 1024, "Samsung");
		Procesador cpu = new Procesador("Intel", "i7", 8, 3.5, true);
		
		
		Laptop lap  = new Laptop("ACME", "960", "A1", "Azul", ram, almc, cpu);
		
		System.out.println(lap);
		
		//Navaja Suiza
		
		
		
		
		
	}

}
