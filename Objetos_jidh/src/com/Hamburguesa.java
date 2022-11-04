package com;

public class Hamburguesa {
	
	String pan;
	String carne;
	String vegetariana;
	String lechuga;
	String tomate;
	String catsup;
	String mostaza;
	String piña;
	String pepinillos;
	String salsa;
	
	public Hamburguesa() {
		
	}
	
	public Hamburguesa (String vegetariana) {
		this.vegetariana = vegetariana;
	}
	
	public Hamburguesa (String carne, String vegetariana) {
		this.carne = carne;
		this.vegetariana = vegetariana;
	}

	public Hamburguesa(String pan, String carne, String vegetariana, String lechuga, String tomate, String catsup,
			String mostaza, String piña, String pepinillos, String salsa) {
		this.pan = pan;
		this.carne = carne;
		this.vegetariana = vegetariana;
		this.lechuga = lechuga;
		this.tomate = tomate;
		this.catsup = catsup;
		this.mostaza = mostaza;
		this.piña = piña;
		this.pepinillos = pepinillos;
		this.salsa = salsa;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getVegetariana() {
		return vegetariana;
	}

	public void setVegetariana(String vegetariana) {
		this.vegetariana = vegetariana;
	}

	public String getLechuga() {
		return lechuga;
	}

	public void setLechuga(String lechuga) {
		this.lechuga = lechuga;
	}

	public String getTomate() {
		return tomate;
	}

	public void setTomate(String tomate) {
		this.tomate = tomate;
	}

	public String getCatsup() {
		return catsup;
	}

	public void setCatsup(String catsup) {
		this.catsup = catsup;
	}

	public String getMostaza() {
		return mostaza;
	}

	public void setMostaza(String mostaza) {
		this.mostaza = mostaza;
	}

	public String getPiña() {
		return piña;
	}

	public void setPiña(String piña) {
		this.piña = piña;
	}

	public String getPepinillos() {
		return pepinillos;
	}

	public void setPepinillos(String pepinillos) {
		this.pepinillos = pepinillos;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	@Override
	public String toString() {
		return "Hamburguesa [pan=" + pan + ", carne=" + carne + ", vegetariana=" + vegetariana + ", lechuga=" + lechuga
				+ ", tomate=" + tomate + ", catsup=" + catsup + ", mostaza=" + mostaza + ", piña=" + piña
				+ ", pepinillos=" + pepinillos + ", salsa=" + salsa + "]";
	}
	
	
	

}
