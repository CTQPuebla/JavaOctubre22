package com;

public abstract class Calculadora {
	
	private String precio;
	private String tamaño;
	private String modelo;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String precio, String tamaño, String modelo, String color) {
		
		this.precio = precio;
		this.tamaño = tamaño;
		this.modelo = modelo;
		this.color = color;
	}
	




	public String getPrecio() {
		return precio;
	}




	public void setPrecio(String precio) {
		this.precio = precio;
	}




	public String getTamaño() {
		return tamaño;
	}




	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Calculadora [precio=" + precio + ", tamaño=" + tamaño + ", modelo=" + modelo + ", color=" + color + "]";
	}




	public abstract void sumar();
	
	
	public abstract void restar();
		
	
	public abstract void multiplicar();
		
		
	public abstract void dividir(); 
	
	public abstract void cuadrado();
	
	public abstract void exponente();
	
	public abstract void raiz();
		
		
	
	
}
