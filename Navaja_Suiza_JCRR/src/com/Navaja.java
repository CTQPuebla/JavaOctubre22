package com;

public class Navaja {
	
	String material;
	int largo;
	String punta;
	
	
	public Navaja() {
		
	}


	public Navaja(String material, int largo, String punta) {
		super();
		this.material = material;
		this.largo = largo;
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


	public String getPunta() {
		return punta;
	}


	public void setPunta(String punta) {
		this.punta = punta;
	}


	@Override
	public String toString() {
		return "Navaja [material=" + material + ", largo=" + largo + ", punta=" + punta + "]";
	}
	
	
	
	
}
