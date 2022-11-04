package com;

public class Producto {
	private String idProducto;
	private double precio;
	private int cantProducto;
	
	public Producto() {
		
	}

	public Producto(String idProducto, double precio, int cantProducto) {
		super();
		this.idProducto = idProducto;
		this.precio = precio;
		this.cantProducto = cantProducto;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantProducto() {
		return cantProducto;
	}

	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", precio=" + precio + ", cantProducto=" + cantProducto + "]";
	}

	

	
}
