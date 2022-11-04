package com;

public class Ram {
	
	int tama�o;
	String fabricante;
	double frecuencia;
	String tipo;
	
	public Ram() {
		
	}

	public Ram(int tama�o, String fabricante, double frecuencia, String tipo) {
	
		this.tama�o = tama�o;
		this.fabricante = fabricante;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ram [tama�o=" + tama�o + ", fabricante=" + fabricante + ", frecuencia=" + frecuencia + ", tipo=" + tipo
				+ "]";
	}
	
	
	

}
