package com;

public class Tijeras {
	
	String material;
	int largo;
	String forma;
	String punta;
	
	public Tijeras() {
		
	}
	
	public Tijeras(String material, int largo, String forma, String punta) {
		this.material = material;
		this.largo = largo;
		this.forma = forma;
		this.punta = punta;
		
		
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

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
		this.punta = punta;
	}

	@Override
	public String toString() {
		return "Tijeras [material=" + material + ", largo=" + largo + ", forma=" + forma + ", punta=" + punta + "]";
	}
	
	

}
