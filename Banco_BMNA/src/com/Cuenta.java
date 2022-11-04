package com;

public class Cuenta {

	private String numerocuenta;
	private double saldo;
	private String nip;
	private double min;
	private double max;
	private String tipocuenta;
	
	
	public Cuenta() {
		
	}


	public Cuenta(String numerocuenta, double saldo,  String nip, double min, double max,
			String tipocuenta) {
		super();
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
	
		this.nip = nip;
		this.min = min;
		this.max = max;
		this.tipocuenta = tipocuenta;
	}


	public String getNumerocuenta() {
		return numerocuenta;
	}


	public void setNumerocuenta(String numerocuenta) {
		this.numerocuenta = numerocuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
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


	public String getTipocuenta() {
		return tipocuenta;
	}


	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}


	@Override
	public String toString() {
		return "Cuenta [numerocuenta=" + numerocuenta + ", saldo=" + saldo + ", nip="
				+ nip + ", min=" + min + ", max=" + max + ", tipocuenta=" + tipocuenta + "]";
	}
	
	
	
	
}
