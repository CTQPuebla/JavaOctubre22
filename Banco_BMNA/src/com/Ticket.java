package com;

import java.util.Date;

public class Ticket {

	private int foliodeoperaciones;
	private Date fechahota;
	private String numerodecuenta;
	private double saldo;
	private String ubicacion;
	private int idcajero;
	
	public Ticket () {
		
	}

	public Ticket(int foliodeoperaciones, Date fechahota, String numerodecuenta, double saldo, String ubicacion,
			int idcajero) {
		super();
		this.foliodeoperaciones = foliodeoperaciones;
		this.fechahota = fechahota;
		this.numerodecuenta = numerodecuenta;
		this.saldo = saldo;
		this.ubicacion = ubicacion;
		this.idcajero = idcajero;
	}

	public int getFoliodeoperaciones() {
		return foliodeoperaciones;
	}

	public void setFoliodeoperaciones(int foliodeoperaciones) {
		this.foliodeoperaciones = foliodeoperaciones;
	}

	public Date getFechahota() {
		return fechahota;
	}

	public void setFechahota(Date fechahota) {
		this.fechahota = fechahota;
	}

	public String getNumerodecuenta() {
		return numerodecuenta;
	}

	public void setNumerodecuenta(String numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [foliodeoperaciones=" + foliodeoperaciones + ", fechahota=" + fechahota + ", numerodecuenta="
				+ numerodecuenta + ", saldo=" + saldo + ", ubicacion=" + ubicacion + ", idcajero=" + idcajero + "]";
	}
	
	
	
}
