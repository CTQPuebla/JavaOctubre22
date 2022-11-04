package com;

public class Destapador {
	
	String material;
	int largo;
	String forma;
	
	public Destapador() {
		
	}

	public Destapador(String material, int largo, String forma) {
		this.material = material;
		this.largo = largo;
		this.forma = forma;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Destapador [material=" + material + ", largo=" + largo + ", forma=" + forma + "]";
	}
	
	

}
