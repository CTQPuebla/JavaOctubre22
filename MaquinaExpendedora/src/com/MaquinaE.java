package com;

import java.util.HashMap;
import java.util.Scanner;

public class MaquinaE {

	private int color;
	
	public MaquinaE(int color, HashMap<String, Producto> productos) {
		super();
		this.color = color;
		this.productos = productos;
	}


	private HashMap <String, Producto> productos;
	
	public MaquinaE ( HashMap <String,Producto>productos) {
		
		this.productos = productos;
	}
	
	
	
	public Producto buscarproducto (String codigo) {
		Producto producto =null;
		
		for (String key : this.productos.keySet()) {
			if (key.equals(codigo)) {
				
				producto = this.productos.get(key);
				
				if (producto.getExistencia() ==0) {
					System.out.println("Ya no tenemos producto");
				}
				
				break;
				
			}
		}
		
		return producto;
	}
	
	
	public void Comprar (String codigo) {
		
	
			if (this.buscarproducto(codigo)!=null) {
			Producto producto = this.buscarproducto(codigo);
			boolean Eleccion = true;
			double Dinero = 0;
			if (producto.getExistencia()==0) {
		System.out.println("Ya no hay producto");
			}else {
				
				do {
					System.out.println("Ingrese el dinero");
					
					Scanner bolsa = new Scanner (System.in);
					Dinero += bolsa.nextDouble();
					
					System.out.println("Quiere ingresar mas dinero?");
					Eleccion = bolsa.nextBoolean();
					} while (Eleccion  == true);
					
					if (Dinero < producto.getPrecio() ) {
						System.out.println("Dinero insuficiente");						
					} else {
						 System.out.println("Su producto " + producto.getNombredelproducto());
						 System.out.println("Su cambio de: " + (Dinero-producto.getPrecio()));
			
			}
				}
			}else {
			System.out.println("Producto no encontrado");
			
		}
		
	}
	
	
	
	
	
	
}