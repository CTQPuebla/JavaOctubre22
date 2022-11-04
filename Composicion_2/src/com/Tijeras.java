package com;

public class Tijeras {
	
	String tipo;
	String material;
	int apertura;
	
	public Tijeras() {
		
	}

	public Tijeras(String tipo, String material, int apertura) {
		
		this.tipo = tipo;
		this.material = material;
		this.apertura = apertura;
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

	public int getApertura() {
		return apertura;
	}

	public void setApertura(int apertura) {
		this.apertura = apertura;
	}

	@Override
	public String toString() {
		return "Tijeras [tipo=" + tipo + ", material=" + material + ", apertura=" + apertura + "]";
	}

	
}
