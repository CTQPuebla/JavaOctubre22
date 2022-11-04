package com;

public class Procesador {
	
	String fabricante;
	String modelo;
	int nucleo;
	double velocidad;
	boolean virtualizacion;
	
	public Procesador() {
		
	}

	public Procesador(String fabricante, String modelo, int nucleo, double velocidad, boolean virtualizacion) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.nucleo = nucleo;
		this.velocidad = velocidad;
		this.virtualizacion = virtualizacion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleo() {
		return nucleo;
	}

	public void setNucleo(int nucleo) {
		this.nucleo = nucleo;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isVirtualizacion() {
		return virtualizacion;
	}

	public void setVirtualizacion(boolean virtualizacion) {
		this.virtualizacion = virtualizacion;
	}

	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", nucleo=" + nucleo + ", velocidad="
				+ velocidad + ", virtualizacion=" + virtualizacion + "]";
	}
	
	

}
