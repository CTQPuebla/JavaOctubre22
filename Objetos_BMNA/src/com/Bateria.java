package com;

public class Bateria {
	
	String caja;
	String bombo;
	String tomf;
	String tom1;
	String tom2;
	String crash;
	String hihat;
	String ride;
	String pedald;
	
	public Bateria () {
		
		
	}
	
	
	public Bateria (String bombo, String caja, String hihat) {
		this.bombo = bombo;
		this.caja =caja;
		this.hihat = hihat;
		
	}


	public Bateria(String caja, String bombo, String tomf, String tom1, String tom2, String crash, String hihat,
			String ride, String pedald) {
		this.caja = caja;
		this.bombo = bombo;
		this.tomf = tomf;
		this.tom1 = tom1;
		this.tom2 = tom2;
		this.crash = crash;
		this.hihat = hihat;
		this.ride = ride;
		this.pedald = pedald;
	}


	public String getCaja() {
		return caja;
	}


	public void setCaja(String caja) {
		this.caja = caja;
	}


	public String getBombo() {
		return bombo;
	}


	public void setBombo(String bombo) {
		this.bombo = bombo;
	}


	public String getTomf() {
		return tomf;
	}


	public void setTomf(String tomf) {
		this.tomf = tomf;
	}


	public String getTom1() {
		return tom1;
	}


	public void setTom1(String tom1) {
		this.tom1 = tom1;
	}


	public String getTom2() {
		return tom2;
	}


	public void setTom2(String tom2) {
		this.tom2 = tom2;
	}


	public String getCrash() {
		return crash;
	}


	public void setCrash(String crash) {
		this.crash = crash;
	}


	public String getHihat() {
		return hihat;
	}


	public void setHihat(String hihat) {
		this.hihat = hihat;
	}


	public String getRide() {
		return ride;
	}


	public void setRide(String ride) {
		this.ride = ride;
	}


	public String getPedald() {
		return pedald;
	}


	public void setPedald(String pedald) {
		this.pedald = pedald;
	}


	@Override
	public String toString() {
		return "Bateria [caja=" + caja + ", bombo=" + bombo + ", tomf=" + tomf + ", tom1=" + tom1 + ", tom2=" + tom2
				+ ", crash=" + crash + ", hihat=" + hihat + ", ride=" + ride + ", pedald=" + pedald + "]";
	}
	
	
	
	
	
	

}
