package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Producto> productos=new HashMap<String, Producto>();
		productos.put("A001", new Producto("Doritos", 15, "Botana"));
		productos.put("A002", new Producto("Sabritas", 15, "Botana"));
		productos.put("A003", new Producto("Negrito", 10, "Pan"));
		
		Maquina maquina1=new Maquina(productos);
		
		System.out.println(maquina1.buscarProducto("A001"));
		
		
		
		
		

	}

}
