package com;

public class Laptop {
	
	String marca;
	double precio;
	String modelo;
	String color;
	
	Ram ram;
	Almacenamiento alm;
	Procesador cpu;
	
	public Laptop() {
		
	}


	public Laptop(String marca, double precio, String modelo, String color, Ram ram, Almacenamiento alm,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.color = color;
		this.ram = ram;
		this.alm = alm;
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
		return "Laptop [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + ", ram="
				+ ram + ", alm=" + alm + ", cpu=" + cpu + "]";
	}

	
	
	

}
