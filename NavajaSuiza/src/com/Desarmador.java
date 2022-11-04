package com;

public class Desarmador {
	
	String punta;
	String material;
	int largo;
	String imantado;
	
	public Desarmador() {
		
	}

	public Desarmador(String punta, String material, int largo, String imantado) {
		this.punta = punta;
		this.material = material;
		this.largo = largo;
		this.imantado = imantado;
	}

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
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

	public String getImantado() {
		return imantado;
	}

	public void setImantado(String imantado) {
		this.imantado = imantado;
	}

	@Override
	public String toString() {
		return "Desarmador [punta=" + punta + ", material=" + material + ", largo=" + largo + ", imantado=" + imantado
				+ "]";
	}
	
	

}
