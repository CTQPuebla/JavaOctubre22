package com;

import java.util.HashMap;

public class Maquina {
	
	private HashMap<String, Producto> ubi;
	
	public Maquina(HashMap<String, Producto>ubi) {
		this.ubi= ubi;
	}
	
	
	public Producto buscarProducto(String ubicacion ) {
		Producto productos = null;
		
		//buscar dentro del conjuntos de llaves del HashMap
		for (String key:this.ubi.keySet()) {
			
			if((key).equals(ubicacion)) {
				ubicacion = this.ubi.get(key);
				break;
			}
		}

		
		return productos;
		
	}	
		
		
		public Maquina seleccionar (String ubicacion, double monto) {
			Maquina producto = null;
			if (this.buscarProducto(ubicacion)!=null) {
				
				Producto ubi = this.buscarProducto(ubicacion);
			
		
			if(monto<ubi.getPrecio()) {
			System.out.println("Saldo insuficiente");
			return producto;
		} else if (monto== ubi.getPrecio()) {
			System.out.println("Operacion finalizada");
			return producto;
		} else if (monto > ubi.getPrecio()) {
			System.out.println("Tome su cambio " + (monto - ubi.getPrecio()));
			return producto;
		} 
		
			
	} else {
		System.out.println("no existe código");
	}
		return producto;
	
		}
		return null;
		}
	
		
}
