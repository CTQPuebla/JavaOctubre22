package com;

public class Laptop {
	
	String marca;
	double preio;
	String color;
	Ram ram;
	Almacenamiento alm;
	Procesador cpu;
	
	public Laptop() {
		
	}

	public Laptop(String marca, double preio, String color, Ram ram, Almacenamiento alm, Procesador cpu) {
		this.marca = marca;
		this.preio = preio;
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

	public double getPreio() {
		return preio;
	}

	public void setPreio(double preio) {
		this.preio = preio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
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
		return "Laptop [marca=" + marca + ", preio=" + preio + ", color=" + color + ", ram=" + ram + ", alm=" + alm
				+ ", cpu=" + cpu + "]";
	}
	
	
	

}
