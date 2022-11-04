package com;

public class Producto {
	
	private String productos;
	private double precio;
	  
	  public Producto () {
	    
	  }

	public Producto(String productos, double precio) {
		super();
		this.productos = productos;
		this.precio = precio;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [productos=" + productos + ", precio=" + precio + "]";
	}
	  
	  
	 
	}