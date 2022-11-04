package com;

import java.util.HashMap;

public class Máquina {
	
	private HashMap <String, Productos> loc;

	public Máquina(HashMap<String, Productos> loc) {
		this.loc = loc;
	}
	
	public Productos buscarProductos (String localización) {
		Productos productos = null;
		
		for (String key:this.loc.keySet()) {
			
			
			if(key.equals(localización)) {
				productos = this.loc.get(key);
				break;
			}
	
		}
		
		return productos;
	}
	
	
	
	public Máquina despachar (String localización, double dinero) {
		
		Máquina producto = null;
		
		if (this.buscarProductos(localización)!=null) {
			
			Productos loc = this.buscarProductos(localización);
			
			if (dinero<loc.getPrecio()) {
				System.out.println("El saldo es insuficiente");
				return producto;
			}else if (dinero==loc.getPrecio()) {
				System.out.println("Tome su producto");
				return producto;
			}else if (dinero > loc.getPrecio()) {
				System.out.println("Tome su producto");
				System.out.println("Su cambio es: " + (dinero - loc.getPrecio()));
				return producto;
			}
							
			
	} else {
		System.out.println("No hay producto asignado a ese código");
	}
		return producto;
		
		
	}
	

}
