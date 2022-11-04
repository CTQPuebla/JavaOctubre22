package com;

public class Laptop {
	
	String marca;
	String precio;
	String modelo;
	String color;
	
	RAM ram;
	Almacenamiento alm;
	Procesador cpu;
	
	public Laptop() {
		
	}

	public Laptop(String marca, String precio, String modelo, String color, RAM ram, Almacenamiento alm,
			Procesador cpu) {
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
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

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + ", ram="
				+ ram + ", alm=" + alm + ", cpu=" + cpu + "]";
	}

	
	
}
