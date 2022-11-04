package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Maquina {
	

	private HashMap<String, Producto> productos;
	
	public Maquina (HashMap<String, Producto> productos) {
		this.productos=productos;
	}
	
	public Maquina(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Producto buscarProducto(String nombreProducto) {
		Producto producto=null;
		
		for (String key: this.productos.keySet()) {
			if (key.equals(nombreProducto)) {
				producto=this.productos.get(key);
				break;
				
			}
		}
		return producto;
		
		
	}
	
	public Maquina cobrar(String nProducto, double dinero) {
		Maquina p1 =null;
		if (this.buscarProducto(nProducto)!=null) {
			Producto producto=this.buscarProducto(nProducto);
			if(dinero<producto.getPrecio()) {
				System.out.println("El saldo es insuficiente");
				return p1;
			}else if(producto.getPrecio()==dinero) {
				System.out.println("Tome su producto");
				return p1;
	
		
		
	}
		return p1;
}
		return p1;
}
}	
	

	


