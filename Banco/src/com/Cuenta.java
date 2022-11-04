package com;

public class Cuenta {
	
	private String    usuario;
	private String num_cuenta;
	private double 		saldo;
	private String 		  nip;
	private double		  min;
	private double 		  max;
	private String tipo_cuenta;
	
	
	public Cuenta(String usuario, String num_cuenta, double saldo, String nip, double min, double max,
			String tipo_cuenta) {
		this.usuario = usuario;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
		this.nip = nip;
		this.min = min;
		this.max = max;
		this.tipo_cuenta = tipo_cuenta;
	}
	
	public Cuenta() {
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
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

	public String getTipo_cuenta() {
		return tipo_cuenta;
	}

	public void setTipo_cuenta(String tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", num_cuenta=" + num_cuenta + ", saldo=" + saldo + ", nip=" + nip
				+ ", min=" + min + ", max=" + max + ", tipo_cuenta=" + tipo_cuenta + "]";
	}
	
	
	
	
	
	
	

}
