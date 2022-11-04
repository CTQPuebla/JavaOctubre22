package com;

import java.util.HashMap;
import java.util.Scanner;

public class Maquina_expendedora {
	
	private double cuenta1=0;
	Scanner entrada = new Scanner(System.in);
	
	private HashMap<String, Producto> productos;
	
	public Maquina_expendedora( HashMap<String, Producto> producto) {
		
		this.productos = producto;
	}
	
	public double getCuenta() {
		return cuenta1;
	}
	
	public double Ponercredito() {
		int terminar = 0;
		double dinero=0;
		
		do {
			System.out.println("Porfavor, ingresa las monedas o billetes, una en una: ");
			dinero=entrada.nextInt();
			if (dinero == 0.5 || dinero == 1 || dinero == 2 || dinero== 5 || dinero== 10 || dinero==20 || dinero==50 || dinero == 100 || dinero==200) {
						cuenta1= cuenta1+dinero;
			}else {
				
				System.out.println("Lo siento, el elemento ingresado no es dinero");
			}
			System.out.println("Desea ingresar mas dinero?  0=si 1=no");
			terminar = entrada.nextInt();
			}while(terminar==0);
		
		return cuenta1; 
		
	}
	
	
	
	
	public Producto buscarProducto(String codigo) {
		Producto cuenta = null;
		for (String key : this.productos.keySet()) {
			try {
				if(key.equals(codigo)) {
					cuenta = this.productos.get(key);
					//System.out.println("Producto encontrado");
					break;
				}
				
			}catch(Exception e) {
				
			}
			
		}
		System.out.println("Elemento no encontrado");
		return null;
	}
	
	
	public void Verificacion_credito( String codigo) {
		Producto cuenta2= null;
		double cuenta = 0;
		int terminar=0;
		try {
			cuenta = this.buscarProducto(codigo).getPrecio();
			if(cuenta<=cuenta1) {
				System.out.println("Saldo suficiente, en un momento te entregamos tu producto");
				cuenta2 = this.productos.get(codigo);
				System.out.println(cuenta2);
				cuenta2.setCantidad(cuenta2.getCantidad()-1);
			
			}else {
				System.out.println("Saldo insuficiente");
	
				}
		}catch(Exception e) {
		
			
		}
		
	}
	
	public void Mostrar_saldoactual(String codigo) {
		Producto cuenta2 = null;
		double cuenta = 0;
		try {
			cuenta = this.buscarProducto(codigo).getPrecio();
			if(cuenta<=cuenta1) {
				System.out.println("Su saldo es de: " + (cuenta1-cuenta));
				cuenta1= cuenta1-cuenta;
			}else {
				
				System.out.println(" ");
		
				}
			
		}catch(Exception e) {
			
		}
		
	
		
	}
	
	
	public void Entrega_cambio(String codigo) {
		Producto cuenta2 = null;
		double cuenta = 0;
		try {
			cuenta = this.buscarProducto(codigo).getPrecio();
			System.out.println("Su cambio es de: " + (cuenta1));
			cuenta2 = this.productos.get(codigo);
			System.out.println(cuenta2);
		}catch(Exception e) {
			
		}
			
	}
	

	
	

}
