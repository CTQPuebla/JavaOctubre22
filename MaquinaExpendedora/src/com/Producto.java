package com;

public class Producto {
	
	private String nombredelproducto;
	private String codigodeid;
	private double precio;
	private int existencia;
	
	
	public Producto () {
		
	}


	


	public Producto(String nombredelproducto, String codigodeid, double precio, int existencia) {
		super();
		this.nombredelproducto = nombredelproducto;
		this.codigodeid = codigodeid;
		this.precio = precio;
		this.existencia = existencia;
	}





	public String getNombredelproducto() {
		return nombredelproducto;
	}





	public void setNombredelproducto(String nombredelproducto) {
		this.nombredelproducto = nombredelproducto;
	}





	public String getCodigodeid() {
		return codigodeid;
	}





	public void setCodigodeid(String codigodeid) {
		this.codigodeid = codigodeid;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public int getExistencia() {
		return existencia;
	}





	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}





	@Override
	public String toString() {
		return "Producto [nombredelproducto=" + nombredelproducto + ", codigodeid=" + codigodeid + ", precio=" + precio
				+ ", existencia=" + existencia + "]";
	}



	

}
