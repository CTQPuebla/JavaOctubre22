package com;

public class Navaja {

	int largo;
	String material;
	boolean punta;
	
	
	public Navaja(){
		
	}


	public Navaja(int largo, String material, boolean punta) {
		super();
		this.largo = largo;
		this.material = material;
		this.punta = punta;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public boolean isPunta() {
		return punta;
	}


	public void setPunta(boolean punta) {
		this.punta = punta;
	}


	@Override
	public String toString() {
		return "Navaja [largo=" + largo + ", material=" + material + ", punta=" + punta + "]";
	}
	
	
	
}
