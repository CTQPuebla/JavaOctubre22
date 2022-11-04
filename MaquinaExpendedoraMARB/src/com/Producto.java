package com;

public class Producto {
	
	//atributos de la maquina expendedora
	//producto, posicion, precio
	
	String Producto;
	double precio;
	
	
	public Producto () {
		
	}
// fields


	public Producto(String producto, double precio) {
		super();
		Producto = producto;
		this.precio = precio;
	}
	//gets and sets

	

	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//to string
	@Override
	public String toString() {
		return "Producto [Producto=" + Producto + ", precio=" + precio + "]";
	}
	
	


	

	
	
}
