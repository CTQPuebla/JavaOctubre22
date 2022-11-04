package com;

public class Almacenamiento {
	
	String tipo;
	double caapcidad;
	String marca;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String tipo, double caapcidad, String marca) {
		this.tipo = tipo;
		this.caapcidad = caapcidad;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCaapcidad() {
		return caapcidad;
	}

	public void setCaapcidad(double caapcidad) {
		this.caapcidad = caapcidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", caapcidad=" + caapcidad + ", marca=" + marca + "]";
	}
	
	

}
