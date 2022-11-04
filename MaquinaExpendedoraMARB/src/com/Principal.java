package com;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		
		String ubicacion;
		int monto;
		
		
		HashMap<String, Producto> ubi = new HashMap<String, Producto>();
		
		ubicacion.put("A1", new Producto("Galletas", 15));
		
		Maquina maq = new Maquina(ubicacion);
		
		System.out.println(maq.seleccionar("A1", 20));
		
			
		
	}

}
