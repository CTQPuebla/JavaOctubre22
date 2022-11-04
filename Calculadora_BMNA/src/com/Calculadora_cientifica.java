package com;

public class Calculadora_cientifica extends Calculadora {
	
	private String tapa;
	private String doble_pantalla;
	private int botones_extra;
	
	public Calculadora_cientifica () {
		
	}

	@Override
	public void poten(double numero1, double numero2) {
		System.out.println(Math.pow(numero1, numero2));
		
	}

	@Override
	public void raizc (double numero1) {
		System.out.println(Math.sqrt(numero1));
		
	}

	@Override
	public void trigo() {
		System.out.println("Calculando cosas de trigonometria");
		
	}

	public Calculadora_cientifica(String marca, String pantalla, String botones, String carcasa, String tapa,
			String doble_pantalla, int botones_extra) {
		super(marca, pantalla, botones, carcasa);
		this.tapa = tapa;
		this.doble_pantalla = doble_pantalla;
		this.botones_extra = botones_extra;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
	}

	public String getDoble_pantalla() {
		return doble_pantalla;
	}

	public void setDoble_pantalla(String doble_pantalla) {
		this.doble_pantalla = doble_pantalla;
	}

	public int getBotones_extra() {
		return botones_extra;
	}

	public void setBotones_extra(int botones_extra) {
		this.botones_extra = botones_extra;
	}

	@Override
	public String toString() {
		return "Calculadora_cientifica [tapa=" + tapa + ", doble_pantalla=" + doble_pantalla + ", botones_extra="
				+ botones_extra + ", toString()=" + super.toString() + "]";
	}
	
	

	

}
