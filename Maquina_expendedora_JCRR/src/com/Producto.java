package com;

public class Producto {
	
	
	private String nombre;
	private double precio;
	private String codigo;
	private int  cantidad;
	
	
	public Producto() {
		
	}


	public Producto(String nombre, double precio, String codigo, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.cantidad = cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + ", cantidad=" + cantidad
				+ "]";
	}


	
	
	
	
	

}
