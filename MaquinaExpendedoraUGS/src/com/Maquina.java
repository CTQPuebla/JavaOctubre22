package com;

import java.util.HashMap;

public class Maquina {

	HashMap<String, Producto> productos = new HashMap<String, Producto>();
	private double dineroIns=0;
	private double cambio=0;
	private int error=0;
	
	
	public Maquina() {
		
	}
	
	public Maquina(HashMap<String, Producto> productos) {
		super();
		this.productos = productos;
	}

	public Maquina(HashMap<String, Producto> productos, double dineroIns, double cambio, int error) {
		super();
		this.productos = productos;
		this.dineroIns = dineroIns;
		this.cambio = cambio;
		this.error = error;
	}

	public HashMap<String, Producto> getProductos() {
		return productos;
	}

	public void setProductos(HashMap<String, Producto> productos) {
		this.productos = productos;
	}

	public double getDineroIns() {
		return dineroIns;
	}

	public void setDineroIns(double dineroIns) {
		this.dineroIns = dineroIns;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}
	
	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public Producto buscarProducto(String idProducto) {
		Producto producto = null;
		for (String key : this.productos.keySet()) {
			if (key.equals(idProducto)) {
				producto=this.productos.get(key);
				break;
			}
		}
		return producto;
	}
	
	public void insertarDinero(double dineroIns) {
		this.dineroIns += dineroIns;
	}
	
	public Producto despacharProducto(String idProducto) {
		Producto productoDes = null;
		if (this.buscarProducto(idProducto) != null) {
			Producto producto = this.buscarProducto(idProducto);
			if (producto.getCantProducto()==0) {
				System.out.println("El producto se encuentra agotado");
				this.error = 1;
			} else if (this.dineroIns < producto.getPrecio()) {
				System.out.println("Saldo insuficiente");
				this.error = 2;
			} else {
				producto.setCantProducto(producto.getCantProducto()-1);
				productoDes = producto;
				this.cambio = this.dineroIns - producto.getPrecio();
				this.dineroIns = 0;
				this.error = 0;
			}
			return productoDes;
		} else {
			System.out.println("Ese producto no existe");
			return productoDes;
		}
	}
	
	
	
	
}
