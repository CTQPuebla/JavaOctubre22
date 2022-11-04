package com;

public class Laptop_hfji {
	//Atributos
	//la mayoria son privados (codigo empresarial)
	String marca;
	String precio;
	String modelo;
	String color;
	
	RAM_hfji ram;
	Almacenamiento_hfji alm;
	Procesador_hfji cpu;
	
	public Laptop_hfji() {
		
	}

	public Laptop_hfji(String marca, String precio, String modelo, String color, RAM_hfji ram, Almacenamiento_hfji alm,
			Procesador_hfji cpu) {
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

	public RAM_hfji getRam() {
		return ram;
	}

	public void setRam(RAM_hfji ram) {
		this.ram = ram;
	}

	public Almacenamiento_hfji getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento_hfji alm) {
		this.alm = alm;
	}

	public Procesador_hfji getCpu() {
		return cpu;
	}

	public void setCpu(Procesador_hfji cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop_hfji [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color
				+ ", ram=" + ram + ", alm=" + alm + ", cpu=" + cpu + "]";
	}



	
	
	
}