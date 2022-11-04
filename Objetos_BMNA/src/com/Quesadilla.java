package com;

public class Quesadilla {

	String base;
	String queso;
	String salsa;
	String frijol;
	String longaniza;
	String bistec;
	String aguacate;
	String chicharron;
	String papa;
	String cebolla;
	
	
	public Quesadilla () {
		
		
	}
	
	public Quesadilla (String base) {
		this.base = base ;
	}
	
	public Quesadilla (String base, String salsa) {
		this.base = base ;
		this.salsa = salsa;
	}


	public Quesadilla(String base, String queso, String salsa, String frijol, String longaniza, String bistec,
			String aguacate, String chicharron, String papa, String cebolla) {
		this.base = base;
		this.queso = queso;
		this.salsa = salsa;
		this.frijol = frijol;
		this.longaniza = longaniza;
		this.bistec = bistec;
		this.aguacate = aguacate;
		this.chicharron = chicharron;
		this.papa = papa;
		this.cebolla = cebolla;
	}
	
	
	
	public void setBase (String base) {
		this.base = base;
		
	}
	
	public String getBase () {
		
		return this.base;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getFrijol() {
		return frijol;
	}

	public void setFrijol(String frijol) {
		this.frijol = frijol;
	}

	public String getLonganiza() {
		return longaniza;
	}

	public void setLonganiza(String longaniza) {
		this.longaniza = longaniza;
	}

	public String getBistec() {
		return bistec;
	}

	public void setBistec(String bistec) {
		this.bistec = bistec;
	}

	public String getAguacate() {
		return aguacate;
	}

	public void setAguacate(String aguacate) {
		this.aguacate = aguacate;
	}

	public String getChicharron() {
		return chicharron;
	}

	public void setChicharron(String chicharron) {
		this.chicharron = chicharron;
	}

	public String getPapa() {
		return papa;
	}

	public void setPapa(String papa) {
		this.papa = papa;
	}

	public String getCebolla() {
		return cebolla;
	}

	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}

	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", queso=" + queso + ", salsa=" + salsa + ", frijol=" + frijol
				+ ", longaniza=" + longaniza + ", bistec=" + bistec + ", aguacate=" + aguacate + ", chicharron="
				+ chicharron + ", papa=" + papa + ", cebolla=" + cebolla + "]";
	}
	
	
	
	//radiografia 
	
	

	
}



