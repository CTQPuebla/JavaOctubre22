package com;

public abstract class Calculadora {
	
	private String marca;
	private String pantalla;
	private String botones;
	private String carcasa;
	
	public Calculadora () {
		
	}
	
	
	public void sumar (double numero1, double numero2) {
		System.out.println(numero1 + numero2);
	}
	
	
	public void restar (double numero1, double numero2) {
		System.out.println(numero1 - numero2);

	}
	
	public void multiplicar (double numero1, double numero2) {
		System.out.println(numero1 * numero2);
	}
	
	public void dividir (double numero1, double numero2) {
		if (numero2 > 0) {
			System.out.println(numero1 / numero2);

		}else { 
			System.out.println("No se puede dividir entre cero");

		}
	}

public abstract void poten (double numero1, double numero2);
public abstract void raizc (double numero1);
public abstract void trigo();


public Calculadora(String marca, String pantalla, String botones, String carcasa) {
	super();
	this.marca = marca;
	this.pantalla = pantalla;
	this.botones = botones;
	this.carcasa = carcasa;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getPantalla() {
	return pantalla;
}


public void setPantalla(String pantalla) {
	this.pantalla = pantalla;
}


public String getBotones() {
	return botones;
}


public void setBotones(String botones) {
	this.botones = botones;
}


public String getCarcasa() {
	return carcasa;
}


public void setCarcasa(String carcasa) {
	this.carcasa = carcasa;
}


@Override
public String toString() {
	return "Calculadora [marca=" + marca + ", pantalla=" + pantalla + ", botones=" + botones + ", carcasa=" + carcasa
			+ "]";
}
	


	

}
