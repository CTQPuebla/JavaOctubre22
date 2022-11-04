package com;

public class Productos {
	
	private String objeto;
	private String marca;
	private double precio;
	
	public Productos () {
		
	}

	public Productos(String objeto, String marca, double precio) {
		super();
		this.objeto = objeto;
		this.marca = marca;
		this.precio = precio;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [objeto=" + objeto + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	

}
