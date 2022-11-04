package com;

import java.util.HashMap;
import java.util.Scanner;

public class Maquina {

	
	
	
	
	private int folio;
	
	
	
	
	
	


	public Maquina(int folio, HashMap<String, Producto> productos) {
		super();
		this.folio = folio;
		this.productos = productos;
	}


	private HashMap <String, Producto> productos;
	
	public Maquina ( HashMap <String,Producto>productos) {
		
		this.productos = productos;
	}
	
	
	
	public Producto buscarproducto (String codigodeid) {
		Producto producto =null;
		
		for (String key : this.productos.keySet()) {
			if (key.equals(codigodeid)) {
				
				producto = this.productos.get(key);
				
				if (producto.getExistencia() ==0) {
					System.out.println("Ya no tenemos producto");
				}
				
				break;
				
			}
		}
		
		return producto;
	}
	
	
	public void Comprar (String codigodeid) {
		
	
			if (this.buscarproducto(codigodeid)!=null) {
			
			Producto producto = this.buscarproducto(codigodeid);
			boolean Eleccion = true;
			double dinero = 0;
			
			if (producto.getExistencia()==0) {
			
		System.out.println("Ya no tenemos producto");
		
			
			
			
			}else {
				
				do {
					

					System.out.println("Ingrese su dinero");
					
					Scanner bolsa = new Scanner (System.in);
					dinero += bolsa.nextDouble();
					
					System.out.println("Quiere ingresar mas dinero?");
					Eleccion = bolsa.nextBoolean();
					
					
					
					} while (Eleccion  == true);
					
					
					if (dinero < producto.getPrecio() ) {
						System.out.println("Dinero insuficiente");
						
						
					} else {
						 System.out.println("Aqui tiene su producto " + producto.getNombredelproducto());
						 System.out.println("Su cambio es: " + (dinero-producto.getPrecio()));
					
						double cambio = dinero-producto.getPrecio();
						int moneda10 = 0;
						int moneda5 = 0;
						int moneda1 = 0;
						int monedac = 0;
						
						 while ((cambio - 10) >= 0) {
							 
						
						cambio -=10;
						moneda10  ++;
					
						
							 
						 }
						
						 System.out.println("Tiene " + moneda10 + " moneda/s de 10 en su cambio");
						 
						 while ((cambio - 5) >= 0) {
							 
								
								cambio -=5;
								moneda5  ++;
								
									
									 
								 }
								
						System.out.println("Tiene " + moneda5 + " moneda/s de 5 en su cambio");
						 
						 while ((cambio - 1) >= 0) {
							 
								
								cambio -=1;
								moneda1  ++;
									
								
									 
								 }
								
						System.out.println("Tiene " + moneda1 + " moneda/s de 1 en su cambio");
						 
								 while ((cambio - 0.5) >= 0) {
									 
										
										cambio -=0.5;
										monedac  ++;
										
											
											 
										 }
										
								System.out.println("Tiene " + monedac + " moneda/s de 0.5 en su cambio");
						 
						 
						 
					}
			
			}
			} else {
			System.out.println("Producto no encontrado");
			
		}
		
	}
	
	
	
	
	
	
}
