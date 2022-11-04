package com;

public class Laptop {
	
	String marca;
	double precio;
	String modelo;
	String color;
	Almacenamiento alm;
	Ram ram;
	Procesador cpu;
	
	public Laptop () {
		
	}

	
	
	
	public Laptop(String marca, double precio, String modelo, String color, Almacenamiento alm, Ram ram,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.color = color;
		this.alm = alm;
		this.ram = ram;
		this.cpu = cpu;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + ", alm="
				+ alm + ", ram=" + ram + ", cpu=" + cpu + "]";
	}

	
	

}
