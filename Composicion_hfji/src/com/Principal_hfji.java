package com;

public class Principal_hfji {
	
		public static void main(String[] args) {
			
			RAM_hfji ram = new RAM_hfji(16, "TXI", 2933, "DDR4");
			Almacenamiento_hfji almc = new Almacenamiento_hfji("SSD", 1024, "Samsung");
			Procesador_hfji cpu = new Procesador_hfji("Intel", "i7", 8, 3.5, true);
			
			
			Laptop_hfji lap  = new Laptop_hfji("ACME", "960", "A1", "Azul", ram, almc, cpu);
			
			System.out.println(lap);
			
			//Navaja Suiza
			
			
			
			
			
		}

}

