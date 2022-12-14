package com;

public class Procesador {
	
	String fabricante;
	String modelo;
	int nucleos;
	double velocidad;
	boolean vitualizacion;
	
	public Procesador () {
		
		
	}

	public Procesador(String fabricante, String modelo, int nucleos, double velocidad, boolean vitualizacion) {

		this.fabricante = fabricante;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.velocidad = velocidad;
		this.vitualizacion = vitualizacion;
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

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isVitualizacion() {
		return vitualizacion;
	}

	public void setVitualizacion(boolean vitualizacion) {
		this.vitualizacion = vitualizacion;
	}

	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", nucleos=" + nucleos + ", velocidad="
				+ velocidad + ", vitualizacion=" + vitualizacion + "]";
	}
	
	

}
