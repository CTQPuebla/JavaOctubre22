package com;

public class Ram {
	
	int tamaño;
	String fabricante;
	double frecuencia;
	String tipo;
	
	public Ram() {
		
	}

	public Ram(int tamaño, String fabricante, double frecuencia, String tipo) {
	
		this.tamaño = tamaño;
		this.fabricante = fabricante;
		this.frecuencia = frecuencia;
		this.tipo = tipo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		return "Ram [tamaño=" + tamaño + ", fabricante=" + fabricante + ", frecuencia=" + frecuencia + ", tipo=" + tipo
				+ "]";
	}
	
	
	

}
