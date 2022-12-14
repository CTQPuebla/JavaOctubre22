package com;

public class Suiza {

	String marca;
	double precio;
	String color;
	
	Navaja nav;
	Destornillador des;
	Lima lim;
	
	public Suiza () {
		
	}

	public Suiza(String marca, double precio, String color, Navaja nav, Destornillador des, Lima lim) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.nav = nav;
		this.des = des;
		this.lim = lim;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Navaja getNav() {
		return nav;
	}

	public void setNav(Navaja nav) {
		this.nav = nav;
	}

	public Destornillador getDes() {
		return des;
	}

	public void setDes(Destornillador des) {
		this.des = des;
	}

	public Lima getLim() {
		return lim;
	}

	public void setLim(Lima lim) {
		this.lim = lim;
	}

	@Override
	public String toString() {
		return "Suiza [marca=" + marca + ", precio=" + precio + ", color=" + color + ", nav=" + nav + ", des=" + des
				+ ", lim=" + lim + "]";
	}
	
	
	
}
