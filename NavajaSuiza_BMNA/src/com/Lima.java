package com;

public class Lima {
	
	int calibre;
	int tama�o;
	String material;
	int grosor;
	
	public Lima () {
		
	}

	public Lima(int calibre, int tama�o, String material, int grosor) {
		super();
		this.calibre = calibre;
		this.tama�o = tama�o;
		this.material = material;
		this.grosor = grosor;
	}

	public int getCalibre() {
		return calibre;
	}

	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Lima [calibre=" + calibre + ", tama�o=" + tama�o + ", material=" + material + ", grosor=" + grosor
				+ "]";
	}
	
	

}
