package com;

public abstract class Calculadora {
	
	private String modelo;
	private double precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String modelo, double precio) {
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	//Parte Abstracta
	
	public abstract double sumar(int a, int b);
	public abstract double sumar(double a, int b);
	public abstract double restar(int a, int b);
	public abstract double multiplicar(int a, int b);
	public abstract double dividir(int a, int b);

	
}
