package com;

public class Navaja {
	
	String tipo;
	String material;
	int tama�o;
	
	public Navaja() {
		
	}

	public Navaja(String tipo, String material, int tama�o) {
		
		this.tipo = tipo;
		this.material = material;
		this.tama�o = tama�o;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Navaja [tipo=" + tipo + ", material=" + material + ", tama�o=" + tama�o + "]";
	}
	
	

}