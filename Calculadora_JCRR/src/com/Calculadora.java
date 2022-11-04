package com;

public abstract class Calculadora {
	
	private String tarjeta_madre;
	private String carga;
	private String pantalla;
	private String material;
	private String marca;
	
	public Calculadora() {
		
	}

	public Calculadora(String tarjeta_madre, String carga, String pantalla, String material, String marca) {
		this.tarjeta_madre = tarjeta_madre;
		this.carga = carga;
		this.pantalla = pantalla;
		this.material = material;
		this.marca = marca;
	}

	public String getTarjeta_madre() {
		return tarjeta_madre;
	}

	public void setTarjeta_madre(String tarjeta_madre) {
		this.tarjeta_madre = tarjeta_madre;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Calculadora [tarjeta_madre=" + tarjeta_madre + ", carga=" + carga + ", pantalla=" + pantalla
				+ ", material=" + material + ", marca=" + marca + "]";
	}
	
	
	
	public abstract void suma(); 
	public abstract void resta(); 
	public abstract void division(); 

	
	
	
	
	

}
