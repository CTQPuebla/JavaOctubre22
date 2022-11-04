package com;

public abstract class Calculadora {
	
	private String precio;
	private String tama�o;
	private String modelo;
	private String color;
	
	public Calculadora() {
		
	}

	public Calculadora(String precio, String tama�o, String modelo, String color) {
		
		this.precio = precio;
		this.tama�o = tama�o;
		this.modelo = modelo;
		this.color = color;
	}
	




	public String getPrecio() {
		return precio;
	}




	public void setPrecio(String precio) {
		this.precio = precio;
	}




	public String getTama�o() {
		return tama�o;
	}




	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Calculadora [precio=" + precio + ", tama�o=" + tama�o + ", modelo=" + modelo + ", color=" + color + "]";
	}




	public abstract void sumar();
	
	
	public abstract void restar();
		
	
	public abstract void multiplicar();
		
		
	public abstract void dividir(); 
	
	public abstract void cuadrado();
	
	public abstract void exponente();
	
	public abstract void raiz();
		
		
	
	
}
