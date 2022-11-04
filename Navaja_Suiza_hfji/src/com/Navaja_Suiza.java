package com;

public class Navaja_Suiza {
	
	String color;
	String marca;
	double precio;
	
	Navaja navaja;
	Destornillador dest;
	Tijeras tij;
	
	public Navaja_Suiza() {
		
	}

	public Navaja_Suiza(String color, String marca, double precio, Navaja navaja, Destornillador dest, Tijeras tij) {
		
		this.color = color;
		this.marca = marca;
		this.precio = precio;
		this.navaja = navaja;
		this.dest = dest;
		this.tij = tij;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public Navaja getNavaja() {
		return navaja;
	}

	public void setNavaja(Navaja navaja) {
		this.navaja = navaja;
	}

	public Destornillador getDest() {
		return dest;
	}

	public void setDest(Destornillador dest) {
		this.dest = dest;
	}

	public Tijeras getTij() {
		return tij;
	}

	public void setTij(Tijeras tij) {
		this.tij = tij;
	}

	@Override
	public String toString() {
		return "Navaja_Suiza [color=" + color + ", marca=" + marca + ", precio=" + precio + ", navaja=" + navaja
				+ ", dest=" + dest + ", tij=" + tij + "]";
	}
	
}