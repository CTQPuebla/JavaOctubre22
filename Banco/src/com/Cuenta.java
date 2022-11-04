package com;

public class Cuenta {
	
	//numcuenta, saldo, nip, min, max, tipo
	
	String numCuenta;
	double saldoDisponible;
	String nip;
	double min;
	double max;
	String tipoCuenta;
	
	
	
	public Cuenta() {
		
	}
	
	
	public Cuenta(String numCuenta, double saldoDisponible, String nip, double min, double max,
			String tipoCuenta) {
		this.numCuenta = numCuenta;
		this.saldoDisponible = saldoDisponible;
		this.nip = nip;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldoDisponible=" + saldoDisponible + ", nip=" + nip + ", min="
				+ min + ", max=" + max + ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	
	
	
}
