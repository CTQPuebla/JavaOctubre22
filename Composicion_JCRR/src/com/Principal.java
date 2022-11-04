package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ram ram = new Ram(16, "DOCH", 12121, "DDR4");
		Almacenamiento alm1 = new Almacenamiento("SSD", 1024, "Samsung");
		Procesador cpu = new Procesador("LAP", "i4", 4, 3.5, true);
		Laptop lap1 = new Laptop("ACME", 98192,"Azul",ram, alm1, cpu);
		
		System.out.println(lap1);
		

	}

}
