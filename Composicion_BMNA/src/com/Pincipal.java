package com;

public class Pincipal {

	public static void main(String[] args) {
		
		Ram ram = new Ram(16, "TXI", 2933, "DDR4");
		Almacenamiento alm = new Almacenamiento("SSD", 24, "Samsung");
		Procesador cpu = new Procesador("Intel", "i7", 8, 3.4, true);
		
		
		Laptop lap = new Laptop("hp", 960.50, "A1", "Negro", alm, ram, cpu);
		
		System.out.println(lap);

	}

}
