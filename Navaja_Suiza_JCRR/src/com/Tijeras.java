package com;

public class Tijeras {
	String material;
	int largo;
	String mano;
	int peso;
	
	public Tijeras() {
		
	}

	public Tijeras(String material, int largo, String mano, int peso) {
		super();
		this.material = material;
		this.largo = largo;
		this.mano = mano;
		this.peso = peso;
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

	public String getMano() {
		return mano;
	}

	public void setMano(String mano) {
		this.mano = mano;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Tijeras [material=" + material + ", largo=" + largo + ", mano=" + mano + ", peso=" + peso + "]";
	}
	
	

}
