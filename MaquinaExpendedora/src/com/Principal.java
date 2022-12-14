package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		
		HashMap <String,Producto> productos = new HashMap <String,Producto>();
		
		productos.put("0001", new Producto("Cheeto", "0001", 14.5,8));
		productos.put("0002", new Producto("Sabritas", "0002", 18.0,4));
		productos.put("0003", new Producto("Boing", "0003", 10.0,3));
		productos.put("0004", new Producto("Pepsi", "0004", 16.5,5));
		productos.put("0005", new Producto("Emperador", "0005", 20.0,1));
		
		
		Maquina maquina1 = new Maquina(0001, productos);
		
		System.out.println(maquina1.buscarproducto("0001"));
		maquina1.Comprar("0001");
		
	}

}
