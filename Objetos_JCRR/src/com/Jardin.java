package com;

public class Jardin {
	
	String piso;
	String fuente;
	String arboles;
	String flores;
	String arbustos;
	String alberca;
	
	public Jardin() {
		
	}
	public Jardin(String piso, String fuente, String arboles, String flores, String arbustos, String alberca) {
		this.piso = piso;
		this.fuente = fuente;
		this.arboles = arboles;
		this.flores = flores;
		this.arbustos = arbustos;
		this.alberca = alberca;
		
	}
	public Jardin(String piso, String arboles, String arbustos) {
		this.piso = piso;
		this.arboles = arboles;
		this.arbustos = arbustos;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getArboles() {
		return arboles;
	}
	public void setArboles(String arboles) {
		this.arboles = arboles;
	}
	public String getFlores() {
		return flores;
	}
	public void setFlores(String flores) {
		this.flores = flores;
	}
	public String getArbustos() {
		return arbustos;
	}
	public void setArbustos(String arbustos) {
		this.arbustos = arbustos;
	}
	public String getAlberca() {
		return alberca;
	}
	public void setAlberca(String alberca) {
		this.alberca = alberca;
	}
	
	
	@Override
	public String toString() {
		return "Jardin [piso=" + piso + ", fuente=" + fuente + ", arboles=" + arboles + ", flores=" + flores
				+ ", arbustos=" + arbustos + ", alberca=" + alberca + "]";
	}
	
	
	

}
