package com;

public class Desarmador {
	
	String material;
	int largo;
	String punta;
	int grosor;
	int dureza;
	String imantado;
	
	public Desarmador() {
		
	}

	public Desarmador(String material, int largo, String punta, int grosor, int dureza, String imantado) {
		super();
		this.material = material;
		this.largo = largo;
		this.punta = punta;
		this.grosor = grosor;
		this.dureza = dureza;
		this.imantado = imantado;
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

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public String getImantado() {
		return imantado;
	}

	public void setImantado(String imantado) {
		this.imantado = imantado;
	}

	@Override
	public String toString() {
		return "Desarmador [material=" + material + ", largo=" + largo + ", punta=" + punta + ", grosor=" + grosor
				+ ", dureza=" + dureza + ", imantado=" + imantado + "]";
	}
	
	
	
}
