package com;

import java.util.Date;

public class Ticket {
	
	
	private Date fehaHora;
	private String numCuenta;
	private double saldo;
	private String ubicacion;
	private int idCajero;
	private int folioOp=0;
	
	
	
	public Ticket(Date fehaHora, String numCuenta, double saldo, String ubicacion, int idCajero, int folioOp) {
		this.fehaHora = fehaHora;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.ubicacion = ubicacion;
		this.idCajero = idCajero;
		this.folioOp = folioOp;
	}
	
	public Ticket() {
		
	}

	public Date getFehaHora() {
		return fehaHora;
	}

	public void setFehaHora(Date fehaHora) {
		this.fehaHora = fehaHora;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
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

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	public int getFolioOp() {
		return folioOp;
	}

	public void setFolioOp(int folioOp) {
		this.folioOp = folioOp;
	}

	@Override
	public String toString() {
		return "Ticket [fehaHora=" + fehaHora + ", numCuenta=" + numCuenta + ", saldo=" + saldo + ", ubicacion="
				+ ubicacion + ", idCajero=" + idCajero + ", folioOp=" + folioOp + "]";
	}
	
	

}
