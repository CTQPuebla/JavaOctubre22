package com;

import java.util.HashMap;

public class M�quina {
	
	private HashMap <String, Productos> loc;

	public M�quina(HashMap<String, Productos> loc) {
		this.loc = loc;
	}
	
	public Productos buscarProductos (String localizaci�n) {
		Productos productos = null;
		
		for (String key:this.loc.keySet()) {
			
			
			if(key.equals(localizaci�n)) {
				productos = this.loc.get(key);
				break;
			}
	
		}
		
		return productos;
	}
	
	
	
	public M�quina despachar (String localizaci�n, double dinero) {
		
		M�quina producto = null;
		
		if (this.buscarProductos(localizaci�n)!=null) {
			
			Productos loc = this.buscarProductos(localizaci�n);
			
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
		System.out.println("No hay producto asignado a ese c�digo");
	}
		return producto;
		
		
	}
	

}
