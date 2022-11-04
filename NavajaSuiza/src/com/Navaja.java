package com;

public class Navaja {

	String tipo;
	int largo;
	String material;
	String punta;
	
	public Navaja() {
		
	}

	public Navaja(String tipo, int largo, String material, String punta) {		this.tipo = tipo;
		this.largo = largo;
		this.material = material;
		this.punta = punta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
		this.punta = punta;
	}

	@Override
	public String toString() {
		return "Navaja [tipo=" + tipo + ", largo=" + largo + ", material=" + material + ", punta=" + punta + "]";
	}
	
	
	
}
