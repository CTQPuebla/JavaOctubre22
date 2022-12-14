package com;

public class Lima {
	
	int calibre;
	int tamaño;
	String material;
	int grosor;
	
	public Lima () {
		
	}

	public Lima(int calibre, int tamaño, String material, int grosor) {
		super();
		this.calibre = calibre;
		this.tamaño = tamaño;
		this.material = material;
		this.grosor = grosor;
	}

	public int getCalibre() {
		return calibre;
	}

	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	@Override
	public String toString() {
		return "Lima [calibre=" + calibre + ", tamaño=" + tamaño + ", material=" + material + ", grosor=" + grosor
				+ "]";
	}
	
	

}
