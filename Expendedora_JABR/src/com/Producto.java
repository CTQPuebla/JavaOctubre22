package com;

public class Producto {
	
	
	private String producto;
	private double precio;
	private String tipo;
	
	public Producto() {
		
	}

	public Producto(String producto, double precio, String tipo) {
		this.producto = producto;
		this.precio = precio;
		this.tipo = tipo;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return tipo;
	}

	public void setCodigo(String tipo) {
		this.tipo = tipo;
	}
		

	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	

}
