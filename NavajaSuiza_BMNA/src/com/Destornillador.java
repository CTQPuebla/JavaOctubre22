package com;

public class Destornillador {
	
	String punta;
	int largo;
	String material;
	boolean iman;
	
	public Destornillador () {
		
	}

	public Destornillador(String punta, int largo, String material, boolean iman) {
		super();
		this.punta = punta;
		this.largo = largo;
		this.material = material;
		this.iman = iman;
	}

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
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

	public boolean isIman() {
		return iman;
	}

	public void setIman(boolean iman) {
		this.iman = iman;
	}

	@Override
	public String toString() {
		return "Destornillador [punta=" + punta + ", largo=" + largo + ", material=" + material + ", iman=" + iman
				+ "]";
	}
	
	

}
