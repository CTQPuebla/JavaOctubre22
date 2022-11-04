package com;

public class Navaja_Suiza {
	
	String color;
	double peso;
	String marca;
	String tipo;
	double precio;
	Navaja nava;
	Tijeras tije;
	Desarmador desa;
	
	public Navaja_Suiza() {
		
	}

	public Navaja_Suiza(String color, double peso, String marca, String tipo, double precio, Navaja nava, Tijeras tije,
			Desarmador desa) {
		this.color = color;
		this.peso = peso;
		this.marca = marca;
		this.tipo = tipo;
		this.precio = precio;
		this.nava = nava;
		this.tije = tije;
		this.desa = desa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Navaja getNava() {
		return nava;
	}

	public void setNava(Navaja nava) {
		this.nava = nava;
	}

	public Tijeras getTije() {
		return tije;
	}

	public void setTije(Tijeras tije) {
		this.tije = tije;
	}

	public Desarmador getDesa() {
		return desa;
	}

	public void setDesa(Desarmador desa) {
		this.desa = desa;
	}

	@Override
	public String toString() {
		return "Navaja_Suiza [color=" + color + ", peso=" + peso + ", marca=" + marca + ", tipo=" + tipo + ", precio="
				+ precio + ", nava=" + nava + ", tije=" + tije + ", desa=" + desa + "]";
	}
	
	
	
	

}
