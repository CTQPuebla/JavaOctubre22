package com;

public class Cal_Cientifica extends Calculadora implements IMedicina {
	
	
	public void suma_imaginarios() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando el coseno...");
	}
	public void resta_imaginarios() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando el seno...");
	}
	public void division_imaginarios() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando la tangente...");
	}
	
	String tapa;
	String num_teclas;
	String num_funciones;
	
	public Cal_Cientifica() {
		
	}
	public Cal_Cientifica(String tarjeta_madre, String carga, String pantalla, String material, String marca,
			String tapa, String num_teclas, String num_funciones) {
		super(tarjeta_madre, carga, pantalla, material, marca);
		this.tapa = tapa;
		this.num_teclas = num_teclas;
		this.num_funciones = num_funciones;
	}
	public String getTapa() {
		return tapa;
	}
	public void setTapa(String tapa) {
		this.tapa = tapa;
	}
	public String getNum_teclas() {
		return num_teclas;
	}
	public void setNum_teclas(String num_teclas) {
		this.num_teclas = num_teclas;
	}
	public String getNum_funciones() {
		return num_funciones;
	}
	public void setNum_funciones(String num_funciones) {
		this.num_funciones = num_funciones;
	}
	@Override
	public String toString() {
		return "Cal_Cientifica [tapa=" + tapa + ", num_teclas=" + num_teclas + ", num_funciones=" + num_funciones
				+ ", getTarjeta_madre()=" + getTarjeta_madre() + ", getCarga()=" + getCarga() + ", getPantalla()="
				+ getPantalla() + ", getMaterial()=" + getMaterial() + ", getMarca()=" + getMarca() + "]";
	}
	
	public void coseno() {
		System.out.println("El coseno es...");
	}
	public void seno() {
		System.out.println("El seno es...");
	}
	
	public void tangente() {
		System.out.println("La tangente es...");
	}
	
	@Override
	public void suma() {
		// TODO Auto-generated method stub
		System.out.println("Sumando...");
	}

	@Override
	public void resta() {
		// TODO Auto-generated method stub
		System.out.println("Resttando...");
	}
	
	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Dividiendo...");
	}
	
	@Override
	public double checarTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void tomarPresion() {
		// TODO Auto-generated method stub
		
	}
}
